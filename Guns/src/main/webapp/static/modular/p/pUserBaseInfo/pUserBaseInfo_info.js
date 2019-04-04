/**
 * 初始化详情对话框
 */
var PUserBaseInfoInfoDlg = {
    pUserBaseInfoInfoData : {}
};

/**
 * 清除数据
 */
PUserBaseInfoInfoDlg.clearData = function() {
    this.pUserBaseInfoInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PUserBaseInfoInfoDlg.set = function(key, val) {
    this.pUserBaseInfoInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PUserBaseInfoInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
PUserBaseInfoInfoDlg.close = function() {
    parent.layer.close(window.parent.PUserBaseInfo.layerIndex);
}

/**
 * 收集数据
 */
PUserBaseInfoInfoDlg.collectData = function() {
    this
    .set('id')
    .set('userSn')
    .set('mobile')
    .set('password')
    .set('salt')
    .set('nickname')
    .set('headThumb')
    .set('locationArea')
    .set('region')
    .set('synopsis')
    .set('licensePlateNumber')
    .set('starts')
    .set('identityCard')
    .set('integral')
    .set('identity')
    .set('openid')
    .set('unionid')
    .set('appOpenId')
    .set('token')
    .set('name')
    .set('sex')
    .set('money')
    .set('myInvite')
    .set('pid')
    .set('level')
    .set('sortNum')
    .set('remark')
    .set('isEnable')
    .set('creator')
    .set('modifier')
    .set('created')
    .set('modified')
    .set('isDeleted');
}

/**
 * 提交添加
 */
PUserBaseInfoInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pUserBaseInfo/add", function(data){
        Feng.success("添加成功!");
        window.parent.PUserBaseInfo.table.refresh();
        PUserBaseInfoInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pUserBaseInfoInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
PUserBaseInfoInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pUserBaseInfo/update", function(data){
        Feng.success("修改成功!");
        window.parent.PUserBaseInfo.table.refresh();
        PUserBaseInfoInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pUserBaseInfoInfoData);
    ajax.start();
}

$(function() {

});
