/**
 * 管理初始化
 */
var SDrivingRecord = {
    id: "SDrivingRecordTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
SDrivingRecord.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'pUId2', visible: true, align: 'center', valign: 'middle'},
            {title: '乘客用户id', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '司机用户id', field: 'driverId', visible: true, align: 'center', valign: 'middle'},
            {title: '开始时间', field: 'startDate', visible: true, align: 'center', valign: 'middle'},
            {title: '接单时间', field: 'receiptDate', visible: true, align: 'center', valign: 'middle'},
            {title: '结束时间', field: 'endDate', visible: true, align: 'center', valign: 'middle'},
            {title: '开始地点', field: 'startPlace', visible: true, align: 'center', valign: 'middle'},
            {title: '结束地点', field: 'endPlace', visible: true, align: 'center', valign: 'middle'},
            {title: '订单状态 0:已取消, 1:待接单，2:已接单 ，3：进行中 ，4：已完成 , 5:已评价 ,', field: 'status', visible: true, align: 'center', valign: 'middle'},
            {title: '总价格', field: 'totlePrice', visible: true, align: 'center', valign: 'middle'},
            {title: '优惠价格', field: 'discountPrice', visible: true, align: 'center', valign: 'middle'},
            {title: '实付价格', field: 'payPrice', visible: true, align: 'center', valign: 'middle'},
            {title: '人数', field: 'number', visible: true, align: 'center', valign: 'middle'},
            {title: '备注', field: 'remark', visible: true, align: 'center', valign: 'middle'},
            {title: '创建人', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '0正常，1删除', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'},
            {title: '发布类型：1 ：乘客发布  2：司机发布', field: 'type', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
SDrivingRecord.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        SDrivingRecord.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
SDrivingRecord.openAddSDrivingRecord = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/sDrivingRecord/sDrivingRecord_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
SDrivingRecord.openSDrivingRecordDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/sDrivingRecord/sDrivingRecord_update/' + SDrivingRecord.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
SDrivingRecord.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/sDrivingRecord/delete", function (data) {
            Feng.success("删除成功!");
            SDrivingRecord.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("sDrivingRecordId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
SDrivingRecord.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    SDrivingRecord.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = SDrivingRecord.initColumn();
    var table = new BSTable(SDrivingRecord.id, "/sDrivingRecord/list", defaultColunms);
    table.setPaginationType("client");
    SDrivingRecord.table = table.init();
});
