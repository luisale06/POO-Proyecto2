package configuracion.usuarios;

import configuracion.configuracionGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class usuariosGUI {
    JFrame frame = new JFrame();
    JButton btnAgregarUsuario = new JButton("AGREGAR USUARIO");
    JButton btnEliminarUsuario = new JButton("ELIMINAR USUARIO");
    JButton btnEditarUsuario = new JButton("EDITAR USUARIO");
    JButton btnRegresar = new JButton("REGRESAR");

    public usuariosGUI(){
        frame.setSize(550, 600);
        frame.setLocation(400, 200);
        frame.setTitle("Usuarios");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAgregarUsuario.setBounds(120, 120, 295, 45);
        btnAgregarUsuario.setBackground(Color.lightGray);
        btnAgregarUsuario.setForeground(Color.darkGray);
        btnAgregarUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnEliminarUsuario.setBounds(120, 165+45, 295, 45);
        btnEliminarUsuario.setBackground(Color.lightGray);
        btnEliminarUsuario.setForeground(Color.darkGray);
        btnEliminarUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnEditarUsuario.setBounds(120, 210+90, 295, 45);
        btnEditarUsuario.setBackground(Color.lightGray);
        btnEditarUsuario.setForeground(Color.darkGray);
        btnEditarUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        btnRegresar.setBounds(120, 255+135, 295, 45);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

        frame.add(btnAgregarUsuario);
        frame.add(btnEliminarUsuario);
        frame.add(btnEditarUsuario);
        frame.add(btnRegresar);

        btnAgregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuarioGUI ventanaAgregarUsuario = new agregarUsuarioGUI();
                frame.dispose();
            }
        });

        btnEliminarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuarioGUI ventanaEliminarUsuario = new eliminarUsuarioGUI();
                frame.dispose();
            }
        });

        btnEditarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarUsuarioGUI ventanaEditarUsuario = new editarUsuarioGUI();
                frame.dispose();
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configuracionGUI ventanaMenu = new configuracionGUI();
                frame.dispose();
            }
        });
    }

}
