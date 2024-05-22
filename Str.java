public class Str {
    public static void main(String[] args) {
        math_op(args);
        String k = "UdhAy";
        System.out.println(k.toUpperCase());
        System.out.println(k.toLowerCase());
        System.out.println(k.length());
        System.out.println(k.indexOf('B'));
        String m = "BS";
        System.out.println(k.concat(m));
        System.out.println("hi, I\'m Udhayakumar and it is the \'\\\' backslash symbol");
        switch_case(args);
    }
    /*------------------------------Math---------------------------------------------- */

    public static void math_op(String[] args){
        int x = 10; 
        int y = 2;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(-89.56));
        System.out.println(Math.random());
        System.out.println(Math.rint(y));
        System.out.println((int)(Math.random() * 101)); // to get random number from 1 to 100
        

    }

    public static void switch_case(String[] args){
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Default");
                break;
        }

        String[] cars = {"car1", "car2"};
        System.out.println(cars.length);
        for (String i : cars){
            System.out.println(i);
        }

    }
    
}

