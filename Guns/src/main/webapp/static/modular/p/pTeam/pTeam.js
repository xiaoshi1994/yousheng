/**
 * 管理初始化
 */
var PTeam = {
    id: "PTeamTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
PTeam.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '团队名称', field: 'name', visible: true, align: 'center', valign: 'middle'},
            {title: '队长id', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '总接单数量', field: 'answerCount', visible: true, align: 'center', valign: 'middle'},
            {title: '状态：1：待审核  2：正常运行  3：被锁定   4：审核驳回', field: 'status', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'modifier', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'modified', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'isEnable', visible: true, align: 'center', valign: 'middle'},
            {title: '总金额', field: 'money', visible: true, align: 'center', valign: 'middle'},
            {title: '总完成数量', field: 'finishAnswerCount', visible: true, align: 'center', valign: 'middle'},
            {title: '描述，包含审核失败的原因', field: 'descs', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
PTeam.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        PTeam.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
PTeam.openAddPTeam = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/pTeam/pTeam_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
PTeam.openPTeamDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/pTeam/pTeam_update/' + PTeam.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
PTeam.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/pTeam/delete", function (data) {
            Feng.success("删除成功!");
            PTeam.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("pTeamId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
PTeam.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    PTeam.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = PTeam.initColumn();
    var table = new BSTable(PTeam.id, "/pTeam/list", defaultColunms);
    table.setPaginationType("client");
    PTeam.table = table.init();
});
