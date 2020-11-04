package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Alegeti un numar de la 1 la 10"));
        int random = (1 + (int) (Math.random() * 10));
        int contor = 1;
        while (number != random) {
            if (number > random) {
                JOptionPane.showMessageDialog(null, "Numarul " + number + " este prea mare");
                number=Integer.parseInt(JOptionPane.showInputDialog(null, "Alegeti un numar de la 1 la 10"));
                contor++;
            } else {
                JOptionPane.showMessageDialog(null, "Numarul " + number + " este prea mic");
                number=Integer.parseInt(JOptionPane.showInputDialog(null, "Alegeti un numar de la 1 la 10"));
                contor++;
            }
        }
        if(number==random)
            JOptionPane.showMessageDialog(null, "Ati ghicit");
        JOptionPane.showMessageDialog(null, "Numarul de incercari este: " + contor);
    }
}
