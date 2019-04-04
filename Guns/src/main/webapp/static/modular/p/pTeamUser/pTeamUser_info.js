/**
 * 初始化详情对话框
 */
var PTeamUserInfoDlg = {
    pTeamUserInfoData : {}
};

/**
 * 清除数据
 */
PTeamUserInfoDlg.clearData = function() {
    this.pTeamUserInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PTeamUserInfoDlg.set = function(key, val) {
    this.pTeamUserInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PTeamUserInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
PTeamUserInfoDlg.close = function() {
    parent.layer.close(window.parent.PTeamUser.layerIndex);
}

/**
 * 收集数据
 */
PTeamUserInfoDlg.collectData = function() {
    this
    .set('id')
    .set('pUId')
    .set('userId')
    .set('teamId')
    .set('creator')
    .set('modifier')
    .set('created')
    .set('modified')
    .set('isDeleted')
    .set('isEnable');
}

/**
 * 提交添加
 */
PTeamUserInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pTeamUser/add", function(data){
        Feng.success("添加成功!");
        window.parent.PTeamUser.table.refresh();
        PTeamUserInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pTeamUserInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
PTeamUserInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pTeamUser/update", function(data){
        Feng.success("修改成功!");
        window.parent.PTeamUser.table.refresh();
        PTeamUserInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pTeamUserInfoData);
    ajax.start();
}

$(function() {

});
