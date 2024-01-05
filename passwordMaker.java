import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the password generator. Press enter to proceed");
        String nothing = scanner.nextLine();
        
        int n = (int)(Math.random()*26)+97;
        System.out.print((char)n); //Lowercase letter
        int o = (int)(Math.random()*26)+65;
        System.out.print((char)o); //Uppercase letter
        int p = (int)(Math.random()*10);
        System.out.print(p); //Random number
        int q = (int)(Math.random()*15)+33;
        System.out.print((char)q); //Special Charecter
        int r = (int)(Math.random()*15)+33;
        System.out.print((char)r); //Special Charecter
        int s = (int)(Math.random()*26)+97;
        System.out.print((char)s); //Lowercase letter
        int t = (int)(Math.random()*26)+65;
        System.out.print((char)t); //Uppercase letter
        int u = (int)(Math.random()*10);
        System.out.print(u); //Random number
        int v = (int)(Math.random()*26)+97;
        System.out.print((char)v); //Lowercase letter
        int w = (int)(Math.random()*26)+65;
        System.out.print((char)w); //Uppercase letter
    }
}
