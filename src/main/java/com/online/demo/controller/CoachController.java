package com.online.demo.controller;

import com.online.demo.model.CoachInfo;
import com.online.demo.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author by sol on 2019/1/16.
 */
@RestController
@RequestMapping("/api/coach")
public class CoachController {

    private final CoachService coachService;

    @Autowired
    public CoachController( final CoachService theCoachService){
        this.coachService = theCoachService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<CoachInfo>> getCoach(){

        return ResponseEntity.ok(coachService.getAll());
    }
}
