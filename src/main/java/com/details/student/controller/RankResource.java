package com.details.student.controller;

import com.details.student.model.Rank;

import com.details.student.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("ranks")
@CrossOrigin(origins = "*")
public class RankResource {
    @Autowired
    RankService rankService;

    @GetMapping
    public List<Rank> getRank() {
        return rankService.getRank();
    }

    @PostMapping
    public Boolean addRank(@RequestBody Rank rank) {

        try {
            System.out.println("add works");
            rankService.addRank(rank);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }




}
