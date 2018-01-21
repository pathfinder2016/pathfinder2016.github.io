package com.oocl.ir4.dsh;

import com.oocl.ir4.dsh.service.MikeLog;
import com.oocl.ir4.dsh.service.SkillGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillGroupController {

    @Autowired
    private SkillGroupService skillGroupService;

    @MikeLog
    @RequestMapping(value = "/OOCL", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return skillGroupService.newSkillGroup("1");
    }

    public String helloWorldThorwException() {
        return skillGroupService.newSkillGroup();
    }
}
