//biblioteki potrzebne do walidacji danych
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//deklaracja klasy
public class Complex 
{
    //prywatne zmienne
    private int re;
    private int im;

    //publiczny konstruktor
    public Complex()
    {
        
    }

    //prywatny kontruktor
    private Complex( int re , int im )
    {
        this.set( re, im );
    }

    //prywatny konstruktor ze stringa
    public Complex( String liczba )
    {
        
        String liczbaBezSpacji = liczba.replaceAll("\\s","");

        // Pattern A - a +/- bi
        Pattern patternA = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)([-|+]+[0-9]+\\.?[0-9]?)[i$]+");
        // Pattern B - tylko część rzeczywista
        Pattern patternB = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)$");
        // Pattern C - tylko część urojona
        Pattern patternC = Pattern.compile("([-]?[0-9]+\\.?[0-9]?)[i$]");

        Matcher matcherA = patternA.matcher(liczbaBezSpacji);
        Matcher matcherB = patternB.matcher(liczbaBezSpacji);
        Matcher matcherC = patternC.matcher(liczbaBezSpacji);

        if (matcherA.find()) 
        {
            this.re = Integer.parseInt(matcherA.group(1));
            this.im = Integer.parseInt(matcherA.group(2));
        } 
        else if (matcherB.find()) 
        {
            this.re = Integer.parseInt(matcherB.group(1));
            this.im = 0;
        } 
        else if (matcherC.find()) 
        {
            this.re = 0;
            this.im = Integer.parseInt(matcherC.group(1));
        }
    }

    //metody

    //ustawienie czesci liczby urojonej
    public void set( int re, int im )
    {
        this.re = re;
        this.im = im;
    }

    //zwraca czesc rzeczywista liczby urojonej
    public int getRe()
    {
        return this.re;
    }

    //zwraca czesc urojona liczby urojonej
    public int getIm()
    {
        return this.im;
    }

    //wypisuje liczbe urojona w postaci 'a + bi'
    public void print()
    {
        if ( this.im == 0 )
            System.out.println( this.re );
        else if (this.im < 0)
            System.out.println( this.re + " - " + (-this.im) + "i" );
        else
            System.out.println( this.re + " + " + this.im + "i" );
    }

    //zwraca modul liczby zespolonej
    public double mod()
    {
        return Math.sqrt( this.re*this.re + this.im*this.im );
    }

    //zwraca sprzezenie liczby zespolonej
    public Complex conj()
    {
        this.im = -this.im;
        return this;
    }

    //metody statyczne

    //zwraca sume dwoch liczb urojonych
    public static Complex add ( Complex a, Complex b )
    {
        return new Complex ( a.re + b.re, a.im + b.im );
    }

    //zwraca roznice dwoch liczb urojonych
    public static Complex diff ( Complex a, Complex b )
    {
        return new Complex ( a.re - b.re, a.im - b.im );
    }

    //zwraca iloczyn dwoch liczb urojonych
    public static Complex prod ( Complex a, Complex b )
    {
        return new Complex ( a.re * b.re + a.im * b.im, a.re * b.im - a.im * b.re );
    }

    //zwraca iloraz dwoch liczb urojonych
    public static Complex div ( Complex a, Complex b )
    {
        return new Complex ( 
            (a.re*b.re + a.im*b.im) / (b.re^2 + b.im^2) ,
            (a.im*b.re - a.re*b.im) / (b.re^2 + b.im^2)
            );
    }

    //sprawdza, czy podane liczby zespolone sa sobie rowne
    public static boolean equal ( Complex a, Complex b )
    {
        if ( a == b )
            return true;
        else
            return false;
    }
}
