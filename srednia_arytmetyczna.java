public class srednia_arytmetyczna 
{
    public static void main(String[] args)
    {
        int lista[] = {20,12,2,5,11,3};
        int suma = 0;
        for (int i = 0 ; i < lista.length ; i++) 
        {
            suma += lista[i];
        }
        System.out.print("Srednia arytmetyczna elementow tablicy wynosi: " + suma/lista.length);
    }    
}
