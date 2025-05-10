import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gb=0;//grade point value
	/*	if(grade.equals("A+") || grade.equals("A"))
		{
			gb=4;
		}else{
			if(grade.equals("A-"))
			{
				gb=3.7;
			}
		}*/
		//return gb;
		
		switch(grade){
			case "A+":
			gb=4;
			break;
			case "A":
			gb=4;
			break;
			case "A-":
			gb=3.7f;
			break;
			case "B+":
			gb=3.3f;
			break;
			case "B":
			gb=3;
			break;
			case "B-":
			gb=2.7f;
			break;
			case "C+":
			gb=2.3f;
			break;
			case "C":
			gb=2;
			break;
			case "C-":
			gb=1.7f;
			break;
			case "D+":
			gb=1.3f;
			break;
			case "D":
			gb=1;
			break;
			
		}
		return gb;
	}
}

class Demo{
	public static void main(String[] args){
		String name;
		float ogp=0;
		String grade;
		float point;
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		
		System.out.println("enter your name: ");
		name=sc.nextLine();
		System.out.println("hi "+name);
		
		System.out.println("enter the grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=point*3;
		System.out.println("grade point value of the grade "+grade+" is "+point);
		System.out.println("overall grade point is "+ogp);
		
		System.out.println("enter the grade for IT1122: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=point*2;
		System.out.println("grade point value of the grade "+grade+" is "+point);
		System.out.println("overall grade point is "+ogp);
	}
}