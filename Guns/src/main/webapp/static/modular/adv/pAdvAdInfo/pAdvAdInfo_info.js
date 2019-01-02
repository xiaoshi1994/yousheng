/**
 * 初始化advInfo详情对话框
 */
var PAdvAdInfoInfoDlg = {
    pAdvAdInfoInfoData : {}
};

/**
 * 清除数据
 */
PAdvAdInfoInfoDlg.clearData = function() {
    this.pAdvAdInfoInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PAdvAdInfoInfoDlg.set = function(key, val) {
    this.pAdvAdInfoInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
PAdvAdInfoInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
PAdvAdInfoInfoDlg.close = function() {
    parent.layer.close(window.parent.PAdvAdInfo.layerIndex);
}

/**
 * 收集数据
 */
PAdvAdInfoInfoDlg.collectData = function() {
    this
    .set('id')
    .set('adPositionId')
    .set('adSn')
    .set('name')
    .set('source')
    .set('type')
    .set('objectId')
    .set('startTime')
    .set('endTime')
    .set('mainTitle')
    .set('subHeading')
    .set('imageSrc')
    .set('imageAlt')
    .set('backgroundColor')
    .set('url')
    .set('status')
    .set('clickCount')
    .set('area')
    .set('isAll')
    .set('sortNum')
    .set('remark')
    .set('isEnable')
    .set('creator')
    .set('modifier')
    .set('created')
    .set('modified')
    .set('isDeleted')
    .set('goodsCateId')
    .set('isRelateGoodsCate');
}

/**
 * 提交添加
 */
PAdvAdInfoInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pAdvAdInfo/add", function(data){
        Feng.success("添加成功!");
        window.parent.PAdvAdInfo.table.refresh();
        PAdvAdInfoInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pAdvAdInfoInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
PAdvAdInfoInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/pAdvAdInfo/update", function(data){
        Feng.success("修改成功!");
        window.parent.PAdvAdInfo.table.refresh();
        PAdvAdInfoInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.pAdvAdInfoInfoData);
    ajax.start();
}

$(function() {

});
