public class Employee {
    public static void main(String args[]){
        Employee1 e1 = new Employee1();
          Employee1 e2 = new Employee1();
            Employee1 e3 = new Employee1();
        

        e1.insert(101,"ajeet",45000);  
        e2.insert(102,"irfan",25000);  
        e3.insert(103,"nakul",55000);  
        e1.display();
        e2.display();
        e3.display();

    }
    
}

class Employee1{
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary = s;

    }
  void display(){  System.out.println(id+" " + name +" " + salary + " ");}

}
