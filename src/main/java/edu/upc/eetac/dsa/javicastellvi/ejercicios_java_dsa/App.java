package edu.upc.eetac.dsa.javicastellvi.ejercicios_java_dsa;

public class App { 
	public static void main (String args[]) {
		Tree[] arboles = new Tree[4];
		arboles[0] = new Tree(4); 
		arboles[1] = new Tree("Roble"); 
		arboles[2] = new Tree(); 
		arboles[3] = new Tree(5,"Pino");
		
		int i = 0;
		while (i<=3){
	    	 if (arboles[i].getMetros()!=0){
	        System.out.println("Un " + arboles[i].getNombre() + " de " + arboles[i].getMetros() );
	       
	    	 }else{
	    		 System.out.println("Un " + arboles[i].getNombre());
	    		 
	    	 }
	    	 i++;
	}
	}
}