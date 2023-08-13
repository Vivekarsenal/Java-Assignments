public class A {
    A(String name){
        System.out.println(" Constructor with one argument " + " argument string :" + name);
    }
    A(String name, int age){
        System.out.println("Constructor with two argument" + " argument string: " + name + " integer :" + age);
    }
    A(double id){
        System.out.println(" double :"+ id);

    }
    
    public static void main(String args[]){
        A obj = new A("vivek");
        A obj2 = new A("Vivek",90);
        A obj3 = new A(50.44);
    }

}


