package arrays;
import java.util.*;
public class Ej_1y2 {
	
	public static void main(String[] args) {
	Scanner teclado= new Scanner (System.in);
	int [] array_asc= new int[10];
	for (int i=0; i<array_asc.length ;i++) {
		System.out.println("pls introduce 10 numeros");
		array_asc[i]=teclado.nextInt();
	}
    Arrays.sort(array_asc);
    int[] desc_array = new int[array_asc.length];
    for (int i = 0; i < array_asc.length; i++) {
        desc_array[i] = array_asc[array_asc.length - i - 1];
    }    
    System.out.println(Arrays.toString(array_asc));
    System.out.println(Arrays.toString(desc_array));
}
}
