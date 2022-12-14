package Zadania_z_kolokwium;
// Słabnią nazywamy sumę kolejnych liczb naturalnych nieprzekraczających n. 
// n?=1+2+3+...n
// Napisz program, który pobiera od użytkownika liczbę n, a następnie wypisuje na ekranie 
// ile wynosi słabna dla podanej liczby, np: 5?=15.

import java.util.Scanner;
public class slabnia
{
    public static int liczSlabnie(int n)
    {
        int output = 0;
        for ( int i = 1; i <= n; i++ )
        {
            output += i;
        }
        return output;
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.print("Podaj n: "); 
        n = input.nextInt();
        System.out.print("Slabnia wynosi: " + liczSlabnie(n));
        input.close();
    }
}