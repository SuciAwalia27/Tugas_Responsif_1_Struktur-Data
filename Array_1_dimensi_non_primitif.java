package array_1_dimensi_non_primitif;
import java.util.Arrays;

public class Array_1_dimensi_non_primitif {

    
    public static void main(String[] args) {
        // Mendeklarasikan array String dengan 3 elemen
        String[] stringArray = {"Hello", "World", "Suci"};        
        System.out.println("Isi array:" + Arrays.toString(stringArray));
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element ke-" + i + ": " + stringArray[i]);

}
    }
    
}
