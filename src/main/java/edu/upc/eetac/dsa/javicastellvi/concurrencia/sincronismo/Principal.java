package edu.upc.eetac.dsa.javicastellvi.concurrencia.sincronismo;

public class Principal {
    public static void main(String[] args) {
        String line = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.\n";
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new ThreadP(buffer, line), "producer");
        Thread consumer = new Thread(new ThreadC(buffer), "consumer");

        consumer.start();
        producer.start();
    }
}
