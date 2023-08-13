public class Para {

    String name;
    int id;
    Para(String name,int id){
        this.name = name;
        this.id=id;

    }
   public static void main(String args[]){
    Para obj = new Para("Vivek",96);// ignore name: and id: it is done by compiler itself oly write("Vivek",96)
    System.out.println("Name:" + obj.name + "id:"+ obj.id);
   }

    
}
