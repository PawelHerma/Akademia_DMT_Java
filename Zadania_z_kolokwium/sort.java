package Zadania_z_kolokwium;
// Dana jest lista [-3,0,56,12,-23,45,10,8]
// Napisz program, który wyświetli na ekranie największą liczbę z podanej listy.

public class sort 
{
    public static void main(String[] args)
    {
        int lista[] = {-3,0,56,12,-23,45,10,8};

        for( int i = 0; i < lista.length - 1 ; i++ )
        {
            if( lista[i] > lista[i+1] )
            {
                int pomoc = lista[i];
                lista[i] = lista[i+1];
                lista[i+1] = pomoc;
            }
        }

        System.out.print(lista[lista.length - 1]);
    }    
}
