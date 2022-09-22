class CitizenOfIndia{

   public static void showTheResponsibility(int age,char gender){
   System.out.println("invoking the showTheResponsibility()");
   //int age =16;
   //char gender = 'F';
   // && is AND Operator
   // || is OR Operator either one conditions must be satifies
   //segriate the conditions in 1 if will use && and the both the conditions are true
   if(age>=10 && age<16){
     System.out.println("Responsibility to school");
     return;
   }
   if(age==16){
    System.out.println("Responsibility is College");
   return;
   }
   if(age == 21){ //this condition is true it will come to anthor if statement otherwise it will go for else part 
     System.out.println("Responsibility to Vote");
	 if(gender == 'F'){
		 System.out.println("Girll can legally Marry");
	 }
   }
   else{
	   System.out.println("Boy can not Marry");
   }
   System.out.println("End of the showTheResponsibility");
}
}