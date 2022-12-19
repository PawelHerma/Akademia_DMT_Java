// Program prosi użytkownika o podanie dowolnej liczby naturalnej. 
// Jeżeli użytkownik poda złą liczbę, to wyświetla się komunikat “Haha, nie zgadłeś” 
// oraz kolejny raz wyświetla się prośba o podanie dowolnej liczby naturalnej.
// Program kończy się w momencie gdy użytkownik poda liczbę: 2021, 
// wówczas wyświetla się komunikat “Zgadłeś moją liczbę, dziękuję za zabawę”.

import java.util.Scanner;
public class zgadywanka 
{
    static Scanner input = new Scanner(System.in);
    public static void zgadnij()
    {
        System.out.print("Podaj liczbe: ");;
        int liczba = input.nextInt();
        if( liczba == 2021 )
        {
            System.out.print("Zgadles moja liczbe");
        }
        else
        {
            System.out.println("Haha, nie zgadles");
            zgadnij();
        }
    }
    public static void main(String[] args)
    {
        zgadnij();
    }
}
