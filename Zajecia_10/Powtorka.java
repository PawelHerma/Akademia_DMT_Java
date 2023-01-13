//deklaracja klasy
public class Powtorka 
{
    //wypisz kolejne liczby naturalne za pomoca petli for()
    public static void liczDoFor(int n)
    {
        for ( int i = 1 ; i <= n ; i++ )
        {
            System.out.print( i + " " );
        }
    }

    //wypisz kolejne liczby naturalne za pomoca petli while()
    public static void liczDoWhile(int n)
    {
        int i = 1;
        while ( i <= n )
        {
            System.out.print( i + " " );
            i++;
        }
    }

    //wypisz alfabet
    public static void alfabet()
    {
        for ( int i = 97 ; i < 123 ; i++ )
        {
            System.out.print( (char) i + "; " );
        }
    }

    //sprawdz czy podany tekst jest palindromem
    public static boolean jestPalindromem(String tekst)
    {
        boolean pomoc = true;
        char text[];
        text = tekst.strip().toCharArray();
        for ( int i = 0 ; i < text.length ; i++ )
        {
            if ( (char) text[i] != text[text.length - 1 - i] )
            {
                pomoc = false;
            }
        }
        return pomoc;
    }

    //sprawdz czy podana liczba jest parzysta
    public static boolean jestParzysta(double d)
    {
        if ( (int) d % 2 == 0 )
            return true;
        else
            return false;
    }
}
