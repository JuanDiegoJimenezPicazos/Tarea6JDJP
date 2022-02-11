
/**
* Esta clase oredena arrays e intercambia sus parámetros si es necesario
* @author Juan Diego Jimenez Picazos
* @version 1.0
*/

package Tarea6_JDJP;

/**
* Método que ordena un array
*/

public class Ordenacion {
	
	/**
	* Método que ordena los valores de un array
	* @param array Array introducido
	*/
	
	public void ordenarArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambio(array, i, maxValue);
			imprimirArray(array);
		}
	}
	
	/**
	* Método que ordena los valores de un array
	* @param numbers Array introducido
	* @return Devuelve los números
	*/
	
	public int[] ordenarArray2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	* Método que imprime el array en pantalla
	* @param array Array introducido
	*/
	
	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	* Método que intercambia los valores del array
	* @param array Array introducido
	* @param a Valor 1 para comparar
	* @param b Valor 2 para comparar
	*/
	
	public void intercambio(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}