package com.sony.ebs.octopus3.admin.controller

import groovy.json.JsonBuilder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by TRBabalH on 04.09.2014.
 */
@Controller
@RequestMapping('/repository')
class RepositoryController {

    def repositories = [
            amazon: [
                [base: "http://localhost/amazon"],
                [
                    name: "Amazon Product Service",
                    endpoint: "/product/:product"
                ],
                [
                    name: "Amazon Delta Service",
                    endpoint: "/delta/:time"
                ],
                [
                    name: "Amazon Repository Service",
                    endpoint: "/repo/:locale"
                ],
            ]
    ]

    @RequestMapping(value = "/{repositoryName}", method = RequestMethod.GET)
    public String repositoryIndex(@PathVariable("repositoryName") String repositoryName,
                                  Model model) {
        JsonBuilder builder = new JsonBuilder()
        builder repositories
        builder
        model.addAttribute("repositories", builder);
        return "repository";
    }
}
