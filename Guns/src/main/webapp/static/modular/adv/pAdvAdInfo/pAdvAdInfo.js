/**
 * advInfo管理初始化
 */
var PAdvAdInfo = {
    id: "PAdvAdInfoTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
PAdvAdInfo.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '广告位置id', field: 'adPositionId', visible: true, align: 'center', valign: 'middle'},
            {title: '广告位编号', field: 'adSn', visible: true, align: 'center', valign: 'middle'},
            {title: '广告名称', field: 'name', visible: true, align: 'center', valign: 'middle'},
            {title: '数据来源', field: 'source', visible: true, align: 'center', valign: 'middle'},
            {title: '对象类型，0：无；1：产品；2：品牌店铺；3：外部链接', field: 'type', visible: true, align: 'center', valign: 'middle'},
            {title: '引用对象的id，', field: 'objectId', visible: true, align: 'center', valign: 'middle'},
            {title: '开始时间', field: 'startTime', visible: true, align: 'center', valign: 'middle'},
            {title: '结束时间', field: 'endTime', visible: true, align: 'center', valign: 'middle'},
            {title: '主标题', field: 'mainTitle', visible: true, align: 'center', valign: 'middle'},
            {title: '副标题', field: 'subHeading', visible: true, align: 'center', valign: 'middle'},
            {title: '图片', field: 'imageSrc', visible: true, align: 'center', valign: 'middle'},
            {title: '图片属性', field: 'imageAlt', visible: true, align: 'center', valign: 'middle'},
            {title: '背景颜色', field: 'backgroundColor', visible: true, align: 'center', valign: 'middle'},
            {title: '链接URL', field: 'url', visible: true, align: 'center', valign: 'middle'},
            {title: '状态，0：未开始；1：进行中；2：已结束', field: 'status', visible: true, align: 'center', valign: 'middle'},
            {title: '点击数', field: 'clickCount', visible: true, align: 'center', valign: 'middle'},
            {title: '区域编码', field: 'area', visible: true, align: 'center', valign: 'middle'},
            {title: '0:不是全部有效 1：全部有效', field: 'isAll', visible: true, align: 'center', valign: 'middle'},
            {title: '排序', field: 'sortNum', visible: true, align: 'center', valign: 'middle'},
            {title: '备注', field: 'remark', visible: true, align: 'center', valign: 'middle'},
            {title: '是否启用,0不启用，1启用', field: 'isEnable', visible: true, align: 'center', valign: 'middle'},
            {title: '创建人', field: 'creator', visible: true, align: 'center', valign: 'middle'},
            {title: '修改人', field: 'modifier', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'created', visible: true, align: 'center', valign: 'middle'},
            {title: '最后修改时间', field: 'modified', visible: true, align: 'center', valign: 'middle'},
            {title: '0正常，1删除', field: 'isDeleted', visible: true, align: 'center', valign: 'middle'},
            {title: '关联的一级商品分类ID', field: 'goodsCateId', visible: true, align: 'center', valign: 'middle'},
            {title: '是否关联商品分类', field: 'isRelateGoodsCate', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
PAdvAdInfo.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        PAdvAdInfo.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加advInfo
 */
PAdvAdInfo.openAddPAdvAdInfo = function () {
    var index = layer.open({
        type: 2,
        title: '添加advInfo',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/pAdvAdInfo/pAdvAdInfo_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看advInfo详情
 */
PAdvAdInfo.openPAdvAdInfoDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: 'advInfo详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/pAdvAdInfo/pAdvAdInfo_update/' + PAdvAdInfo.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除advInfo
 */
PAdvAdInfo.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/pAdvAdInfo/delete", function (data) {
            Feng.success("删除成功!");
            PAdvAdInfo.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("pAdvAdInfoId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询advInfo列表
 */
PAdvAdInfo.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    PAdvAdInfo.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = PAdvAdInfo.initColumn();
    var table = new BSTable(PAdvAdInfo.id, "/pAdvAdInfo/list", defaultColunms);
    table.setPaginationType("client");
    PAdvAdInfo.table = table.init();
});
