

import java.util.Scanner;
public class lancuch_znakow 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj lancuch 10 znakow: ");
        String lancuch = input.next();
        int dlugosc = lancuch.length();
        if( dlugosc == 10 )
        {
            System.out.print("Poprawna dlugosc lancucha");
        }
        else
        {
            System.out.print("Lancuch ma niewlasciwa dlugosc");
        }
        input.close();
    }
}
