import java.util.Scanner;
public class check_number 
{
    static Scanner input = new Scanner(System.in);
    
    public static void checknumber()
    {
        System.out.print("Podaj liczbe: ");
        String dane = input.nextLine();
        try
        {
            double wartosc = Double.parseDouble(dane);
            System.out.println("Podano liczbe " + wartosc);
        }
        catch (Exception e)
        {
            System.out.println("Nie podano liczby. Sprobuj ponownie");
            checknumber();
        }
    }
    public static void main(String[] args)
    {
        checknumber();
    }    
}
