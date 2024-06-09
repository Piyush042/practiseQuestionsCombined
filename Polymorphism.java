public class Polymorphism {
   void printa(){
       System.out.println("in Print A of class Polymorphism");
   }
   void printa(int a){
       System.out.println("in  print A of class Polymorphism with arguments "+ a);
   }
}

 class extender extends Polymorphism{
     void printa(){

         System.out.println("in A of class extender");
     }
     void printa(int b){

         System.out.println("in B of class extender with arguments " + b);
     }
}

 class polyRunner{
     public static void main(String[] args) {
         Polymorphism obj = new Polymorphism();
         obj.printa(2);
         obj = new extender();
         obj.printa(4);
 //Here the same obj is behaving differently for Polymorphism object and extender object and it is runtime polymorphism.
     }
 }

