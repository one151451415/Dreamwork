package com.alv.dream.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.alv.dream.entity.PercentagePlayerAddEntity;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Tuple;

public interface PercentagePlayerAddRepository extends JpaRepository<PercentagePlayerAddEntity, Integer>{
	
	
	
	@Modifying
	@Query("insert into PercentagePlayerAddEntity(date,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone,twentytwo)  values(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11,?12,?13,?14,?15,?16,?17,?18,?19,?20,?21,?22,?23)")
	void percentagePlayerAdd(Timestamp date,int one,int two,int three,int four,int five,int six,int seven,int eight,int nine,int ten,int eleven,int tweleve,int thirteen,int fourteen,int fifteen,int sixteen,int seventeen,int eighteen,int nineteen,int twenty,int twentyone,int twentytwo); 

    @Query("select no,date from PercentagePlayerAddEntity order by date desc limit 1")
   List<Tuple> getLastPercentagePlayerRecord() ;
    
    
    
    
}
