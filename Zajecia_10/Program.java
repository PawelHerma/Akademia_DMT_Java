public class Program 
{
    public static void main(String[] args)
    {
        Complex liczba = new Complex();
        liczba.set(2,2);
        Complex tekst = new Complex("3 + 3i");
        tekst.print();
        System.out.println( liczba.mod() );
        liczba.conj().print();
    }    
}
