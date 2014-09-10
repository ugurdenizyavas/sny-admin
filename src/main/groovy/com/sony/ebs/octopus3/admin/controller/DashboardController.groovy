package com.sony.ebs.octopus3.admin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by TRBabalH on 04.09.2014.
 */
@Controller
@RequestMapping('/dashboard')
class DashboardController {

    @RequestMapping('/')
    public String index(Model model) {
        model.addAttribute("name", "Hüseyin BABAL");
        return "dashboard";
    }
}
