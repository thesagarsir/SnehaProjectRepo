package com.javabykiranentiry;

public class Employee {
	int age;
	String loc;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Employees [age=" + age + ", loc=" + loc + "]";
	}

}
