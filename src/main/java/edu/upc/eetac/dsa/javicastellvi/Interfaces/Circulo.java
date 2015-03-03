package edu.upc.eetac.dsa.javicastellvi.Interfaces;

public class Circulo extends AbstractShape{

	double radio;
	
	public Circulo (double radio)
	{
		super("circulo");
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area ()
	{			
		return (3.14*radio*radio);
	}
	
}
