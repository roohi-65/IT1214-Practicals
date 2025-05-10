class One{
    int a=10;  //variable definition
	int b;     //variable definition
	
	void printDetails(){ //method
		System.out.println("from class One a = "+a);
		System.out.println("from class One b = "+b);
	}
}

class Two{
     int a,c;
	 
	 void printDetails(){ //method
		System.out.println("from class Two a = "+a);
		System.out.println("from class Two c = "+c);
	}
}

class App{
	
	public static void main(String[] args){
		One  ol=new One();
		Two tl=new Two();
		ol.printDetails();
		ol.b=100;
		ol.printDetails();
		tl.printDetails();
		tl.a=20;
		tl.c=30;
		tl.printDetails();
		
	}

}