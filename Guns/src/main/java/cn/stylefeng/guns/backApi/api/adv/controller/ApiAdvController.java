package cn.stylefeng.guns.backApi.api.adv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.stylefeng.guns.backApi.api.adv.dto.AdvInfoDto;
import cn.stylefeng.guns.core.api.JsonResult;
import cn.stylefeng.guns.core.api.RequestBaseParam;
import cn.stylefeng.guns.core.api.ResultBaseEntity;
import cn.stylefeng.guns.modular.adv.model.PAdvAdInfo;
import cn.stylefeng.guns.modular.adv.service.IPAdvAdInfoService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * advInfo控制器
 *
 * @author shf
 * @Date 2018-12-27 11:05:49
 */
@RestController
@RequestMapping("/gunsApi/V1/adv")
@Api(value = "ApiAdvController", tags = {"广告管理接口"})
public class ApiAdvController extends BaseController {


    @Autowired
    private IPAdvAdInfoService pAdvAdInfoService;

    /**
     * 获取advInfo列表
     */
    @PostMapping(value = "/getList")
    @ApiOperation(value = "获取广告列表信息信息", notes = "模板")
    public ResultBaseEntity<List<PAdvAdInfo>> list(RequestBaseParam<AdvInfoDto> param) {
        return JsonResult.success(pAdvAdInfoService.selectList(null));
    }

}
