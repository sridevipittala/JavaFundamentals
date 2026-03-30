/*
Encapsulation — Person Class 
Demonstrate FULL encapsulation by creating a Person class:
Fields: Must all be private: name (String), age (int), email (String), and salary (double).
Getters: Write public getters for all fields.
Setters (with validation): * age must be between 0 and 120.
salary must not be negative.
email must contain an '@' symbol.
Note: If validation fails, print an error message and keep the old value.
Testing (in main): Create a Person. Attempt to set invalid values (e.g., age = -5, salary = -1000, email = "notvalid"). Verify and print that the old values were preserved.

*/
class Person{
	private String name,email;
	private int age;
	private double salary;

	Person(String name,int age,String email,double salary){
		this.name=name;
		this.age=age;
		this.email=email;
		this.salary=salary;

	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		if(email.contains("@")){
			this.email=email;

		}else{
			System.out.println(email+ " is invalid");
		}
	}

	public String getEmail(){
		return email;
	}

	public void setAge(int age){
		if(age>0 && age<=120)
		{
			this.age=age;
		}
		else{
			System.out.println(age+ " is invalid age");
		}
	}

	public int getAge(){
		return age;
	}

	public void setSalary(double salary){
		if(salary>0)
		{
			this.salary=salary;
		}
		else{
			System.out.println(salary+" is invalid");
		}
		
	}

	public double getSalary(){
		return  salary;
	}
}
class TestPerson{
	public static void main(String args[]){
		Person p1=new Person("Sri",43,"sridevi.pittala@gmail.com",100000);
		p1.setAge(-1);
		p1.setSalary(0);
		p1.setEmail("Inmail");

		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Email: "+p1.getEmail());
		System.out.println("Salary: "+p1.getSalary());
	}
}