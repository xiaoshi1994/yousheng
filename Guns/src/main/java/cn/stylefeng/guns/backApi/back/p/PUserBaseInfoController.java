package cn.stylefeng.guns.backApi.back.p;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;

import cn.stylefeng.guns.modular.p.model.PUserBaseInfo;
import cn.stylefeng.guns.modular.p.service.IPUserBaseInfoService;

/**
 * 控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:16:46
 */
@Controller
@RequestMapping("/pUserBaseInfo")
public class PUserBaseInfoController extends BaseController {

    private String PREFIX = "/p/pUserBaseInfo/";

    @Autowired
    private IPUserBaseInfoService pUserBaseInfoService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "pUserBaseInfo.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/pUserBaseInfo_add")
    public String pUserBaseInfoAdd() {
        return PREFIX + "pUserBaseInfo_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/pUserBaseInfo_update/{pUserBaseInfoId}")
    public String pUserBaseInfoUpdate(@PathVariable Integer pUserBaseInfoId, Model model) {
        PUserBaseInfo pUserBaseInfo = pUserBaseInfoService.selectById(pUserBaseInfoId);
        model.addAttribute("item",pUserBaseInfo);
        LogObjectHolder.me().set(pUserBaseInfo);
        return PREFIX + "pUserBaseInfo_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return pUserBaseInfoService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PUserBaseInfo pUserBaseInfo) {
        pUserBaseInfoService.insert(pUserBaseInfo);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer pUserBaseInfoId) {
        pUserBaseInfoService.deleteById(pUserBaseInfoId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PUserBaseInfo pUserBaseInfo) {
        pUserBaseInfoService.updateById(pUserBaseInfo);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{pUserBaseInfoId}")
    @ResponseBody
    public Object detail(@PathVariable("pUserBaseInfoId") Integer pUserBaseInfoId) {
        return pUserBaseInfoService.selectById(pUserBaseInfoId);
    }
}
