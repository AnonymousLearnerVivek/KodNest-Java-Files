package com.kodnest._percentagecalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @GetMapping("/percentage")
    public String displayForm() {
        return "index";
    }
    @PostMapping("/calculate")
    public String calculatePercentage(@RequestParam int roll, @RequestParam String name, @RequestParam int m1,
                                      @RequestParam int m2, @RequestParam int m3, Model model) {
        double percent = (m1 + m2 + m3) / 3.0;
        model.addAttribute("rollNo", roll);
        model.addAttribute("name", name);
        model.addAttribute("marks1", m1);
        model.addAttribute("marks2", m2);
        model.addAttribute("marks3", m3);
        model.addAttribute("percentage", percent);

        return "result";

    }

}
