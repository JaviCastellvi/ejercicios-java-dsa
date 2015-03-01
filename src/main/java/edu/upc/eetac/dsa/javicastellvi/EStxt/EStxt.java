package edu.upc.eetac.dsa.javicastellvi.EStxt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class EStxt {

	
	public static void main(String[] args) throws IOException,FileParsingException, BigNumberException{
		
		double media = leerficheroTexto("C:/ficherojavi.txt");
		
		System.out.println("La media es = "+media);
		
		
	}
	/**
	 * Método para leer un fichero de texto
	 * @param ruta_fichero
	 * @return media de los numeros
	 * @author Javi Castellví
	 * @throws BigNumberException
	 * @throws FileParsingException 
	 */
	
	public static double leerficheroTexto(String ruta_fichero) throws FileParsingException, BigNumberException{
		
		double contador=0;
		double suma=0;
		double media= 0.0;
		byte[] ficherobytes = null;

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(ruta_fichero));
			
		
		String line;		
		
		
		while ((line = br.readLine()) != null) {
			
			double numero = Integer.parseInt(line);
			
			if(numero < 1000){
				
				suma = suma +numero;	
				
			}
			else {
				
				throw new BigNumberException ("Numero mayor de 1000 en linea "+(int)contador);
			}
			contador++;
			
			
		   
		}
		br.close();		
		
		} catch (FileNotFoundException e) {
			
			System.out.println("No se ha encontrado el fichero");

		}
		catch(IOException | NumberFormatException e){
			
		
			throw new FileParsingException(e.getMessage());
			
			
		}
		catch (BigNumberException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		
		
		media = suma /contador;
		
		
		return media;
	}
	
	
	
}
