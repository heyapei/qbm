package com.hyp.qbm.controller;

import com.hyp.qbm.exception.MyDefinitionException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 何亚培
 * @Version V1.0
 * @Date 2020/11/14 14:20
 * @Description: TODO
 */
@Controller
@Slf4j
@Api(value = "首页地址")
public class Index {

    @RequestMapping("/")
    @ApiOperation(value="根据用户编号获取用户姓名")
    public String redirect() {
        log.info("用户想要请求首页被跳转到www.yapei.cool");
        return "redirect:http://www.yapei.cool";
    }


    @RequestMapping("/testError")
    public String testError() {
        log.info("请求错误示例页面");
        try {
            Integer.parseInt("nihao");
        } catch (NumberFormatException e) {
            throw new MyDefinitionException("该地址请求失败");
        }
        return "redirect:http://www.yapei.cool";
    }

    @RequestMapping("/testIndex")
    public String testIndex() {
        log.info("请求首页示例页面");
        return "index";
    }

}