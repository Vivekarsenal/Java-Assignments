public class privateexample {
    
    public static void main(String arg[]){
        A obj = new A();
        System.out.println(obj.data);//error: data has private access in A
        obj.msg();//error: msg() has private access in A

    }
}

class A{
    private int data = 40;
    private void msg(){
        System.out.println("Hello world");
    }
}