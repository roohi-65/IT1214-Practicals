class Items{
	String description;
	int unitPrice;
	
	Item(String desc, int unitPrice){
		description=desc;
		this.unitPrice=unitPrice;
	}
}

class Basket{
	Item itm[5];
	
	void addItem(Item i){
	
		
	}
	void calculatePrice(){
		
	};
}

class ShopDemo{
	public static void main(String[] args){
		Item[] itemList=new Item[10];
		
		Basket basket1=new Basket();
		char input='y';
		int i=0;
		do{
			String desc=sc.nextLine();
			int up=sc.nextInt(desc,up);
			itemList[i]=new Item(desc,up);
			i++;
		}
		while()
	}
}