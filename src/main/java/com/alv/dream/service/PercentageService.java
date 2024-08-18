package com.alv.dream.service;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alv.dream.dto.PercentageAddDTO;
import com.alv.dream.entity.PercentageLeaderAddEntity;
import com.alv.dream.entity.PercentagePlayerAddEntity;
import com.alv.dream.repository.PercentageLeaderAddRepository;
import com.alv.dream.repository.PercentagePlayerAddRepository;

import jakarta.persistence.Tuple;



@Service
@Transactional
public class PercentageService {
	
	@Autowired
	PercentagePlayerAddRepository playerRepository;
	
	@Autowired
	PercentageLeaderAddRepository leaderRepository ;
	
	
	public String addPercentage(PercentageAddDTO dto) {
		
		PercentagePlayerAddEntity entity =  PercentagePlayerAddEntity.prepareEntity(dto);
		
		
		playerRepository.percentagePlayerAdd(entity.getDate(),entity.getOne(),
				
				entity.getTwo(),
				entity.getThree(),
				entity.getFour(),
				entity.getFive(),
				entity.getSix(),
				entity.getSeven(),
				entity.getEight(),
				entity.getNine(),
				entity.getTen(),
				entity.getEleven(),
				entity.getTwelve(),
				entity.getThirteen(),entity.getFourteen(),entity.getFifteen(),
				entity.getSixteen(),entity.getSeventeen(),
				entity.getEighteen(),entity.getNineteen(),
				entity.getTwenty(),
				entity.getTwentyone(),
				entity.getTwentytwo()
				
				
				);
        List<Tuple> lastRecord = playerRepository.getLastPercentagePlayerRecord();
		
        leaderRepository.insertPercentageLeader((Integer) lastRecord.get(0).get(0), (Timestamp)lastRecord.get(0).get(1),dto.getC(), dto.getVc());
        
        return "done";
	}
	
	public long getRecordCount() throws Exception {
		
	  long player = 	playerRepository.count();
	  long leader = leaderRepository.count();
	  
	  if(player==leader) {
		  return player;
	  }else {
		  throw new Exception("count does not match");
	  }
	}

}
