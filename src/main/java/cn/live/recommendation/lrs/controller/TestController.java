package cn.live.recommendation.lrs.controller;

import cn.live.recommendation.lrs.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String test(int id){
        LOGGER.info("请求id是{}",id);
        String name = this.testService.test(id);
        LOGGER.info("查询出来的name是{}",name);
        return name;
    }

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
