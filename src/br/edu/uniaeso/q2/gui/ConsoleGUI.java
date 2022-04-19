package br.edu.uniaeso.q2.gui;

import java.util.Scanner;

import br.edu.uniaeso.q2.business.Terreno;

/**
 * Uma imobiliária vende apenas terrenos retangulares. Faça um programa em java
 * para ler as dimensões de um terreno e depois exibir a área do terreno. (lado
 * x * altura)
 */

public class ConsoleGUI {
    private double txtLado;
    private double txtComprimento;

    private Scanner scanner;
    private Terreno terreno;

    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public ConsoleGUI() {
        setScanner(new Scanner(System.in));
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getTxtLado() {
        return txtLado;
    }

    public void setTxtLado(double txtLado) {
        this.txtLado = txtLado;
    }

    public double getTxtComprimento() {
        return txtComprimento;
    }

    public void setTxtComprimento(double txtComprimento) {
        this.txtComprimento = txtComprimento;
    }

    public void gui() {
        System.out.println("Entre com o lado do terreno");
        setTxtLado(getScanner().nextDouble());

        System.out.println("Entre com o comprimento do terreno");
        setTxtComprimento(getScanner().nextDouble());

        setTerreno(new Terreno(getTxtLado(), getTxtComprimento()));
        System.out.printf("O terreno tem %f", getTerreno().calculateArea());
    }

}
