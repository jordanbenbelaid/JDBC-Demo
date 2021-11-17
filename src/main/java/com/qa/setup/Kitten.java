package com.qa.setup;

public class Kitten {
	
	private int kittenId;
	private int age;
	private String breed;
	private int cuteness;
	private String name;
	
	public Kitten () {}
	
	public Kitten(int kittenId, int age, String breed, int cuteness, String name) {
		super();
		this.kittenId = kittenId;
		this.age = age;
		this.breed = breed;
		this.cuteness = cuteness;
		this.name = name;
	}

	public Kitten(int age, String breed, int cuteness, String name) {
		super();
		this.age = age;
		this.breed = breed;
		this.cuteness = cuteness;
		this.name = name;
	}

	public int getKittenId() {
		return kittenId;
	}
	public void setKittenId(int kittenId) {
		this.kittenId = kittenId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getCuteness() {
		return cuteness;
	}
	public void setCuteness(int cuteness) {
		this.cuteness = cuteness;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kitten [kittenId=" + kittenId + ", age=" + age + ", breed=" + breed + ", cuteness=" + cuteness
				+ ", name=" + name + "]";
	}
	
	

}
