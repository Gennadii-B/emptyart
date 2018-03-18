package com.some;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HWController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("greeting", "hello, how are you?)");
        return "anis/index";
    }
    @RequestMapping(value="/helloagain", method=RequestMethod.GET)
    public String sayHelloAgain(ModelMap model){
        model.addAttribute("greeting", "hello, again");
        return "welcome";
    }

}
