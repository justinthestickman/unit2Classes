import java.util.Scanner;

public class CommaRemover
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1000 and 999999: ");
        String num = scanner.next();
        String newnum = num.replace(",","");
        System.out.println(newnum);
    }
}
        