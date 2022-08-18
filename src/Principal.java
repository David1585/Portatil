import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        System.out.println("hola mundo");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        JOptionPane.showMessageDialog(null, "el numero ingresado fue : "+ numero);


    }
}
