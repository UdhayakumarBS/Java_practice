package Abstraction;

public class Abs extends Abstraction{
    public void myfunc(){
        System.out.println("This is Abs method");
    }

    public static void main(String[] args){
        Abs obj = new Abs();
        obj.myfunc();
        System.out.print(obj.name);
    }
}
