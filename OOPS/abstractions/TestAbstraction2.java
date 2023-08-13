 abstract class Bike{
    Bike(){System.out.println("Bike is cool");}
    abstract void run();
    void Changesgear(){System.out.println("Gear changed");}
 }

 class Honda extends Bike{
    void run(){System.out.println("running safely");}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class TestAbstraction2 {
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();  
       obj.Changesgear();  

    }
    
}
