/*Crear una funci�n que calcule la temperatura media de un d�a a partir de la temperatura
m�xima y m�nima. Crear un programa principal, que utilizando la funci�n anterior, vaya pidiendo
la temperatura m�xima y m�nima de cada d�a y vaya mostrando la media.*/
package Temperatura;

public class Temperatura {
	//Variables
	private double temMax;
	private double temMin;
	
	public double getTemperaturaMedia(double tempMin,double tempMax){
		return (tempMin+tempMax)/2;
	}
}