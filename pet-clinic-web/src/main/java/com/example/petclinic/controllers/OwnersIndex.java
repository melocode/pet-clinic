package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnersIndex {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfVets() {
        return "owners/index";
    }
}
