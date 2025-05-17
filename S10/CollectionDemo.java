import java.util.Scanner;

class Item{
	String name;
	int price;
	Item(String name,int price){
		this.name=name;
		this.price=price;
	}
}
class CollectionDemo{
	public static void main(String[]args){
			    
		List <Integer> b=new ArrayList<Integer>();
		b.add(2);
		b.add(20);
		b.add(30);
		System.out.println("Elements of b are "+b);
	
		List <Item> products=new ArrayList<Item>();
		products.add(new Item("Milk Powder",1060));
		products.add(new Item("Toothpaste",160));
		products.add(new Item("Bread",100));
	
		for(Integer element: b){
			System.out.println(element);
		}
		
		for(Item e:products){
			System.out.println(e.name+"\n"+"price:"+e.price);
		}
	}
}