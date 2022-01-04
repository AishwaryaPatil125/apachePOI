package com.xworkz.excelsheetapp;

public class XSSFWorkbook {
	private Integer id;
	private String sports;
	private String player;
	private String country;
	private Integer age;
	
	public XSSFWorkbook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XSSFWorkbook(Integer id, String sports, String player, String country, Integer age) {
		this.id = id;
		this.sports = sports;
		this.player = player;
		this.country = country;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "XSSFWorkbook [id=" + id + ", sports=" + sports + ", player=" + player + ", country=" + country
				+ ", age=" + age + "]";
	}
	
	

}
