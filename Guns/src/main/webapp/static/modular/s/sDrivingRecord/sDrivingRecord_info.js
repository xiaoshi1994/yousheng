/**
 * 初始化详情对话框
 */
var SDrivingRecordInfoDlg = {
    sDrivingRecordInfoData : {}
};

/**
 * 清除数据
 */
SDrivingRecordInfoDlg.clearData = function() {
    this.sDrivingRecordInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SDrivingRecordInfoDlg.set = function(key, val) {
    this.sDrivingRecordInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SDrivingRecordInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
SDrivingRecordInfoDlg.close = function() {
    parent.layer.close(window.parent.SDrivingRecord.layerIndex);
}

/**
 * 收集数据
 */
SDrivingRecordInfoDlg.collectData = function() {
    this
    .set('id')
    .set('pUId2')
    .set('userId')
    .set('driverId')
    .set('startDate')
    .set('receiptDate')
    .set('endDate')
    .set('startPlace')
    .set('endPlace')
    .set('status')
    .set('totlePrice')
    .set('discountPrice')
    .set('payPrice')
    .set('number')
    .set('remark')
    .set('creator')
    .set('created')
    .set('isDeleted')
    .set('type');
}

/**
 * 提交添加
 */
SDrivingRecordInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sDrivingRecord/add", function(data){
        Feng.success("添加成功!");
        window.parent.SDrivingRecord.table.refresh();
        SDrivingRecordInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sDrivingRecordInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
SDrivingRecordInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sDrivingRecord/update", function(data){
        Feng.success("修改成功!");
        window.parent.SDrivingRecord.table.refresh();
        SDrivingRecordInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sDrivingRecordInfoData);
    ajax.start();
}

$(function() {

});
