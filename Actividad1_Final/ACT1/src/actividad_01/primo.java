package actividad_01;

import java.util.Scanner;

public class primo extends Thread{
	
	private String palabra;
	
	public primo (String palabra) {
		super(palabra);
		this.palabra=palabra;
		}
	
	public void run() {
		
		long inicio = System.nanoTime();
		
		System.out.println("Introduzca un n�mero: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		int count = 0;
		
	    int i;
	    
	    //si al dividir el n�mero entre i da 0 el resto se suma 1 al contador
	    
	    for ( i=1;i<=numero;i++) {
		if (numero%i==0) {
			count++;
			}
		}
	
	    /*Una vez terminado el for anterior si el contador se ha sumado un n�mero distinto a 2
	  	ser� que el n�mero no es primo ya que este lo es cuando solo tiene dos divisores el mismo e 1
	    */
	
		i-=1;
		if (count != 2) {
			System.out.println("El n�mero "+i+" no es primo");
		}else {
			System.out.println("El n�mero "+i+" es primo");
		}
	
		System.out.println("El "+this.getName()+ " ha terminado");
		
		long fin = System.nanoTime();
		
		//para pasarlo a segundos
		
		double dif = (double) (fin - inicio) * 1.0e-9;
		
		System.out.println();
		
		System.out.println("El programa dura " + dif + " segundos");		
			
		
		
	}
	
	
	
	

}
