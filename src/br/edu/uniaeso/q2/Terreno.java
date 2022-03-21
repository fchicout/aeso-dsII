package br.edu.uniaeso.q2;

/**
 * Terreno
 */
public class Terreno {
    private double lado;
    private double comprimento;

    public Terreno(double lado, double comprimento){
        setComprimento(comprimento);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double calculateArea() {
        return getComprimento()*getLado();
    }
}