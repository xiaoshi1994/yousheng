/**
 * 初始化详情对话框
 */
var PUserCommonTripInfoDlg = {
    pUserCommonTripInfoData : {}
};

/**
 * 清除数据
 */
PUserCommonTripInfoDlg.clearData = function() {
    this.pUserCommonTripInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PUserCommonTripInfoDlg.set = function(key, val) {
    this.pUserCommonTripInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PUserCommonTripInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
PUserCommonTripInfoDlg.close = function() {
    parent.layer.close(window.parent.PUserCommonTrip.layerIndex);
}

/**
 * 收集数据
 */
PUserCommonTripInfoDlg.collectData = function() {
    this
    .set('id')
    .set('userId')
    .set('startPlace')
    .set('endPlace')
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
PUserCommonTripInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pUserCommonTrip/add", function(data){
        Feng.success("添加成功!");
        window.parent.PUserCommonTrip.table.refresh();
        PUserCommonTripInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pUserCommonTripInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
PUserCommonTripInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pUserCommonTrip/update", function(data){
        Feng.success("修改成功!");
        window.parent.PUserCommonTrip.table.refresh();
        PUserCommonTripInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pUserCommonTripInfoData);
    ajax.start();
}

$(function() {

});
