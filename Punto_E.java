
public class Punto_E {

	public static void main(String[] args) {
		 String[] cursos={"Estatica", "Electrotecnia","Fisica"}; 
		 int[] notas={6,10,7};
		 double acumulador_notas=0;
		 
		 System.out.println("Cursos y notas");
		 
		 System.out.println("------------------------");
		 
		 for (int i=0;i<3;i++){
			 
		 System.out.println(cursos[i] + " " + notas[i]);
		 
		 acumulador_notas= acumulador_notas + notas[i]; 
		 }
		 
		 System.out.println("------------------------");
		 
		 System.out.println("El promedio de notas de los tres cursos es " + acumulador_notas/3);
	}

}
