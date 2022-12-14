// Dana jest lista liczb naturalnych [1,2,3,4,5,6,7,8,9,10,11,12]. 
// Program prosi użytkownika o podanie dowolnej liczby,
// jeżeli podana przez użytkownika liczba znajduje się na liście,
// to wyświetlamy komunikat “Liczba znajduje się na liście.”
// w przeciwnym wypadku wyświetla się komunikat “Liczba jest na liście”.

import java.util.Scanner;
public class liczba_w_liscie 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lista[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        boolean naLiscie = false;

        System.out.print("Podaj liczbe naturalna: ");
        int liczba = input.nextInt();

        for( int i = 0; i < lista.length ; i++ )
        {
            if( liczba == lista[i] )
            {
                naLiscie = true;
            }
        }
        if( naLiscie )
        {
            System.out.println("Liczba znajduje sie na liscie");
        }
        else{
            System.out.println("Liczba nie znajduje sie na liscie");
        }
    }    
}
