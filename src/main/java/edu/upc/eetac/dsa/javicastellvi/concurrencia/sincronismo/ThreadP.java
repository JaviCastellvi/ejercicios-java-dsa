package edu.upc.eetac.dsa.javicastellvi.concurrencia.sincronismo;

public class ThreadP implements Runnable{
	
	
	//Recorremos el string para asignarselo al vector de chars de la instancia
	//de la clase buffer
	
	public ThreadP(Buffer buf,char c){
		
		buf.escritura(c);
	}
	
	
	@Override
	public void run(){
		
		
	}
	
	
//	public void insertBuffer(String cadenainput){
//		
//		char[] cadena = cadenainput.toCharArray();
//		
//		char[] cadenabuffer= new char[32];
//		
//		for(int i = 0; i< cadena.length;i++){
//			
//			cadenabuffer[i]= cadena[i];			
//		}
//		
//		
//		buffer.setVector(cadenabuffer);
//	}
}

