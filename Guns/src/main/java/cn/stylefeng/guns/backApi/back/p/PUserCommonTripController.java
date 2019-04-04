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

import cn.stylefeng.guns.modular.p.model.PUserCommonTrip;
import cn.stylefeng.guns.modular.p.service.IPUserCommonTripService;

/**
 * 常用行程控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:16:53
 */
@Controller
@RequestMapping("/pUserCommonTrip")
public class PUserCommonTripController extends BaseController {

    private String PREFIX = "/p/pUserCommonTrip/";

    @Autowired
    private IPUserCommonTripService pUserCommonTripService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "pUserCommonTrip.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/pUserCommonTrip_add")
    public String pUserCommonTripAdd() {
        return PREFIX + "pUserCommonTrip_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/pUserCommonTrip_update/{pUserCommonTripId}")
    public String pUserCommonTripUpdate(@PathVariable Integer pUserCommonTripId, Model model) {
        PUserCommonTrip pUserCommonTrip = pUserCommonTripService.selectById(pUserCommonTripId);
        model.addAttribute("item",pUserCommonTrip);
        LogObjectHolder.me().set(pUserCommonTrip);
        return PREFIX + "pUserCommonTrip_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return pUserCommonTripService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PUserCommonTrip pUserCommonTrip) {
        pUserCommonTripService.insert(pUserCommonTrip);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer pUserCommonTripId) {
        pUserCommonTripService.deleteById(pUserCommonTripId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PUserCommonTrip pUserCommonTrip) {
        pUserCommonTripService.updateById(pUserCommonTrip);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{pUserCommonTripId}")
    @ResponseBody
    public Object detail(@PathVariable("pUserCommonTripId") Integer pUserCommonTripId) {
        return pUserCommonTripService.selectById(pUserCommonTripId);
    }
}
