class Student{
	int marks;
	String name;
	
	Student(){//constructor
		System.out.println("Creating a Student Object");
		name="Default Name";
		
		
	}
    Student(String n,int m){
		System.out.println("Creating a Student Object"+n+"and marks "+m);
		
	}
}

/*class Printer{
	void print(String s){
		System.out.println(s) ;
	}
}*/

class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo class app");
		//Printer p= new Printer();
		//p.print("welcome to demo class app");
		Student s1=new Student();
		s1.marks=80;
		System.out.println("The student name is "+s1.name+" marks is "+s1.marks);
		s1.name="Alice";
		System.out.println("The student name is "+s1.name+" marks is "+s1.marks);
		//p.print("The student name is "+s1.name+" marks is "+s1.marks);
		
		Student s2=new Student("Bob",50);
		//s2.marks=50;
		//s2.name="Bob";
		System.out.println("The student name is "+s2.name+" marks is "+s2.marks);
	}
}