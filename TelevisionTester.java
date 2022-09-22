class TelevisionTester{
  public static void main(String a[]){
    Television.brandName = "Panasonic" ;
	Television.color = "Black";
	Television.price = 50000.00;
	Television.onAndOf();
	Television.onAndOf();
	Television.onAndOf();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.increaseVolume();
  Television.decreseVolume();
  Television.decreseVolume();
  Television.decreseVolume();
  Television.decreseVolume();
  Television.decreseVolume();
	
	System.out.println("The tv brandName is " + Television.brandName);
	System.out.println("The tv color is " + Television.color);
	System.out.println("The tv's price is " + Television.price);
	
  }


}