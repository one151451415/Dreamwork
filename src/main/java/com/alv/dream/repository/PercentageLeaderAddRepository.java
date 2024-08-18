package com.alv.dream.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.alv.dream.entity.PercentageLeaderAddEntity;

public interface PercentageLeaderAddRepository extends JpaRepository<PercentageLeaderAddEntity, Integer>{

	@Modifying
	@Query("insert into PercentageLeaderAddEntity(no,date,captain,viceCaptain) values(?1,?2,?3,?4)")
	public void insertPercentageLeader(int no,Timestamp date,int captain,int vice_captain);
}
