class TorchTester{
  public static void main(String a[]){
   Torch.brandName = "SolarTorch";
   Torch.color = "white";
   Torch.price  = 100.00;
   Torch.isOnAndOf();
   Torch.isOnAndOf();
   Torch.isOnAndOf();
  Torch.increaseVolume();
  Torch.increaseVolume();
  Torch.increaseVolume();
  Torch.increaseVolume();
  Torch.increaseVolume();
  Torch.decreseVolume();
  Torch.decreseVolume();
  Torch.decreseVolume();
  Torch.decreseVolume();
  Torch.decreseVolume();
   System.out.println("The torch brandName is " + Torch.brandName);
   System.out.println("The torch color is " + Torch.color);
   System.out.println("The torch price is " + Torch.price);
  }

}