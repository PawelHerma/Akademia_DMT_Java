public class Program 
{
    public static void main(String[] args)
    {
        Complex liczba = new Complex();
        liczba.set(2,2);
        String tekst = "3 + 5i";
        Complex liczba_z_tekstu = new Complex();
        liczba_z_tekstu.setFromText(tekst);
        liczba_z_tekstu.print();
        System.out.println( liczba_z_tekstu.mod() );
        liczba_z_tekstu.conj().print();
        System.out.print( "Suma dwoch liczb ");
        Complex.add(liczba, liczba_z_tekstu).print();
    }    
}
