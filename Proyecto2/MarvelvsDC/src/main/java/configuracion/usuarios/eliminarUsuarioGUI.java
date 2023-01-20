package configuracion.usuarios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class eliminarUsuarioGUI {
    JFrame frame = new JFrame();

    JComboBox<usuario> cmbUsuarios = new JComboBox<>();

    JLabel lblNombre = new JLabel("Nombre:");
    JLabel lblApellidos = new JLabel("Apellidos");
    JLabel lblNombreUsuario = new JLabel("Nombre de Usuario:");
    JLabel lblCorreo = new JLabel("Correo:");
    JLabel lblContraseña = new JLabel("Contraseña:");

    JTextField txtNombre = new JTextField();
    JTextField txtApellidos = new JTextField();
    JTextField txtNombreUsuario = new JTextField();
    JTextField txtCorreo = new JTextField();
    JTextField txtContraseña = new JTextField();

    JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
    JButton btnRegresar = new JButton("Regresar");

    BDusuario usuario = new BDusuario();
    usuario usuarioSeleccionado;

    public eliminarUsuarioGUI() throws IOException{
        frame.setSize(550,600);
        frame.setLocation(400,200);
        frame.setTitle("Editar Usuario");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usuario.restaurar();

        lblNombre.setFont(new Font("Segoe UI",Font.PLAIN, 20));
        lblNombre.setBackground(Color.white);
        lblNombre.setOpaque(true);
        lblNombre.setBounds(43, 165, 190, 25);
        lblNombre.setHorizontalAlignment(JLabel.RIGHT);

        lblApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblApellidos.setBackground(Color.white);
        lblApellidos.setOpaque(true);
        lblApellidos.setBounds(43, 217, 190, 25);
        lblApellidos.setHorizontalAlignment(JLabel.RIGHT);

        lblNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 19));
        lblNombreUsuario.setBackground(Color.white);
        lblNombreUsuario.setOpaque(true);
        lblNombreUsuario.setBounds(43, 269, 190, 25);
        lblNombreUsuario.setHorizontalAlignment(JLabel.RIGHT);

        lblCorreo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblCorreo.setBackground(Color.white);
        lblCorreo.setOpaque(true);
        lblCorreo.setBounds(43, 321, 190, 25);
        lblCorreo.setHorizontalAlignment(JLabel.RIGHT);

        lblContraseña.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblContraseña.setBackground(Color.white);
        lblContraseña.setOpaque(true);
        lblContraseña.setBounds(43, 373, 190, 25);
        lblContraseña.setHorizontalAlignment(JLabel.RIGHT);

        frame.add(lblNombre);
        frame.add(lblApellidos);
        frame.add(lblNombreUsuario);
        frame.add(lblCorreo);
        frame.add(lblContraseña);

        txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtNombre.setBounds(252, 165, 190, 25);
        txtNombre.setEditable(false);

        txtApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtApellidos.setBounds(252, 217, 190, 25);
        txtApellidos.setEditable(false);

        txtNombreUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtNombreUsuario.setBounds(252, 269, 190, 25);
        txtNombreUsuario.setEditable(false);

        txtCorreo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtCorreo.setBounds(252, 321, 190, 25);
        txtCorreo.setEditable(false);

        txtContraseña.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtContraseña.setBounds(252, 373, 190, 25);
        txtContraseña.setEditable(false);

        frame.add(txtNombre);
        frame.add(txtApellidos);
        frame.add(txtNombreUsuario);
        frame.add(txtCorreo);
        frame.add(txtContraseña);

        cmbUsuarios.setModel(new DefaultComboBoxModel(usuario.getUsuarios().toArray()));
        cmbUsuarios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbUsuarios.setBounds(43, 133, 442, 25);
        cmbUsuarios.setBackground(Color.white);
        ((JLabel) cmbUsuarios.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        frame.add(cmbUsuarios);

        btnRegresar.setBounds(75, 460, 190, 60);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 20));

        btnEliminarUsuario.setBounds(275, 460, 190, 60);
        btnEliminarUsuario.setBackground(Color.lightGray);
        btnEliminarUsuario.setForeground(Color.darkGray);
        btnEliminarUsuario.setFont(new Font("Segoe UI", Font.BOLD, 20));

        frame.add(btnRegresar);
        frame.add(btnEliminarUsuario);

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuariosGUI ventanaUsuarios = new usuariosGUI();
                frame.dispose();
            }
        });

        cmbUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuarioSeleccionado = (usuario) cmbUsuarios.getSelectedItem();

                if (usuarioSeleccionado != null) {
                    txtNombre.setText(usuarioSeleccionado.getNombre());
                    txtApellidos.setText(usuarioSeleccionado.getApellidos());
                    txtNombreUsuario.setText(usuarioSeleccionado.getUsername());
                    txtCorreo.setText(usuarioSeleccionado.getCorreo());
                    txtContraseña.setText(usuarioSeleccionado.getContraseña());

                } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });

        btnEliminarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtNombre.getText().equals("") && !txtApellidos.getText().equals("") && !txtNombreUsuario.getText().equals("") && !txtCorreo.getText().equals("") && !txtContraseña.getText().equals("")) {
                    usuario usuarioSeleccionado = new usuario(txtNombre.getText(), txtApellidos.getText(), txtNombreUsuario.getText(), txtCorreo.getText(), txtContraseña.getText());

                    if (usuario.existeUsuario(usuarioSeleccionado)) {
                        usuario.delUsuario(usuarioSeleccionado);

                        try {usuario.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}

                        JOptionPane.showMessageDialog(null, "El usuario se ha eliminado con exito.", "Borrado Exitoso", JOptionPane.INFORMATION_MESSAGE);

                        usuariosGUI ventanaUsuarios = new usuariosGUI();
                        frame.dispose();

                    } else {JOptionPane.showMessageDialog(null, "El usuario no existe - INTENTE DE NUEVO.", "Usuario Existente", JOptionPane.INFORMATION_MESSAGE);}

                }  else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });
    }
}
