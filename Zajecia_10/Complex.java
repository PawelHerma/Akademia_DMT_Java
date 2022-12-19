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
        Complex complex = new Complex() ;
        complex.re = re;
        complex.im = im;
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
        System.out.print(this.re + " + " + this.im + "i");
    }

    //zwraca modul liczby zespolonej
    public double mod ( Complex complex )
    {
        return Math.sqrt(complex.re^2 + complex.im^2);
    }

    //zwraca sprzezenie liczby zespolonej
    public Complex conj ( Complex complex )
    {
        Complex com = new Complex ( complex.re, -complex.im );
        return com;
    }

    //metody statyczne

    //zwraca sume dwoch liczb urojonych
    public static Complex add ( Complex a, Complex b )
    {
        Complex com = new Complex ( a.re + b.re, a.im + b.im );
        return com;
    }

    //zwraca roznice dwoch liczb urojonych
    public static Complex diff ( Complex a, Complex b )
    {
        Complex com = new Complex ( a.re - b.re, a.im - b.im );
        return com;
    }

    //zwraca iloczyn dwoch liczb urojonych
    public static Complex prod ( Complex a, Complex b )
    {
        Complex com = new Complex ( a.re * b.re + a.im + b.im, a.re * b.im - a.im * b.re );
        return com;
    }

    //zwraca iloraz dwoch liczb urojonych
    public static Complex div ( Complex a, Complex b )
    {
        Complex com = new Complex ( 
            (a.re*b.re + a.im*b.im) / (b.re^2 + b.im^2) ,
            (a.im*b.re - a.re*b.im) / (b.re^2 + b.im^2)
            );
        return com;
    }

    //sprawdza, czy podane liczby zespolone sa sobie rowne
    public static boolean equal ( Complex a, Complex b )
    {
        if ( a.re == b.re && a.im == b.im )
            return true;
        else
            return false;
    }
}
