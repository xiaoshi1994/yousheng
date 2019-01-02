package cn.stylefeng.guns.backApi.back.adv;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.adv.model.PAdvAdInfo;
import cn.stylefeng.guns.modular.adv.service.IPAdvAdInfoService;

/**
 * advInfo控制器
 *
 * @author fengshuonan
 * @Date 2018-12-27 11:05:49
 */
@Controller
@RequestMapping("/pAdvAdInfo")
public class PAdvAdInfoController extends BaseController {

    private String PREFIX = "/adv/pAdvAdInfo/";

    @Autowired
    private IPAdvAdInfoService pAdvAdInfoService;

    /**
     * 跳转到advInfo首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "pAdvAdInfo.html";
    }

    /**
     * 跳转到添加advInfo
     */
    @RequestMapping("/pAdvAdInfo_add")
    public String pAdvAdInfoAdd() {
        return PREFIX + "pAdvAdInfo_add.html";
    }

    /**
     * 跳转到修改advInfo
     */
    @RequestMapping("/pAdvAdInfo_update/{pAdvAdInfoId}")
    public String pAdvAdInfoUpdate(@PathVariable Integer pAdvAdInfoId, Model model) {
        PAdvAdInfo pAdvAdInfo = pAdvAdInfoService.selectById(pAdvAdInfoId);
        model.addAttribute("item",pAdvAdInfo);
        LogObjectHolder.me().set(pAdvAdInfo);
        return PREFIX + "pAdvAdInfo_edit.html";
    }

    /**
     * 获取advInfo列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return pAdvAdInfoService.selectList(null);
    }

    /**
     * 新增advInfo
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PAdvAdInfo pAdvAdInfo) {
        pAdvAdInfoService.insert(pAdvAdInfo);
        return SUCCESS_TIP;
    }

    /**
     * 删除advInfo
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer pAdvAdInfoId) {
        pAdvAdInfoService.deleteById(pAdvAdInfoId);
        return SUCCESS_TIP;
    }

    /**
     * 修改advInfo
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PAdvAdInfo pAdvAdInfo) {
        pAdvAdInfoService.updateById(pAdvAdInfo);
        return SUCCESS_TIP;
    }

    /**
     * advInfo详情
     */
    @RequestMapping(value = "/detail/{pAdvAdInfoId}")
    @ResponseBody
    public Object detail(@PathVariable("pAdvAdInfoId") Integer pAdvAdInfoId) {
        return pAdvAdInfoService.selectById(pAdvAdInfoId);
    }
}
