package controller;

import model.customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "test")
public class Test {
    @GetMapping(value = "/")
    public String getIndex(Model model) {
        return "index";
    }

    @GetMapping(value = "/sum")
    public String sum(Model model) {
        List<customer> list = new ArrayList<>();
        list.add(new customer(1,"kđk"));
        list.add(new customer(3,"kđkdd"));

        model.addAttribute("bien", list);
        return "test";
    }
}
