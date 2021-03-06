package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ButtonController {

    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "CodeTutr");
        return "home";
    }

    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String handlePost(@RequestParam String action, Model m) {
        if( action.equals("save") ){
            //handle save
         }
         else if( action.equals("renew") ){
            //handle renew
         }
        m.addAttribute("name", "change");
        return "home";
    }
}