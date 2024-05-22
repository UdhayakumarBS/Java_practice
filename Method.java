public class Method {
    String y = "New";
    static String function(String fname){
        return fname+" "+"KUMAR";
    }

    static int plusMethod(int x, int y) {
        return x + y;
      }
      
    static double plusMethod(double x, double y) {
    return x + y;
    }
      
    public static void main(String[] args){
        System.out.println(function("Udhaya"));
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        Two obj = new Two();
        System.out.println(obj.x);
        Method obj1 = new Method();
        obj1.y = "Update";
        System.out.println(obj1.y);
        Method obj2 = new Method();
        System.out.println(obj2.y);

    }
    
}

class Two{
    int x = 5;

}

