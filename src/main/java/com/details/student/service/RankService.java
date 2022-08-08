package com.details.student.service;

import com.details.student.model.Rank;
import com.details.student.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class RankService {
    @Autowired
    RankRepository rankRepository;

    public List<Rank> rankList = new CopyOnWriteArrayList<>();
    public Rank addRank(Rank rank){
        return rankRepository.insert(rank);
    }
    public List<Rank> getRank(){return rankRepository.findAll();}
    public Rank getRank(String name){
        Optional<Rank> optional =rankRepository.findById(name);
        if(optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }
}
