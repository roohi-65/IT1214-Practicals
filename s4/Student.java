class Student{
	String name="adam";
	int marks=100;
	
	Student(){
		name="NoName";
	}
	Student(String n){
		name=n;
	}
	Student(String n, int m){
		name=n;
		marks=m;
	}
}
/*class TestClass{
	int a;
	public static void main(String[] args){
		System.out.println("hi from StudentDemo TestClass Class");
	}
}*/

class StudentDemo{
	public static void main(String[] args){
		System.out.println("hi from StudentDemo Class");
		System.out.println("creating an object of student class");
		Student s1=new Student("nice name",85);
		System.out.println("creating an object of student class");
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);
		s1.name="bob";//setting the variable value
		s1.marks=10;
		System.out.println("Name value of the object is " +s1.name);//getting the variable value
		System.out.println("Marks value of the object is " +s1.marks);
	}
}

