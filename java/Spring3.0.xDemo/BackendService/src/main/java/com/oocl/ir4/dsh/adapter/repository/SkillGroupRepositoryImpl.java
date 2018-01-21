package com.oocl.ir4.dsh.adapter.repository;

import com.oocl.ir4.dsh.repository.SkillGroupRepository;
import org.springframework.stereotype.Component;

@Component
public class SkillGroupRepositoryImpl implements SkillGroupRepository {
    public String get() {
        return "HelloOOCL";
    }
}
