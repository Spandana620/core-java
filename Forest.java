class Forest{
 public static void main(String a[]){
 String type = "Dry";
 String name = "Bannerghatta National park";
 String region = "Mysore";
 
 String[] primaryAnimal = {"Deer","Lion","Tiger","Bear","Zebra","Rabit"};
 String ref0 = primaryAnimal[0];
 String ref1 = primaryAnimal[1];
 String ref2 = primaryAnimal[2];
 String ref3 = primaryAnimal[3];
 String ref4 = primaryAnimal[4];
 String ref5 = primaryAnimal[5];
 
 System.out.println("Forest animals are " + ref0);
 System.out.println("Forest animals are " + ref1);
 System.out.println("Forest animals are " + ref2);
 System.out.println("Forest animals are " + ref3);
 System.out.println("Forest animals are " + ref4);
 System.out.println("Forest animals are " + ref5);
 
 for(int i =0;i<primaryAnimal.length;i++){
 String ref = primaryAnimal[i];
 System.out.println(primaryAnimal[i]);
 System.out.println("Forest animals are "+  i + " ref");
 
 }



}

}