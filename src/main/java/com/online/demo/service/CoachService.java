package com.online.demo.service;

import com.online.demo.model.CoachInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CoachService {

    public List<CoachInfo> getAll(){
        final List<CoachInfo> list = new ArrayList<>();
        list.add(new CoachInfo("2014年", 50L, 3L));
        list.add(new CoachInfo("2015年", 30L, 2L));
        list.add(new CoachInfo("2016年", 80L, 10L));
        list.add(new CoachInfo("2017年", 70L, 15L));
        list.add(new CoachInfo("2018年", 100L, 20L));
        list.add(new CoachInfo("2019年", 40L, 10L));
        return list;
    }
}
