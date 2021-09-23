package com.prger.proxy;

import com.prger.service.SkillService;

/**
 * Created by prgers on 2021/9/23 6:22 下午
 */
public class SkillServiceProxy extends SkillService {

    private SkillService target;

    public void setTarget(SkillService target) {
        this.target = target;
    }

    @Override
    public boolean save() {
        System.out.println("01-----");
        boolean save = target.save();
        System.out.println("02-----");
        return save;
    }
}
