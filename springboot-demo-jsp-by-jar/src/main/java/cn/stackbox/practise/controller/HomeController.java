package cn.stackbox.practise.controller;

import cn.stackbox.practise.common.ResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "/home";
    }




    @RequestMapping("/test/json")
    @ResponseBody
    public ResultModel testJSON() {
        return ResultModel.SUCCESS(null);
    }



}
