import java.util.Scanner;


class  InputDemo{
	public static void main(String[] args){
		String name;
		int age;
		byte marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("hi enter your name :");
		name=sc.nextLine();//read string until you press enter key
		System.out.println("hello "+name+" , how are you?");
		System.out.println("hi enter your age :");
		age=sc.nextInt();
		System.out.println("ohh god!are you "+age+" years old?");
		System.out.println("hi enter your marks :");
		marks=sc.nextByte();
		System.out.println(" your marks is : "+marks+ " amazing!");
		
	}
}