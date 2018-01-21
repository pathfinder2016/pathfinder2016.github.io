package com.oocl.ir4.dsh.domain;

import java.util.List;

public class SkillGroupRoot {
    private SkillGroupName skillGroupName;
    private Supervisor supervisor;
    private SkillGroup parentGroup;

    public List<ActivityDefinition> getActivityDefinitions() {
        if (parentGroup == null) {
            //all
        }
        return parentGroup.getActivityDefinitions();
    }

}
