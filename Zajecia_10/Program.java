public class Program 
{
    public static void main(String[] args)
    {
        //test metod z klasy powtorka
        Powtorka.liczDoFor(5);
        boolean czyJest = Powtorka.jestPalindromem("oko");
        System.out.println(czyJest);

        //test konstruktora liczby zespolonej
        Complex liczba = new Complex();
        liczba.set(2,-2);
        liczba.print();

        //test konstruktora tworzącego liczbę zespoloną ze stringa
        Complex liczbaZtekstu = new Complex("2 - 3i");
        liczbaZtekstu.print();
    }    
}
