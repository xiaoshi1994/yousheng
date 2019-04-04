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

import cn.stylefeng.guns.modular.s.model.SDrivingTrajectory;
import cn.stylefeng.guns.modular.s.service.ISDrivingTrajectoryService;

/**
 * 轨迹控制器
 *
 * @author fengshuonan
 * @Date 2019-04-03 19:17:08
 */
@Controller
@RequestMapping("/sDrivingTrajectory")
public class SDrivingTrajectoryController extends BaseController {

    private String PREFIX = "/s/sDrivingTrajectory/";

    @Autowired
    private ISDrivingTrajectoryService sDrivingTrajectoryService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sDrivingTrajectory.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/sDrivingTrajectory_add")
    public String sDrivingTrajectoryAdd() {
        return PREFIX + "sDrivingTrajectory_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/sDrivingTrajectory_update/{sDrivingTrajectoryId}")
    public String sDrivingTrajectoryUpdate(@PathVariable Integer sDrivingTrajectoryId, Model model) {
        SDrivingTrajectory sDrivingTrajectory = sDrivingTrajectoryService.selectById(sDrivingTrajectoryId);
        model.addAttribute("item",sDrivingTrajectory);
        LogObjectHolder.me().set(sDrivingTrajectory);
        return PREFIX + "sDrivingTrajectory_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sDrivingTrajectoryService.selectList(null);
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SDrivingTrajectory sDrivingTrajectory) {
        sDrivingTrajectoryService.insert(sDrivingTrajectory);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sDrivingTrajectoryId) {
        sDrivingTrajectoryService.deleteById(sDrivingTrajectoryId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SDrivingTrajectory sDrivingTrajectory) {
        sDrivingTrajectoryService.updateById(sDrivingTrajectory);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{sDrivingTrajectoryId}")
    @ResponseBody
    public Object detail(@PathVariable("sDrivingTrajectoryId") Integer sDrivingTrajectoryId) {
        return sDrivingTrajectoryService.selectById(sDrivingTrajectoryId);
    }
}
