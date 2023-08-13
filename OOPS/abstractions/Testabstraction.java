abstract  class Shape{
    abstract void draw();

}

class Circle extends Shape{
    void draw(){System.out.println("circle is drawn");}
}


class Rectangle extends Shape{
    void draw(){System.out.println("rectangle is drawn");}
}










public class Testabstraction {
    public static void main(String args[]){
    Shape obj = new Circle();
    obj.draw();
    
}
}
