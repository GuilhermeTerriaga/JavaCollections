package br.com.guilherme.java.collections.models;

public class Recibo implements Comparable<Recibo> {
    private int numero;

    public Recibo(int numero) {
        if (numero < 0) {
            throw new NullPointerException("Numero não pode ser negativo");
        }
        this.numero = numero;
    }

    @Override
    public int compareTo(Recibo o) {
        return o.numero - this.numero;
    }

    @Override
    public String toString() {
        return "Recibo [numero=" + numero + "]";
    }


}
