package Sample.programs;

class Class1 {
    static {
        System.out.println("Wow");
    }
    public static final int xyz = 1;
    public static int abc = 1; 
} 
 public class Class2 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(Class1.xyz));
    }
}