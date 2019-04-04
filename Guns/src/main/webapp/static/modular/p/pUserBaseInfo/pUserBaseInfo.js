/**
 * 管理初始化
 */
var PUserBaseInfo = {
    id: "PUserBaseInfoTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
PUserBaseInfo.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '用户编号', field: 'userSn', visible: true, align: 'center', valign: 'middle'},
            {title: '用户手机号', field: 'mobile', visible: true, align: 'center', valign: 'middle'},
            {title: '密码', field: 'password', visible: true, align: 'center', valign: 'middle'},
            {title: 'md5密码盐（考虑到APP端密码加密规则的兼容性，此值暂不使用）', field: 'salt', visible: true, align: 'center', valign: 'middle'},
            {title: '', field: 'nickname', visible: true, align: 'center', valign: 'middle'},
            {title: '头像', field: 'headThumb', visible: true, align: 'center', valign: 'middle'},
            {title: '位置数据', field: 'locationArea', visible: true, align: 'center', valign: 'middle'},
            {title: '地区', field: 'region', visible: true, align: 'center', valign: 'middle'},
            {title: '个人介绍', field: 'synopsis', visible: true, align: 'center', valign: 'middle'},
            {title: '车牌号', field: 'licensePlateNumber', visible: true, align: 'center', valign: 'middle'},
            {title: '状态：1：正常使用，2：等在认证: 3：被冻结', field: 'starts', visible: true, align: 'center', valign: 'middle'},
            {title: '身份证号码', field: 'identityCard', visible: true, align: 'center', valign: 'middle'},
            {title: '信用分', field: 'integral', visible: true, align: 'center', valign: 'middle'},
            {title: '用户身份，1：乘客；2：司机', field: 'identity', visible: true, align: 'center', valign: 'middle'},
            {title: '微信openid', field: 'openid', visible: true, align: 'center', valign: 'middle'},
            {title: '微信授权用户唯一标识', field: 'unionid', visible: true, align: 'center', valign: 'middle'},
            {title: 'app的openid', field: 'appOpenId', visible: true, align: 'center', valign: 'middle'},
            {title: '融云token', field: 'token', visible: true, align: 'center', valign: 'middle'},
            {title: '姓名', field: 'name', visible: true, align: 'center', valign: 'middle'},
            {title: '性别，1男，2女，保密', field: 'sex', visible: true, align: 'center', valign: 'middle'},
            {title: '用户佣金余额', field: 'money', visible: true, align: 'center', valign: 'middle'},
            {title: '我的邀请码', field: 'myInvite', visible: true, align: 'center', valign: 'middle'},
            {title: '推荐人', field: 'pid', visible: true, align: 'center', valign: 'middle'},
            {title: '层级数，0,1,2,3,4....', field: 'level', visible: true, align: 'center', valign: 'middle'},
            {title: '排序', field: 'sortNum', visible: true, align: 'center', valign: 'middle'},
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
PUserBaseInfo.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        PUserBaseInfo.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
PUserBaseInfo.openAddPUserBaseInfo = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/pUserBaseInfo/pUserBaseInfo_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
PUserBaseInfo.openPUserBaseInfoDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/pUserBaseInfo/pUserBaseInfo_update/' + PUserBaseInfo.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
PUserBaseInfo.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/pUserBaseInfo/delete", function (data) {
            Feng.success("删除成功!");
            PUserBaseInfo.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("pUserBaseInfoId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
PUserBaseInfo.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    PUserBaseInfo.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = PUserBaseInfo.initColumn();
    var table = new BSTable(PUserBaseInfo.id, "/pUserBaseInfo/list", defaultColunms);
    table.setPaginationType("client");
    PUserBaseInfo.table = table.init();
});
