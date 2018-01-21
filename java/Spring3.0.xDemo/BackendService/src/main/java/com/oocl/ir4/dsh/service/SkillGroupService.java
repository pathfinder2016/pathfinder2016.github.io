package com.oocl.ir4.dsh.service;

import com.oocl.ir4.dsh.repository.SkillGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillGroupService {
    @Autowired
    private SkillGroupRepository skillGroupRepository;

    public String newSkillGroup(String input) {
        return skillGroupRepository.get();
//        return "HelloOOCL";
    }

    public String newSkillGroup() {
        throw new IllegalArgumentException("done");
    }


}
