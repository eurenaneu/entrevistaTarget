import javax.swing.*;
import java.util.ArrayList;

public class sequenciaFibonacci {

    public static void main(String[] args){
        ArrayList<Integer> sequencia = new ArrayList<>();

        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

            for (int i = 0; fibonacci(i) <= numero; i++) {
                sequencia.add(fibonacci(i));
            }

            if (sequencia.contains(numero)) {
                JOptionPane.showMessageDialog(null, numero + " está na sequência de Fibonacci!");
            }

            else {
                JOptionPane.showMessageDialog(null, numero + " não está na sequência de Fibonacci!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, encerrando programa");
        }
    }

    public static int fibonacci(int n){
        if(n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
