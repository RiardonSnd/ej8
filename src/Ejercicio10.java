public class Ejercicio10 {
    public static void main(String[] args) {
        int counter;
        int moda = 0;
        int freq = 0;
        final char[] array = {'B','A','C','D','A','B','B','C','A','D','B','B','C','D'};
        for (int i = 0; i < array.length; i++) {
            counter = 0;
            char candidata = array[i];
            for (int j = 0; j < array.length; j++) {
                if (array[j] == candidata) {
                    counter++;
                }
            }
            if (counter > moda) {
                moda = i;
                freq = counter;
            }
        }
        System.out.println("La moda es " +array[moda]+ " y aparece " + freq+ " veces.");
    }
}