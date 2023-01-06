package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase contiene los métodos necesarios para ejecutar el programa desde cero
 * @author Luis Alejandro Barreda Acevedo
 * @see seleccionJugadores
 */
public class seleccionJugadores {
    JFrame frame = new JFrame();
    JButton inicio = new JButton("Inicio");

    /**
     * Este método constructor se encarga de crear el JFrame y agregarle los JButtons, JLabels y demás
     * objetos que permiten la correcta visualización de la aplicación. Esta interfaz es
     * sencilla, solo se utiliza para ejecutar ambos tableros a la vez. Más adelante se explica
     * el funcionamiento de la clase randomCasillas; sin embargo, en esta clase se le asignan
     * 4 de estas al primer tablero y las otras 4 al otro tablero.
     */
    seleccionJugadores(){
        frame.setSize(250, 100);
        frame.setLocation(400, 200);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("MathSocket");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inicio.setBounds(40, 25, 90, 20);
        inicio.setBackground(Color.lightGray);
        inicio.setForeground(Color.darkGray);
        frame.add(inicio);

        inicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                Server server = new Server();
                inicio.setEnabled(false);
                frame.dispose();
            }
        });
    }
}
