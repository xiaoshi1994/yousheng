package cn.stylefeng.guns.backApi.back.s;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;

import cn.stylefeng.guns.modular.s.model.SDrivingRecord;
import cn.stylefeng.guns.modular.s.service.ISDrivingRecordService;

/**
 * 行程控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:17:00
 */
@Controller
@RequestMapping("/sDrivingRecord")
public class SDrivingRecordController extends BaseController {

    private String PREFIX = "/s/sDrivingRecord/";

    @Autowired
    private ISDrivingRecordService sDrivingRecordService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sDrivingRecord.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/sDrivingRecord_add")
    public String sDrivingRecordAdd() {
        return PREFIX + "sDrivingRecord_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/sDrivingRecord_update/{sDrivingRecordId}")
    public String sDrivingRecordUpdate(@PathVariable Integer sDrivingRecordId, Model model) {
        SDrivingRecord sDrivingRecord = sDrivingRecordService.selectById(sDrivingRecordId);
        model.addAttribute("item",sDrivingRecord);
        LogObjectHolder.me().set(sDrivingRecord);
        return PREFIX + "sDrivingRecord_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sDrivingRecordService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SDrivingRecord sDrivingRecord) {
        sDrivingRecordService.insert(sDrivingRecord);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sDrivingRecordId) {
        sDrivingRecordService.deleteById(sDrivingRecordId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SDrivingRecord sDrivingRecord) {
        sDrivingRecordService.updateById(sDrivingRecord);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{sDrivingRecordId}")
    @ResponseBody
    public Object detail(@PathVariable("sDrivingRecordId") Integer sDrivingRecordId) {
        return sDrivingRecordService.selectById(sDrivingRecordId);
    }
}
