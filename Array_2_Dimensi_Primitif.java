package array_2_dimensi_primitif;

public class Array_2_dimensi_primitif {

    public static void main(String[] args) {
        // ARRAY 2 DIMENSI BERTIPE PRIMITIF
        
        // Integer
        int[][] intArray = new int[3][2];
        intArray[0][0] = 100;
        intArray[0][1] = 200;
        intArray[1][0] = 300;
        intArray[1][1] = 400;
        intArray[2][0] = 500;
        intArray[2][1] = 600;
        
        System.out.println("Array 2 Dimensi - Integer:");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + intArray[i][j]);
            }
        }
        
        // Byte
        byte[][] byteArray = new byte[3][2];
        
        byteArray[0][0] = 1;
        byteArray[0][1] = 2;
        byteArray[1][0] = 3;
        byteArray[1][1] = 4;
        byteArray[2][0] = 5;
        byteArray[2][1] = 6;
        
        System.out.println("\nArray 2 Dimensi - Byte:");
        for (int i = 0; i < byteArray.length; i++) {
            for (int j = 0; j < byteArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + byteArray[i][j]);
            }
        }
        
        // Short
        short[][] shortArray = new short[3][2];
        
        shortArray[0][0] = 10;
        shortArray[0][1] = 20;
        shortArray[1][0] = 30;
        shortArray[1][1] = 40;
        shortArray[2][0] = 50;
        shortArray[2][1] = 60;
        
        System.out.println("\nArray 2 Dimensi - Short:");
        for (int i = 0; i < shortArray.length; i++) {
            for (int j = 0; j < shortArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + shortArray[i][j]);
            }
        }
        
        // Long
        long[][] longArray = new long[3][2];
        
        longArray[0][0] = 1000000000L;
        longArray[0][1] = 2000000000L;
        longArray[1][0] = 3000000000L;
        longArray[1][1] = 4000000000L;
        longArray[2][0] = 5000000000L;
        longArray[2][1] = 6000000000L;
        
        System.out.println("\nArray 2 Dimensi - Long:");
        for (int i = 0; i < longArray.length; i++) {
            for (int j = 0; j < longArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + longArray[i][j]);
            }
        }
        
        // Float
        float[][] floatArray = new float[3][2];
        
        floatArray[0][0] = 1.1f;
        floatArray[0][1] = 2.2f;
        floatArray[1][0] = 3.3f;
        floatArray[1][1] = 4.4f;
        floatArray[2][0] = 5.5f;
        floatArray[2][1] = 6.6f;
        
        System.out.println("\nArray 2 Dimensi - Float:");
        for (int i = 0; i < floatArray.length; i++) {
            for (int j = 0; j < floatArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + floatArray[i][j]);
            }
        }
        
        // Double
        double[][] doubleArray = new double[3][2];
        
        doubleArray[0][0] = 1.11;
        doubleArray[0][1] = 2.22;
        doubleArray[1][0] = 3.33;
        doubleArray[1][1] = 4.44;
        doubleArray[2][0] = 5.55;
        doubleArray[2][1] = 6.66;
        
        System.out.println("\nArray 2 Dimensi - Double:");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + doubleArray[i][j]);
            }
        }
        
        // Char
        char[][] charArray = new char[3][2];
        
        charArray[0][0] = 'A';
        charArray[0][1] = 'B';
        charArray[1][0] = 'C';
        charArray[1][1] = 'D';
        charArray[2][0] = 'E';
        charArray[2][1] = 'F';
        
        System.out.println("\nArray 2 Dimensi - Char:");
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + charArray[i][j]);
            }
        }
        
        // Boolean
        boolean[][] booleanArray = new boolean[3][2];
        
        booleanArray[0][0] = true;
        booleanArray[0][1] = false;
        booleanArray[1][0] = true;
        booleanArray[1][1] = false;
        booleanArray[2][0] = true;
        booleanArray[2][1] = false;
        
        System.out.println("\nArray 2 Dimensi - Boolean:");
        for (int i = 0; i < booleanArray.length; i++) {
            for (int j = 0; j < booleanArray[i].length; j++) {
                System.out.println("Element ke-" + i + "," + j + ": " + booleanArray[i][j]);
            }
        }
    }
}
