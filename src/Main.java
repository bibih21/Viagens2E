import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto    Construtor
        Turista mochileiro = new Turista("Maia");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        //Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome");
        mochileira.setNome(nome);
        System.out.println("O nome do objeto");


    }
}