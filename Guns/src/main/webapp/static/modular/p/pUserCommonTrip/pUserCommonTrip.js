/**
 * 管理初始化
 */
var PUserCommonTrip = {
    id: "PUserCommonTripTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
PUserCommonTrip.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '用户id', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '开始地点', field: 'startPlace', visible: true, align: 'center', valign: 'middle'},
            {title: '结束地点', field: 'endPlace', visible: true, align: 'center', valign: 'middle'},
            {title: '备注', field: 'remark', visible: true, align: 'center', valign: 'middle'},
            {title: '是否启用,0不启用，1启用', field: 'isEnable', visible: true, align: 'center', valign: 'middle'},
            {title: '创建人', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '修改人', field: 'modifier', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '最后修改时间', field: 'modified', visible: true, align: 'center', valign: 'middle'},
            {title: '0正常，1删除', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
PUserCommonTrip.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        PUserCommonTrip.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
PUserCommonTrip.openAddPUserCommonTrip = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/pUserCommonTrip/pUserCommonTrip_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
PUserCommonTrip.openPUserCommonTripDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/pUserCommonTrip/pUserCommonTrip_update/' + PUserCommonTrip.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
PUserCommonTrip.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/pUserCommonTrip/delete", function (data) {
            Feng.success("删除成功!");
            PUserCommonTrip.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("pUserCommonTripId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
PUserCommonTrip.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    PUserCommonTrip.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = PUserCommonTrip.initColumn();
    var table = new BSTable(PUserCommonTrip.id, "/pUserCommonTrip/list", defaultColunms);
    table.setPaginationType("client");
    PUserCommonTrip.table = table.init();
});
