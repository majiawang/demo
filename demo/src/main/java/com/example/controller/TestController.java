package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 这里的@RestController相当于 @ResponseBody+@Controller
 * 使用@RestController 相当于使每个方法都加上了 @ResponseBody 注解
 * created by cfa 2018-11-06 下午 11:30
 **/
@RestController
public class TestController {
    /**
     * 这里的@GetMapping相当于@RequestMapping(value = "/hello", method = RequestMethod.GET)
     * created by cfa 2018-11-06 下午 11:29
     **/
    @GetMapping("hello")
    public String test(){
        return "i love java";
    }
}
