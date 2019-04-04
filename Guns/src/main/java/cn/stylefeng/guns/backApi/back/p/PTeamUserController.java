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

import cn.stylefeng.guns.modular.p.model.PTeamUser;
import cn.stylefeng.guns.modular.p.service.IPTeamUserService;

/**
 * 控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:16:36
 */
@Controller
@RequestMapping("/pTeamUser")
public class PTeamUserController extends BaseController {

    private String PREFIX = "/p/pTeamUser/";

    @Autowired
    private IPTeamUserService pTeamUserService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "pTeamUser.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/pTeamUser_add")
    public String pTeamUserAdd() {
        return PREFIX + "pTeamUser_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/pTeamUser_update/{pTeamUserId}")
    public String pTeamUserUpdate(@PathVariable Integer pTeamUserId, Model model) {
        PTeamUser pTeamUser = pTeamUserService.selectById(pTeamUserId);
        model.addAttribute("item",pTeamUser);
        LogObjectHolder.me().set(pTeamUser);
        return PREFIX + "pTeamUser_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return pTeamUserService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PTeamUser pTeamUser) {
        pTeamUserService.insert(pTeamUser);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer pTeamUserId) {
        pTeamUserService.deleteById(pTeamUserId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PTeamUser pTeamUser) {
        pTeamUserService.updateById(pTeamUser);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{pTeamUserId}")
    @ResponseBody
    public Object detail(@PathVariable("pTeamUserId") Integer pTeamUserId) {
        return pTeamUserService.selectById(pTeamUserId);
    }
}
