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

import cn.stylefeng.guns.modular.p.model.PTeam;
import cn.stylefeng.guns.modular.p.service.IPTeamService;

/**
 * 控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:16:28
 */
@Controller
@RequestMapping("/pTeam")
public class PTeamController extends BaseController {

    private String PREFIX = "/p/pTeam/";

    @Autowired
    private IPTeamService pTeamService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "pTeam.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/pTeam_add")
    public String pTeamAdd() {
        return PREFIX + "pTeam_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/pTeam_update/{pTeamId}")
    public String pTeamUpdate(@PathVariable Integer pTeamId, Model model) {
        PTeam pTeam = pTeamService.selectById(pTeamId);
        model.addAttribute("item",pTeam);
        LogObjectHolder.me().set(pTeam);
        return PREFIX + "pTeam_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return pTeamService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PTeam pTeam) {
        pTeamService.insert(pTeam);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer pTeamId) {
        pTeamService.deleteById(pTeamId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PTeam pTeam) {
        pTeamService.updateById(pTeam);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{pTeamId}")
    @ResponseBody
    public Object detail(@PathVariable("pTeamId") Integer pTeamId) {
        return pTeamService.selectById(pTeamId);
    }
}
