package br.com.ifsc_plus;

import br.com.ifsc_plus.view.MENU;

public class IFSC_plus {

    public static void main(String[] args) {

            java.awt.EventQueue.invokeLater(() -> {
        new MENU().setVisible(true);
    });
        
    }
}
