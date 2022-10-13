class IndianRupeesTester{
  public static void main(String a[]){
   IndianRupees india=new IndianRupees();
   india.serialNo="49A17748";
   india.color="Olive Green";
   india.name="20 Rupees";
   
   IndianRupees india1=new IndianRupees();
   india1.serialNo="49A17760";
   india1.color="SkyBlue";
   india1.name="50 Rupees";
   
   IndianRupees india2=new IndianRupees();
   india2.serialNo="49A200648";
   india2.color="Purple";
   india2.name="100 Rupees";
   
   IndianRupees india3=new IndianRupees();
   india3.serialNo="49A17893";
   india3.color="Orange";
   india3.name="200 Rupees";
   
   IndianRupees india4=new IndianRupees();
   india4.serialNo="21SR200621";
   india4.color="Pink";
   india4.name="2000 Rupees";
   
   System.out.println(india.serialNo +" "+ india.color +" "+ india.name);
   System.out.println(india1.serialNo +" "+ india1.color +" "+ india1.name);
   System.out.println(india2.serialNo +" "+ india2.color +" "+ india2.name);
   System.out.println(india3.serialNo +" "+ india3.color +" "+ india3.name);
   System.out.println(india4.serialNo +" "+ india4.color +" "+ india4.name);   
  }

}