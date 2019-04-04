/**
 * 初始化详情对话框
 */
var SDrivingTrajectoryInfoDlg = {
    sDrivingTrajectoryInfoData : {}
};

/**
 * 清除数据
 */
SDrivingTrajectoryInfoDlg.clearData = function() {
    this.sDrivingTrajectoryInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SDrivingTrajectoryInfoDlg.set = function(key, val) {
    this.sDrivingTrajectoryInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SDrivingTrajectoryInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
SDrivingTrajectoryInfoDlg.close = function() {
    parent.layer.close(window.parent.SDrivingTrajectory.layerIndex);
}

/**
 * 收集数据
 */
SDrivingTrajectoryInfoDlg.collectData = function() {
    this
    .set('id')
    .set('driveId')
    .set('lngRat')
    .set('latRat')
    .set('creator')
    .set('created')
    .set('isDeleted');
}

/**
 * 提交添加
 */
SDrivingTrajectoryInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sDrivingTrajectory/add", function(data){
        Feng.success("添加成功!");
        window.parent.SDrivingTrajectory.table.refresh();
        SDrivingTrajectoryInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sDrivingTrajectoryInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
SDrivingTrajectoryInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sDrivingTrajectory/update", function(data){
        Feng.success("修改成功!");
        window.parent.SDrivingTrajectory.table.refresh();
        SDrivingTrajectoryInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sDrivingTrajectoryInfoData);
    ajax.start();
}

$(function() {

});
