public class example {
    protected void msg(){System.out.println("HI");}
    
}

class A{

    public static void main(String args[]){

        A obj = new A();
        obj.msg();// compile error

    }
}
