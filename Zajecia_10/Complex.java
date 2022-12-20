import javax.lang.model.util.ElementScanner6;

public class Complex 
{
    private int re;
    private int im;

    //publiczny konstruktor
    public Complex()
    {
        
    }

    //prywatny kontruktor
    private Complex( int re , int im )
    {
        this.re = re;
        this.im = im;
    }

    // ustawienie czesci liczby urojonej
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

    //metody

    //zwraca czesc urojona liczby urojonej
    public int getIm()
    {
        return this.im;
    }

    //wypisuje liczbe urojona w postaci 'a + bi'
    public void print()
    {
        if ( this.im == 0 )
            System.out.print( this.re );
        else if (this.im < 0)
            System.out.print( this.re + " - " + (-this.im) + "i" );
        else
            System.out.print(this.re + " + " + this.im + "i");
    }

    //zwraca modul liczby zespolonej
    public double mod()
    {
        return Math.sqrt(this.re*this.re + this.im*this.im);
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
        return new Complex ( a.re * b.re + a.im + b.im, a.re * b.im - a.im * b.re );
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
