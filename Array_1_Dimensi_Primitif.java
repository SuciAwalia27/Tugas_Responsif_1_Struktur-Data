package array_1_dimensi_primitif;
import java.util.Arrays;
public class Array_1_dimensi_primitif {

    public static void main(String[] args) {
        
        // ARRAY 1 DIMENSI TIPE DATA PRIMITIF
        
        // Integer
       System.out.println("\nArray Integer 1 Dimensi");
        int[] a = {1,2,3,4,5};
        System.out.println("Array: " + Arrays.toString(a));
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index ke-" + i + ": " + a[i]);
            
        }
        
        // Float
        System.out.println("\nArray Float 1 Dimensi");
        float[] b = {8.4f, 5.3f, 2.7f, 3.8f, 4.5f};
        System.out.println("Array: " + Arrays.toString(b));
        
        for (int u = 0; u < b.length; u++) {
            System.out.println("Index ke-" + u + ": " + b[u]);
            
        }
        
        // Double
        System.out.println("\nArray Double 1 Dimensi");
        double[] c = {1.75, 5.12, 4.23, 8.3, 3.64};
        System.out.println("Array :" + Arrays.toString(c));
        
        for (int j = 0; j < c.length; j++) {
            System.out.println("Index ke-" + j + ": " + c[j]);
            
        }
        
        // Short
        System.out.println("\nArray Short 1 Dimensi");
        short[] d = {10, 20, 30, 40, 50};
        System.out.println("Array :" + Arrays.toString(d));
        
        for (int p = 0; p < d.length; p++) {
            System.out.println("Index ke-" + p + ": " + d[p]);
            
        }
        
        // Long
        System.out.println("\nArray Long 1 Dimensi");
        long[] e = {1000000000L,5000000000L, 4000000000L, 3000000000L,2000000000L};
        System.out.println("Array :" + Arrays.toString(e));
        
        for (int w = 0; w < e.length; w++) {
            System.out.println("Index ke-" + w + ": " + e[w]);
            
        }
        
        // Byte
        System.out.println("\nArray Byte 1 Dimensi");
        byte[] f = {7, 5, 3, 8, 2};
        System.out.println("Array :" + Arrays.toString(f));
        
        for (int r = 0; r < f.length; r++) {
            System.out.println("Index ke-" + r + ": " + f[r]);
            
        }
        
        // Char
        System.out.println("\nArray Char 1 Dimensi");
        char[] g = {'S', 'U', 'C', 'I', 'A'};
        System.out.println("Array :" + Arrays.toString(g));
        
        for (int s = 0; s < g.length; s++) {
            System.out.println("Index ke-" + s + ": " + g[s]);
            
        }
        
        // Boolean
        System.out.println("\nArray Boolean 1 Dimensi");
        boolean[] h = {true, false, true, false, true};
        System.out.println("Array :" + Arrays.toString(h));
        
        for (int t = 0; t < h.length; t++) {
            System.out.println("Index ke-" + t + ": " + h[t]);
            
        }
    }
}
