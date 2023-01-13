public class Program 
{
    public static void main(String[] args)
    {
        Powtorka.liczDoFor(5);
        boolean czyJest = Powtorka.jestPalindromem("oko");
        System.out.println(czyJest);

        Complex liczba = new Complex();
        liczba.set(2,-2);
        liczba.print();


        Complex liczbaZtekstu = new Complex("2 - 3i");
        liczbaZtekstu.print();
    }    
}
