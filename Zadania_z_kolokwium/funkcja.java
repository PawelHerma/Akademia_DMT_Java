// Napisz funkcję wzor(x), posiadającą jeden argument.
// Funkcja ma obliczać wartość wyrażenia:
// 3x2 -6x-1

package Zadania_z_kolokwium;
import java.util.Scanner;
public class funkcja 
{
    public static float wzor(float x)
    {
        return 3*x*x - 6*x - 1;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj x: ");
        float x = input.nextFloat();
        System.out.print("f(x) = " + wzor(x));
        input.close();
    }
}
