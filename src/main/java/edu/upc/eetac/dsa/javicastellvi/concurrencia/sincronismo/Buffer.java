package edu.upc.eetac.dsa.javicastellvi.concurrencia.sincronismo;

public class Buffer {

	
	private char[] vector= new char[32];
	
	public char lectura(){
		
		boolean encontrado = false;
		for (int i=0; i< vector.length && !encontrado; i++){
			
			if (vector[i] == '\u0000' ){
				i++;
			}
			else{
				
				char caracter = vector[i];
				vector[i]= '\u0000'; //null character
				encontrado = true;				
				return caracter;
				
			}
		}
		
		//si no hemos encontrado ninguna posicion ocupada

		System.out.println("No hay posiciones con carácteres");
		return '\u0000';

		
	}
	
	public void escritura(char caracter){
		
		boolean visto = false;
		for (int i=0; i< vector.length && !visto; i++){
			
			if (vector[i] == '\u0000' ){
				vector[i]= caracter;
				visto= true;
				
			}
			else{
				
				i++;
				
			}
		}
		
		if (visto== false){
		System.out.println("No se a podido escribir en el vector"); 
		} 
	}

	public char[] getVector() {
		return vector;
	}

	public void setVector(char[] vector) {
		this.vector = vector;
	}
	
}


