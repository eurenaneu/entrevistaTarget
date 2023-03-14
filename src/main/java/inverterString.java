import javax.swing.*;

public class inverterString {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra/frase:");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = palavra.length() - 1; i >= 0; i--) {
            stringBuilder.append(palavra.charAt(i));
            System.out.println(stringBuilder);
        }

    }
}
