class WashingMachineTester{
  public static void main(String a[]){
  WashingMachine.brandName = "Samsung";
  WashingMachine.color = "Gray";
  WashingMachine.price = 80000.00;
  WashingMachine.onOrOf();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.increaseVolume();
  WashingMachine.decreseVolume();
  WashingMachine.decreseVolume();
  WashingMachine.decreseVolume();
  WashingMachine.decreseVolume();
  WashingMachine.decreseVolume();
  WashingMachine.onOrOf();
  WashingMachine.onOrOf();
  System.out.println("Main method is started");
  System.out.println("WashingMachine brandName is " + WashingMachine.brandName);
  System.out.println("WashingMachine color is " + WashingMachine.color);
  System.out.println("WashingMachine price is " + WashingMachine.price);
  System.out.println("Main Method is Ended");
  }

}