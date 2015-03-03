package edu.upc.eetac.dsa.javicastellvi.Interfaces;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Rectangulo extends AbstractShape {

	int altura; 
	int base;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}



	public Rectangulo (int altura, int base)
	{
		super("rectangulo");
		this.altura = altura;
		this.base= base;
	}
	public double area ()
	{
		return (base*altura);
	}
	
	public static void main(String[] args) throws IOException{
		
		
		
	}



	
}
