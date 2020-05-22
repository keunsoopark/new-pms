package com.pms.common.mngproject.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestController {

    private static final Logger Log = LoggerFactory.getLogger(ProjectRestController.class);

    // project information detail
    @RequestMapping(value = "/getprojectinfo", method = RequestMethod.GET)
    public String getProjectInfo(@RequestParam("projectCode") String projectCode) {


        return "done";
    }

    //project list and information search
    @RequestMapping(value = "/getprojectList", method = RequestMethod.GET)
    public String getProjectList() {

        return "done";
    }

    //project total spending time
    @RequestMapping(value = "/getRunTime", method = RequestMethod.GET)
    public String getProjectTotal() {

        return "done";
    }

    // insert project information
    @RequestMapping(value = "/setProjectInfo", method = RequestMethod.PUT)
    public void putProjectMaster() {

        //return "done";
    }

    //update project information
    @RequestMapping(value = "/updateProjectInfo", method = RequestMethod.POST)
    public String updateProjectInto() {

        return "done";
    }


}
