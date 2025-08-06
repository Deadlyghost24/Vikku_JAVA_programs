package com.vikku;

 class Employee {
	private String name;
	private int ID;
	private long salary;
	public String getSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}

public class TaskEncapsulation {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.setName("Vikku");
		obj.setID(2025);
		obj.setSalary(150);
		System.out.println("Name:"+obj.getName() + " " + "ID:" + obj.getID()+" Salary:"+obj.getSalary());

	}

}

