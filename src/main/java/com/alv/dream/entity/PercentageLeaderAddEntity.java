package com.alv.dream.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "percentageleader")
public class PercentageLeaderAddEntity {
	
	@Id
	private int no;
	private Timestamp date;
	private int captain;
	private int viceCaptain;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	public int getViceCaptain() {
		return viceCaptain;
	}
	public void setViceCaptain(int viceCaptain) {
		this.viceCaptain = viceCaptain;
	} 

}
