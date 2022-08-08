package com.details.student.service;

import com.details.student.model.Rank;
import com.details.student.model.Section;
import com.details.student.repository.RankRepository;
import com.details.student.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class SectionService {
    @Autowired
    SectionRepository sectionRepository;

    public List<Section> sectionList = new CopyOnWriteArrayList<>();
    public Section addSection(Section section){
        return sectionRepository.insert(section);
    }
    public List<Section> getSection(){return sectionRepository.findAll();}
    public Section getSection(String section){
        Optional<Section> optional =sectionRepository.findById(section);
        if(optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }
}
