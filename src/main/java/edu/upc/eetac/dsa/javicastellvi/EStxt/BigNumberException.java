package edu.upc.eetac.dsa.javicastellvi.EStxt;

public class BigNumberException extends Exception {
	
	private Throwable causa;
	private String message;
	
	public BigNumberException(String message) {
		super();
		this.message = message;
	}


	public BigNumberException(Throwable causa, String message) {
		super();
		this.causa = causa;
		this.message = message;
	}



	public Throwable getCausa() {
		return causa;
	}


	public void setCausa(Throwable causa) {
		this.causa = causa;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}


