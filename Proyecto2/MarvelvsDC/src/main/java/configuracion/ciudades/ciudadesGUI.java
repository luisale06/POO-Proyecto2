package configuracion.ciudades;

import configuracion.configuracionGUI;
import org.example.MenuPrincipalGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ciudadesGUI {
    // Frame
    JFrame frame = new JFrame();

    // Buttons
    JButton btnCargarCiudad = new JButton("CARGAR UNA CIUDAD");
    JButton btnEditarCiudad = new JButton("EDITAR UNA CIUDAD");
    JButton btnAgregarCiudad = new JButton("AGREGAR UNA CIUDAD");
    JButton btnRegresar = new JButton("REGRESAR");

    public ciudadesGUI(){
        frame.setSize(550, 600);
        frame.setLocation(400, 200);
        frame.setTitle("Configuracion");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCargarCiudad.setBounds(120, 120, 295, 45);
        btnCargarCiudad.setBackground(Color.lightGray);
        btnCargarCiudad.setForeground(Color.darkGray);
        btnCargarCiudad.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnEditarCiudad.setBounds(120, 165+45, 295, 45);
        btnEditarCiudad.setBackground(Color.lightGray);
        btnEditarCiudad.setForeground(Color.darkGray);
        btnEditarCiudad.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnAgregarCiudad.setBounds(120, 210+90, 295, 45);
        btnAgregarCiudad.setBackground(Color.lightGray);
        btnAgregarCiudad.setForeground(Color.darkGray);
        btnAgregarCiudad.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnRegresar.setBounds(120, 255+135, 295, 45);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        frame.add(btnCargarCiudad);
        frame.add(btnEditarCiudad);
        frame.add(btnAgregarCiudad);
        frame.add(btnRegresar);

        btnCargarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnEditarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnAgregarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configuracionGUI ventanaConfiguracion = new configuracionGUI();
                frame.dispose();
            }
        });

    }
}
