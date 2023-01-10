package configuracion.ciudades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class agregarCiudadGUI {
    // Frame
    JFrame frame = new JFrame();

    // Labels
    JLabel lblPais = new JLabel("País:");
    JLabel lblProvincia = new JLabel("Estado / Provincia:");
    JLabel lblCiudad = new JLabel("Ciudad:");
    JLabel lblEscenario = new JLabel("Escenario:");

    // TextField
    JTextField txtPais = new JTextField();
    JTextField txtProvincia = new JTextField();
    JTextField txtCiudad = new JTextField();

    // Combobox
    String[] tiposEscenario= {"Ciudad", "Bosque", "Montaña", "Desierto"};
    JComboBox cbEscenario = new JComboBox(tiposEscenario);

    // Buttons
    JButton btnAgregarCiudad = new JButton("Agregar Ciudad");

    // BDciudades
    BDciudad ciudad = new BDciudad();

    agregarCiudadGUI() throws IOException {
        frame.setSize(550,600);
        frame.setLocation(400,200);
        frame.setTitle("Agregar Ciudad");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().

        setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        lblPais.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblPais.setBackground(Color.white);
        lblPais.setOpaque(true);
        lblPais.setBounds(43, 185, 190, 25);
        lblPais.setHorizontalAlignment(JLabel.RIGHT);

        lblProvincia.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblProvincia.setBackground(Color.white);
        lblProvincia.setOpaque(true);
        lblProvincia.setBounds(43, 237, 190, 25);
        lblProvincia.setHorizontalAlignment(JLabel.RIGHT);

        lblCiudad.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblCiudad.setBackground(Color.white);
        lblCiudad.setOpaque(true);
        lblCiudad.setBounds(43, 289, 190, 25);
        lblCiudad.setHorizontalAlignment(JLabel.RIGHT);

        lblEscenario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblEscenario.setBackground(Color.white);
        lblEscenario.setOpaque(true);
        lblEscenario.setBounds(43, 341, 190, 25);
        lblEscenario.setHorizontalAlignment(JLabel.RIGHT);

        // TextFields
        txtPais.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtPais.setBounds(252, 185, 190, 25);

        txtProvincia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtProvincia.setBounds(252, 237, 190, 25);

        txtCiudad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtCiudad.setBounds(252, 289, 190, 25);

        // ComboBox
        cbEscenario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cbEscenario.setBounds(252, 341, 190, 25);
        cbEscenario.setBackground(Color.white);
        ((JLabel)cbEscenario.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        // Button
        btnAgregarCiudad.setBounds(170, 460, 190, 60);
        btnAgregarCiudad.setBackground(Color.lightGray);
        btnAgregarCiudad.setForeground(Color.darkGray);
        btnAgregarCiudad.setFont(new Font("Segoe UI", Font.BOLD, 20));


        frame.add(lblPais);
        frame.add(lblProvincia);
        frame.add(lblCiudad);
        frame.add(lblEscenario);

        frame.add(txtPais);
        frame.add(txtProvincia);
        frame.add(txtCiudad);
        frame.add(cbEscenario);

        frame.add(btnAgregarCiudad);

        ciudad.restaurar();

        btnAgregarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtPais.getText().equals("") && !txtProvincia.getText().equals("") && !txtCiudad.getText().equals("")) {
                    Ciudad ciudadNueva = new Ciudad(txtPais.getText(), txtProvincia.getText(), txtCiudad.getText(), String.valueOf(cbEscenario.getSelectedItem()));

                    if (!ciudad.existeCiudad(ciudadNueva)) {
                        ciudad.guardarCiudad(ciudadNueva);

                        try {ciudad.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}

                        JOptionPane.showMessageDialog(null, "La ciudad se ha guardado con exito.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);

                        ciudadesGUI ventanaCiudades = new ciudadesGUI();
                        frame.dispose();

                    } else {JOptionPane.showMessageDialog(null, "Ya existe esa ciudad - INTENTE DE NUEVO.", "Ciudad Existente", 1);}

                }  else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", 1);}
            }
        });
    }
}
