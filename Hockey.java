class Hockey{
   public static void getTeamMembers(String[] teamMembers){
     System.out.println("inside the getTeamMembers()");
	 System.out.println("Hockey team members are " + teamMembers.length );
	  for(int i=0;i<teamMembers.length;i++){
	    System.out.println(teamMembers[i]);
	  }
   System.out.println("end of the getTeamMembers()");
   }

}