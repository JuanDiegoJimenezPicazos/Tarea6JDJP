
/**
* Esta clase hace la función de una calculadura
* @author Juan Diego Jimenez Picazos
* @version 1.0
*/

public class Calculadora {
	
	/**
	* Método constructor por defecto
	*/
	public Calculadora(){
        
    }
	
	/**
	* Método que suma dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la suma de los dos enteros
	*/
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
	/**
	* Método que resta dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la resta de los dos enteros
	*/
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
	/**
	* Método que multiplica dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la maltiplicación de los dos enteros
	*/
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
	/**
	* Método que divide dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la división de los dos enteros
	*/
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
