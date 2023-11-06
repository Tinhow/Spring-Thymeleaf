package br.edu.ifpb.walter.spring1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("nome", "walter");
        System.out.println("**********************************************************");
        return  "hello";
    }

    @GetMapping("/hello-model")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello"); //nome do arquivo
        mv.addObject("nome","Lucas");
        return mv;
    }
}
