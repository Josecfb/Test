import java.util.Scanner;

public class EjercicioUF4_01 {
	public static void main(String[] args) {
		// Relleno de la matriz
		String matrizIngles[][] = { { "bear", "oso" }, { "cat", "gato" }, { "cheetah", "gepardo" }, { "dog", "perro" },
				{ "eagle", "águila" }, { "fish", "pez" }, { "frog", "rana" }, { "horse", "caballo" },
				{ "lion", "león" }, { "lizard", "lagarto" }, { "meerkat", "suricata" }, { "monkey", "mono" },
				{ "orangutan", "orangután" }, { "panther", "pantera" }, { "parrot", "loro" }, { "pig", "cerdo" },
				{ "tiger", "tigre" }, { "toad", "sapo" }, { "tortoise", "tortuga" }, { "mare", "yegua" } };
		String respuesta = new String();
		Scanner lector = new Scanner(System.in);
		int aciertos = 0, fallos = 0;
//		Desordena la matriz
		desordena(matrizIngles);
		
//		comienza el test
		for (int i = 0; i < 20; i++) {
			System.out.print("Traduce " + matrizIngles[i][0]+": ");
			respuesta = lector.nextLine();
			if (respuesta.equals(matrizIngles[i][1])) {
				System.out.println("Bien!");
				aciertos++;
			} else {
				System.out.println("No, es " + matrizIngles[i][1]);
				fallos++;
			}
		}
		lector.close();
		
//		resultados
		System.out.println("FIN DEL TEST");
		System.out.println("Has tenido "+ aciertos+" aciertos");
		System.out.println("Has tenido "+ fallos+" fallos");
	}

	private static void desordena(String[][] matrizIngles) {
		String aux1;
		String aux2;
		int j;
		for (int i = 0; i < 20; i++) {
			j = (int) (Math.random() * 20);
			aux1 = matrizIngles[i][0];
			matrizIngles[i][0] = matrizIngles[j][0];
			matrizIngles[j][0] = aux1;
			aux2 = matrizIngles[i][1];
			matrizIngles[i][1] = matrizIngles[j][1];
			matrizIngles[j][1] = aux2;
		}
	}

}

