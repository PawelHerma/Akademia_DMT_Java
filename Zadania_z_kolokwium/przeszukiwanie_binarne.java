// Używając algorytmu przeszukiwania binarnego rozwiązać równanie:
// x2=2
// z dokładnością do 0,0001.

package Zadania_z_kolokwium;

public class przeszukiwanie_binarne 
{
    public static void main(String[] args)
    {
        double min = 1.0d;
        double max = 2.0d;
        double mid = (min + max) / 2;
        double epsilon = 0.0001d;
        while( max - min > epsilon )
        {
            if( mid*mid > 2 )
            {
                max = mid;
                mid = (max + min) / 2;
            }
            else
            {
                min = mid;
                mid = (max + min) / 2;
            }
        }
        System.out.print(mid);
    }
}
