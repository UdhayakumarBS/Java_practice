public class StaticVsPublic {
    int x = 5;
    public StaticVsPublic(int y){  // Constructor must match with class name and should not have return type such as void
        x = x + y;
    }
    static void mymain(){
        System.out.println("I'm Static");
    }
    public void mypublicmain(){
        System.out.println("I'm Public");
    }

    public static void main(String[] args){
        mymain();   // No need to create object for static method
        StaticVsPublic obj = new StaticVsPublic(10);  // Mandate to create object for public method
        obj.mypublicmain();
        System.out.println(obj.x);
    }
}
