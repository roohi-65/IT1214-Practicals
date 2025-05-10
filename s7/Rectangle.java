class Rectangle{
	
	int height;
	int width;
	
	Rectangle (int height,int width){
		this.height=height;//variable height=parameter height
		this.width=width;
		System.out.println("just created a rectangle with size(h*w) "+height +" * "+width);
		print(width,height);
	}
	
	
	
	void print(int width,int height){
		for(int j=0 ; j<height ; j++){//for lines i.e.,height
		for (int i=0; i<width ;i++){   //for the *'s i.e., width
			System.out.print("*");  // * in each line
			}
		System.out.println("");//breakline
	}
}
}


class Main{
	public static void main(String[] args){
		/*for(int i=0; i<10 ; i++){
			System.out.println("value of i is = "+i);
		}*/
		
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle(3,6);
		Rectangle r3=r1;
		//scanner to input value when running
		System.out.println("height "+r1.height +" , width "+r1.width);
		System.out.println("height "+r2.height +" , width "+r2.width);
		System.out.println("height "+r3.height +" , width "+r3.width);
		//r1.print(10,4);
		
	}
	
	
}

//hit you use nested for loops and print ,println
/* expected output:

***
***
***
***


*/