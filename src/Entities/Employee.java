package Entities;

public class Employee {
	private String id;
	private String name;
	private Double salary;
	
	public Employee(String id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void aumento(Double porcentagem) {
		this.salary += (this.salary * porcentagem / 100);
	}
}
