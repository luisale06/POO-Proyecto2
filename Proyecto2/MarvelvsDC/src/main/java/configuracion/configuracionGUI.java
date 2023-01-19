package configuracion;

import configuracion.ciudades.ciudadesGUI;
import configuracion.personajes.personajesGUI;
import configuracion.usuarios.usuariosGUI;
import org.example.Client;
import org.example.MenuPrincipalGUI;
import org.example.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class configuracionGUI {
    // Frame
    JFrame frame = new JFrame();

    // Buttons
    JButton btnCiudades = new JButton("CIUDADES");
    JButton btnPersonajes = new JButton("PERSONAJES");
    JButton btnUsuarios = new JButton("USUARIOS");
    JButton btnRegresar = new JButton("REGRESAR");

    public configuracionGUI(){
        frame.setSize(550, 600);
        frame.setLocation(400, 200);
        frame.setTitle("Configuracion");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCiudades.setBounds(120, 120, 295, 45);
        btnCiudades.setBackground(Color.lightGray);
        btnCiudades.setForeground(Color.darkGray);
        btnCiudades.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnPersonajes.setBounds(120, 165+45, 295, 45);
        btnPersonajes.setBackground(Color.lightGray);
        btnPersonajes.setForeground(Color.darkGray);
        btnPersonajes.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnUsuarios.setBounds(120, 210+90, 295, 45);
        btnUsuarios.setBackground(Color.lightGray);
        btnUsuarios.setForeground(Color.darkGray);
        btnUsuarios.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnRegresar.setBounds(120, 255+135, 295, 45);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        frame.add(btnCiudades);
        frame.add(btnPersonajes);
        frame.add(btnUsuarios);
        frame.add(btnRegresar);

        btnCiudades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadesGUI ventanaCiudades = new ciudadesGUI();
                frame.dispose();
            }
        });

        btnPersonajes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personajesGUI ventanaPersonajesGUI = new personajesGUI();
                frame.dispose();
            }
        });

        btnUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuariosGUI ventanaUsuariosGUI = new usuariosGUI();
                frame.dispose();
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipalGUI ventanaMenu = new MenuPrincipalGUI();
                frame.dispose();
            }
        });

    }
}
