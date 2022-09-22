	class Cricket{
 public static void main(String a[]){
  int rohithHighScore = 264;
  int sachinHighScore = 200;
  int mandannaHighScore = 135;
  int ackerrHighScore = 232;
  int bjClarkHighScore = 229 ;
  
   int highScore[] = {rohithHighScore,sachinHighScore,mandannaHighScore,ackerrHighScore,bjClarkHighScore};
   //varibale retruned from array element
   int ref0 = highScore[0];
   int ref1 = highScore[1];
   int ref2 = highScore[2];
   int ref3 = highScore[3];
   int ref4 = highScore[4];
   //length is a property of array
 System.out.println("Elements at index " + ref0);
 System.out.println("Elements at index " + ref1);
 System.out.println("Elements at index " + ref2);
 System.out.println("Elements at index " + ref3);
 System.out.println("Elements at index " + ref4); 
 
  for(int i=0;i<highScore.length;i++){
	  int ref = highScore[i];
	  System.out.println(highScore[i]);
	System.out.println("Element at index " + i + " ref ");  
	  
  }
 
 
 
 }



}