/**
 * 管理初始化
 */
var PTeamUser = {
    id: "PTeamUserTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
PTeamUser.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'pUId', visible: true, align: 'center', valign: 'middle'},
            {title: '司机id', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '团对id', field: 'teamId', visible: true, align: 'center', valign: 'middle'},
            {title: '创建人', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '修改人', field: 'modifier', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '修改时间', field: 'modified', visible: true, align: 'center', valign: 'middle'},
            {title: '是否删除 1 不删除 0：删除', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'},
            {title: '是否可用 1 可用   0：不可用', field: 'isEnable', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
PTeamUser.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        PTeamUser.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
PTeamUser.openAddPTeamUser = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/pTeamUser/pTeamUser_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
PTeamUser.openPTeamUserDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/pTeamUser/pTeamUser_update/' + PTeamUser.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
PTeamUser.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/pTeamUser/delete", function (data) {
            Feng.success("删除成功!");
            PTeamUser.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("pTeamUserId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
PTeamUser.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    PTeamUser.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = PTeamUser.initColumn();
    var table = new BSTable(PTeamUser.id, "/pTeamUser/list", defaultColunms);
    table.setPaginationType("client");
    PTeamUser.table = table.init();
});
