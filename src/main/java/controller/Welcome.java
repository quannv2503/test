package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/welcome")
public class Welcome {
    @RequestMapping("/hihi")
    public String hihi() {
        System.out.println("hihi");
        return "home";
    }

    @GetMapping(path = "haha")
    public String haha() {
        return "home";
    }

    @GetMapping("/hehe")
    public ModelAndView hehe(@PathVariable int id,@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("ngu", "ngu quá");
        modelAndView.addObject("name",name);
        return modelAndView;

    }

    @GetMapping(value = "/nana")
    public ModelAndView nana() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("ngu", "ngu quá mà");
        return modelAndView;
    }
}
