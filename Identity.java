class Identity{
	static String name ;
	static String email;
	static long mobile;
	static int age ;
	static String address;
	static char gender;
	static String working;
	static String shirtSize;
	static int pantSize;
	static int weight;
	static double height;
  public static void printName(){
	  System.out.println(name);
  // System.out.println("Name purpose is to identify the person");
	
  }
	public static void printNameAndEmail(String  name,String email){
		
	 System.out.println("Name purpose is to identify the person :"+ name + " " + email);
	// System.out.println("Email is used for sharing the details of busniess infomation");
	}
	
	public static void printNameAndMobile(String name,long  mobile){
		System.out.println("mobile number  purpose is to identify the person"+ name + " " +mobile);
		
	}
	public static void printNameAndAge(String name,int age){
		System.out.println("Identifies the age of the person" +name + " " + age);
	}
	public static void printNameAndAddress(String name,String address){
		
	
		System.out.println("Identifies the address of the person : " + name + " " + address);
	}
	public static void printNameAndEmailAndAddressAndAge(String name,String email,String address,int age){
		
		System.out.println("Identifies the information of the person"+name + " "+email + " "+address +" "+age);
	}
	public static void printNameAndGender(String name,char gender){
		
		System.out.println("identify the gender " +name + " " +gender);
	}
	public static void printNameAndWorking(String name,String working){
		
		System.out.println("Identifies if the person will working  "+ name + " " +working);
	}
	public static void printNameAndShirtSize(String name,int shirtSize){
		
		
		System.out.println("Identifies the ShirtSize of the person" + name + " " +shirtSize);
	}
	public static void printNameAndPantSize(String name,int pantSize){

		System.out.println("Identifies the PanttSize of the person" +name + " " +pantSize);
	} 
	public static void printNameAndweightAndHeight(String name,int weight,double height){
		
		System.out.println("Identifies the weight and Height of the person" +name+" "+weight+ " " +height);
	}
	
	
	}
