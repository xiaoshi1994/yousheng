/**
 * 初始化详情对话框
 */
var PTeamInfoDlg = {
    pTeamInfoData : {}
};

/**
 * 清除数据
 */
PTeamInfoDlg.clearData = function() {
    this.pTeamInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PTeamInfoDlg.set = function(key, val) {
    this.pTeamInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PTeamInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
PTeamInfoDlg.close = function() {
    parent.layer.close(window.parent.PTeam.layerIndex);
}

/**
 * 收集数据
 */
PTeamInfoDlg.collectData = function() {
    this
    .set('id')
    .set('name')
    .set('userId')
    .set('answerCount')
    .set('status')
    .set('creator')
    .set('modifier')
    .set('created')
    .set('modified')
    .set('isDeleted')
    .set('isEnable')
    .set('money')
    .set('finishAnswerCount')
    .set('descs');
}

/**
 * 提交添加
 */
PTeamInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pTeam/add", function(data){
        Feng.success("添加成功!");
        window.parent.PTeam.table.refresh();
        PTeamInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pTeamInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
PTeamInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pTeam/update", function(data){
        Feng.success("修改成功!");
        window.parent.PTeam.table.refresh();
        PTeamInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pTeamInfoData);
    ajax.start();
}

$(function() {

});
