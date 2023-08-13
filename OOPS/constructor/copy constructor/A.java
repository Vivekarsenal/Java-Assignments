public class A {

    String name;
    int id;

    A(String name ,int id){
        this.name = name;
        this.id = id;
    }
    A(A object){
        this.name = object.name;
        this.id = object.id;

    }
    public static void main(String args[]){

        System.out.println("First object");
        A obj1 = new A("Vivek " , 92);
        System.out.println("Name :" + obj1.name
        + " and Id :" + obj1.id);

        A obj2 = new A(obj1);
        System.out.println(
            "Copy Constructor used Second Object");
        System.out.println("Name :" + obj2.name
                           + " and Id :" + obj2.id);

    }
    
}
