package Practice;



public class Methods {
    public static void main(String[] args) {

        welcome();
        multiply(5, 10);
        multiply(2,3);
        add(25, 32);

    }
    public static void welcome (){
        System.out.println( "Welcome to my Methods practice class");

    }
    public static void multiply(int a, int b){
        System.out.println(a *  b);

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }

}