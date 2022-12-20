public class Program 
{
    public static void main(String[] args)
    {
        Complex liczba = new Complex();
        liczba.set(2,2);
        System.out.println( liczba.mod() );
        liczba.conj().print();
    }    
}
