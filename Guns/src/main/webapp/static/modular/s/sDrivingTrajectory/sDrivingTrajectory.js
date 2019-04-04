/**
 * 管理初始化
 */
var SDrivingTrajectory = {
    id: "SDrivingTrajectoryTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
SDrivingTrajectory.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '行程记录id 就是订单id', field: 'driveId', visible: true, align: 'center', valign: 'middle'},
            {title: '经度', field: 'lngRat', visible: true, align: 'center', valign: 'middle'},
            {title: '纬度', field: 'latRat', visible: true, align: 'center', valign: 'middle'},
            {title: '创建人', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '0正常，1删除', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
SDrivingTrajectory.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        SDrivingTrajectory.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
SDrivingTrajectory.openAddSDrivingTrajectory = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/sDrivingTrajectory/sDrivingTrajectory_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
SDrivingTrajectory.openSDrivingTrajectoryDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/sDrivingTrajectory/sDrivingTrajectory_update/' + SDrivingTrajectory.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
SDrivingTrajectory.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/sDrivingTrajectory/delete", function (data) {
            Feng.success("删除成功!");
            SDrivingTrajectory.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("sDrivingTrajectoryId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
SDrivingTrajectory.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    SDrivingTrajectory.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = SDrivingTrajectory.initColumn();
    var table = new BSTable(SDrivingTrajectory.id, "/sDrivingTrajectory/list", defaultColunms);
    table.setPaginationType("client");
    SDrivingTrajectory.table = table.init();
});
