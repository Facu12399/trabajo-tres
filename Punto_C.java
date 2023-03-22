
public class Punto_C {

	public static void main(String[] args) {
		int[] numeros = new int[]{3,7,14,29,38,42,48,61,89,90};
		int pos=0;
		
		for(int i=0;i<numeros.length;i++) {
			
			pos++;
			
			if (pos == 6) {
				numeros[6]=numeros[6]/3;
				System.out.println(numeros[6]);
			}
			
		}

	}

}
