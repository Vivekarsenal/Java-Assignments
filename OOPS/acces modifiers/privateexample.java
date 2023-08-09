public class privateexample {
    
    public static void main(String arg[]){
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();

    }
}

class A{
    private int data = 40;
    private void msg(){
        System.out.println("Hello world");
    }
}