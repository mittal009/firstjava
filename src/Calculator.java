public class Calculator
{
    static int a = 20;
    static int b = 40;

    public static void main(String []args)
    {
        add();
        sub();
        multiplication();
        division();
    }
     static void add()
     {
         int answer = a + b;
         System.out.println("Addition of "+a+" & "+b+" = "+answer);
     }

    static void sub()
    {
       int answer = a - b;
       System.out.println("Subtraction of "+a+" & "+b+"= "+answer);

    }
    static void multiplication()
    {
        int answer = a * b;
        System.out.println("Multiplication of "+a+" & "+b+" = "+answer);
    }

    static void division()
    {
        double answer = (double)a /b;
        System.out.println("Division of "+a+" & "+b+" = "+answer);

    }

}
