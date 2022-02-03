public class Principal {

	public static void main(String[] args) {

		int[] valoresExemplo = { 1, 6, 34, 2, 3, 6, 8, 9, 10, 11 };

		Ordenacao ord = new Ordenacao();
		int[] arrayOrdenado = ord.HeapSort(valoresExemplo);

		for (int i = 0; i < arrayOrdenado.length; i++) {
			System.out.println(arrayOrdenado[i]);
		}
	}
}
