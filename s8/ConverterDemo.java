class ConverterDemo{
	public static void main(String[] args){
		boolean bo=true;
		byte by=127;//-128 to 127
		short sh=45;
		char ch='b';
		long lo=452;
		int in=456;
		float fl=7.125f;
		double db=78.25;
		String st="hi";
		
		lo=by;//widening type convertion
		
		//sh=lo;// it will show error!
		sh=(short)lo;//casting
		
		fl=in;
		
		//in=db;//show error!
		in=(int)db;
		in=ch;// give ASCII value a=97,b=98....
		in=100;
		ch=(char)in;
		
		System.out.println("value of boolean bo is : "+bo);
		System.out.println("value of byte by is :"+by);
		System.out.println("value of short sh is : "+sh);
		System.out.println("value of char ch is : "+ch);
		System.out.println("value of long lo is : "+lo);
		System.out.println("value of int in is : "+in);
		System.out.println("value of float fl is : "+fl);
		System.out.println("value of double db is : "+db);
		System.out.println("value of String st is : "+st);
	}
}
