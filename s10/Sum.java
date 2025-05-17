import java.util.*;

class Sum{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int sum=0;
		
		for(int i=0;i<10;i++){
			System.out.println("Enter No."+(i+1));
			try{
			sum=sum+Integer.parseInt(s.nextLine());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				i=i-1;
			}
		}
		System.out.println("Sum="+sum);
	}
}
