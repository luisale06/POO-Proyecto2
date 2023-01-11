package org.example;

import configuracion.ciudades.BDciudad;
import configuracion.configuracionGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPrincipalGUI {
    // Frame
    JFrame frame = new JFrame();

    // Buttons
    JButton btnCrearPartida = new JButton("CREAR PARTIDA");
    JButton btnUnirsePartida = new JButton("UNIRSE PARTIDA");
    JButton btnConfiguracion = new JButton("CONFIGURACION");
    BDciudad ciudad = new BDciudad();

    public MenuPrincipalGUI(){
        frame.setSize(550, 600);
        frame.setLocation(400, 200);
        frame.setTitle("Menu");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCrearPartida.setBounds(120, 150, 295, 45);
        btnCrearPartida.setBackground(Color.lightGray);
        btnCrearPartida.setForeground(Color.darkGray);
        btnCrearPartida.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnUnirsePartida.setBounds(120, 195+45, 295, 45);
        btnUnirsePartida.setBackground(Color.lightGray);
        btnUnirsePartida.setForeground(Color.darkGray);
        btnUnirsePartida.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnConfiguracion.setBounds(120, 240+90, 295, 45);
        btnConfiguracion.setBackground(Color.lightGray);
        btnConfiguracion.setForeground(Color.darkGray);
        btnConfiguracion.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        frame.add(btnCrearPartida);
        frame.add(btnUnirsePartida);
        frame.add(btnConfiguracion);

//        try {ciudad.restaurar();} catch (IOException e) {throw new RuntimeException(e);}

        btnCrearPartida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Server server = new Server();
                btnCrearPartida.setEnabled(false);
            }
        });

        btnUnirsePartida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                btnUnirsePartida.setEnabled(false);
            }
        });

        btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configuracionGUI ventanaConfig = new configuracionGUI();
                frame.dispose();
            }
        });
    }
}
