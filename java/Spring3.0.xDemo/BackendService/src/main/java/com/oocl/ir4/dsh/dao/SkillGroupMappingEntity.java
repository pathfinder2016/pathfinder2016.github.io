package com.oocl.ir4.dsh.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "SKILL_GROUP")
public class SkillGroupMappingEntity {
    @Id
    @Column(name = "SKG_ID")
    private String skillGroupId;

    @Column(name = "SKG_NAME")
    private String skillGroupName;

    @OneToMany
    private List<ActivityDefinitionMappingEntity> activityDefinitionMappingEntities;


    public List<ActivityDefinitionMappingEntity> getActivityDefinitionMappingEntities() {
        return activityDefinitionMappingEntities;
    }

    public String getSkillGroupId() {
        return skillGroupId;
    }

    public String getSkillGroupName() {
        return skillGroupName;
    }
}
