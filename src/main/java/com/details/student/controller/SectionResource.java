package com.details.student.controller;

import com.details.student.model.Rank;
import com.details.student.model.Section;
import com.details.student.service.RankService;
import com.details.student.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("sections")
@CrossOrigin(origins = "*")
public class SectionResource {
    @Autowired
    SectionService sectionService;

    @GetMapping
    public List<Section> getSection() {
        return sectionService.getSection();
    }

    @PostMapping
    public Boolean addSection(@RequestBody Section section) {

        try {
            System.out.println("add works");
            sectionService.addSection(section);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }




}

