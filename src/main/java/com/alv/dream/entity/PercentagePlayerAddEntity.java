package com.alv.dream.entity;

import java.sql.Timestamp;

import com.alv.dream.dto.PercentageAddDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "percentageplayer")
public class PercentagePlayerAddEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int no;
	public Timestamp date;
	 public int one;
	 public int two;
	 public int three;
	 public int four;
	 public int five;
	 public int six;
	 public int seven;
	 public int eight;
	 public int nine;
	 public int ten;
	 public int eleven;
	 public int twelve;
	 public int thirteen;
	 public int fourteen;
	 public int fifteen;
	 public int sixteen;
	 public int seventeen;
	 public int eighteen;
	 public int nineteen;
	 public int getSeventeen() {
		return seventeen;
	}

	public void setSeventeen(int seventeen) {
		this.seventeen = seventeen;
	}

	public int getEighteen() {
		return eighteen;
	}

	public void setEighteen(int eighteen) {
		this.eighteen = eighteen;
	}

	public int getNineteen() {
		return nineteen;
	}

	public void setNineteen(int nineteen) {
		this.nineteen = nineteen;
	}

	public int getTwenty() {
		return twenty;
	}

	public void setTwenty(int twenty) {
		this.twenty = twenty;
	}

	public int getTwentyone() {
		return twentyone;
	}

	public void setTwentyone(int twentyone) {
		this.twentyone = twentyone;
	}

	public int getTwentytwo() {
		return twentytwo;
	}

	public void setTwentytwo(int twentytwo) {
		this.twentytwo = twentytwo;
	}

	public int twenty;
	 public int twentyone;
	 public int twentytwo;
	 
	 public static PercentagePlayerAddEntity prepareEntity(PercentageAddDTO dto) {
		 
		 PercentagePlayerAddEntity entity =new PercentagePlayerAddEntity();
		 entity.setDate(new Timestamp(System.currentTimeMillis()));
		 entity.setOne(dto.getOne());
		 entity.setTwo(dto.getTwo());
		 entity.setThree(dto.getThree());
		 entity.setFour(dto.getFour());
		 entity.setFive(dto.getFive());
		 entity.setSix(dto.getSix());
		 entity.setSeven(dto.getSeven());
		 entity.setEight(dto.getEight());
		 entity.setNine(dto.getNine());
		 
		 entity.setTen(dto.getTen());
		 entity.setEleven(dto.getEleven());
		 
		 entity.setTwelve(dto.getTwelve());
		 
		 entity.setThirteen(dto.getThirteen());
		 entity.setFourteen(dto.getFourteen());
		 entity.setFifteen(dto.getFifteen());
		 entity.setSixteen(dto.getSixteen());
		 entity.setSeventeen(dto.getSeventeen());
		 entity.setEighteen(dto.getEighteen());
		 entity.setNineteen(dto.getNineteen());
		 entity.setTwenty(dto.getTwenty());
		 
		 entity.setTwentyone(dto.getTwentyone());
		 entity.setTwentytwo(dto.getTwentytwo());
		 return entity;
	 }

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

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public int getFour() {
		return four;
	}

	public void setFour(int four) {
		this.four = four;
	}

	public int getFive() {
		return five;
	}

	public void setFive(int five) {
		this.five = five;
	}

	public int getSix() {
		return six;
	}

	public void setSix(int six) {
		this.six = six;
	}

	public int getSeven() {
		return seven;
	}

	public void setSeven(int seven) {
		this.seven = seven;
	}

	public int getEight() {
		return eight;
	}

	public void setEight(int eight) {
		this.eight = eight;
	}

	public int getNine() {
		return nine;
	}

	public void setNine(int nine) {
		this.nine = nine;
	}

	public int getTen() {
		return ten;
	}

	public void setTen(int ten) {
		this.ten = ten;
	}

	public int getEleven() {
		return eleven;
	}

	public void setEleven(int eleven) {
		this.eleven = eleven;
	}

	public int getTwelve() {
		return twelve;
	}

	public void setTwelve(int twelve) {
		this.twelve = twelve;
	}

	public int getThirteen() {
		return thirteen;
	}

	public void setThirteen(int thirteen) {
		this.thirteen = thirteen;
	}

	public int getFourteen() {
		return fourteen;
	}

	public void setFourteen(int fourteen) {
		this.fourteen = fourteen;
	}

	public int getFifteen() {
		return fifteen;
	}

	public void setFifteen(int fifteen) {
		this.fifteen = fifteen;
	}

	public int getSixteen() {
		return sixteen;
	}

	public void setSixteen(int sixteen) {
		this.sixteen = sixteen;
	}

}
