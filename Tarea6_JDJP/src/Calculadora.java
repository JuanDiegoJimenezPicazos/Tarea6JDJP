
/**
* Esta clase hace la funci�n de una calculadura
* @author Juan Diego Jimenez Picazos
* @version 1.0
*/

public class Calculadora {
	
	/**
	* M�todo constructor por defecto
	*/
	public Calculadora(){
        
    }
	
	/**
	* M�todo que suma dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la suma de los dos enteros
	*/
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
	/**
	* M�todo que resta dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la resta de los dos enteros
	*/
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
	/**
	* M�todo que multiplica dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la maltiplicaci�n de los dos enteros
	*/
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
	/**
	* M�todo que divide dos enteros
	* @param num1 Primer entero introducido
	* @param num2 Segundo entero introducido
	* @return Devuelve la divisi�n de los dos enteros
	*/
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
