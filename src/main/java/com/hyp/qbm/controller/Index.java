package com.hyp.qbm.controller;

import com.hyp.qbm.exception.MyDefinitionException;
import com.hyp.qbm.exception.result.MyResultVO;
import com.hyp.qbm.pojo.model.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ApiOperation(value = "根据用户编号获取用户姓名")
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


    @ResponseBody
    @RequestMapping("/testJson")
    public MyResultVO<Object> testJson(String tid) {

        System.out.println(tid + "请求的数据是这个");

        Test test = new Test();
        test.setId(0);
        test.setName("何亚培");

        return MyResultVO.buildResult(MyResultVO.Status.SERVER_ERROR);
    }

    @ResponseBody
    @RequestMapping("/testJson2")
    public MyResultVO<Object> testJson2(@RequestBody @Validated Test test,
                                        BindingResult bindingResult
    ) {
        System.out.println(test.toString() + "请求的数据是这个");
        if (bindingResult.hasErrors()) {
            ObjectError next = bindingResult.getAllErrors().iterator().next();
            return MyResultVO.buildResult(MyResultVO.Status.SERVER_ERROR, next.getDefaultMessage());
        }


        return MyResultVO.buildResult(MyResultVO.Status.SERVER_ERROR);
    }


    @ResponseBody
    @RequestMapping("/testJson3")
    public MyResultVO<Object> testJson3(@RequestBody  Test test
    ) {

        System.out.println(test.toString() + "请求的数据是这个");
        return MyResultVO.buildResult(MyResultVO.Status.SERVER_ERROR);
    }


}