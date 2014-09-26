package com.sony.ebs.octopus3.admin.controller

import com.sony.ebs.octopus3.admin.service.GraphService
import groovy.json.JsonBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by TRBabalH on 04.09.2014.
 */
@Controller
@RequestMapping('/report')
class ReportController {

    @Autowired
    private GraphService graphService

    @RequestMapping('/')
    public String index(Model model) {
        def root = [
                element: "product-report",
                data: [
                        [
                            y: "2014-09-19 14:00:00",
                            a: "100",
                            b: "90"
                        ],
                        [
                            y: "2014-09-19 14:30:00",
                            a: "80",
                            b: "110"
                        ],
                        [
                            "y": "2014-09-19 15:00:00",
                            "a": "40",
                            "b": "150"
                        ],
                        [
                                "y": "2014-09-19 15:30:00",
                                "a": "50",
                                "b": "140"
                        ],
                        [
                                "y": "2014-09-19 16:00:00",
                                "a": "60",
                                "b": "130"
                        ],
                        [
                                "y": "2014-09-19 16:30:00",
                                "a": "80",
                                "b": "110"
                        ],
                        [
                                "y": "2014-09-19 17:00:00",
                                "a": "100",
                                "b": "90"
                        ],
                        [
                                "y": "2014-09-19 17:30:00",
                                "a": "120",
                                "b": "70"
                        ],
                        [
                                "y": "2014-09-19 18:00:00",
                                "a": "140",
                                "b": "50"
                        ],
                        [
                                "y": "2014-09-19 18:30:00",
                                "a": "170",
                                "b": "20"
                        ],
                        [
                                "y": "2014-09-19 19:00:00",
                                "a": "180",
                                "b": "10"
                        ]
                ],
                xkey: "y",
                ykeys: ["a", "b"],
                labels: ["Success", "Error"]
        ]
        def builder = new JsonBuilder()
        builder(root)

        model.addAttribute("productReportData", builder.toString());
        return "report";
    }

    @RequestMapping('/amazon')
    public String amazonReport(Model model) {
        amazonGraphService.getGraphData()
    }
}
