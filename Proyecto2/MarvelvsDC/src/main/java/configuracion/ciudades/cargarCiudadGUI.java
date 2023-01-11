package configuracion.ciudades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class cargarCiudadGUI {
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
    JTextField txtEscenario = new JTextField();

    // Combobox
    JComboBox<Ciudad> cmbCiudades = new JComboBox<>();

    // Buttons
    JButton btnRegresar = new JButton("Regresar");

    // BDciudades
    BDciudad ciudad = new BDciudad();
    Ciudad ciudadSeleccionada;

    cargarCiudadGUI() throws IOException {
        frame.setSize(550,600);
        frame.setLocation(400,200);
        frame.setTitle("Agregar Ciudad");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ciudad.restaurar();

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

        frame.add(lblPais);
        frame.add(lblProvincia);
        frame.add(lblCiudad);
        frame.add(lblEscenario);

        // TextFields
        txtPais.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtPais.setBounds(252, 185, 190, 25);
        txtPais.setEnabled(false);
        txtProvincia.setEnabled(false);
        txtPais.setDisabledTextColor(Color.BLACK);

        txtProvincia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtProvincia.setBounds(252, 237, 190, 25);
        txtProvincia.setEnabled(false);
        txtProvincia.setDisabledTextColor(Color.BLACK);

        txtCiudad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtCiudad.setBounds(252, 289, 190, 25);
        txtCiudad.setEnabled(false);
        txtCiudad.setDisabledTextColor(Color.BLACK);

        txtEscenario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtEscenario.setBounds(252, 341, 190, 25);
        txtEscenario.setEnabled(false);
        txtEscenario.setDisabledTextColor(Color.BLACK);

        frame.add(txtPais);
        frame.add(txtProvincia);
        frame.add(txtCiudad);
        frame.add(txtEscenario);

        // ComboBox
        cmbCiudades.setModel(new DefaultComboBoxModel(ciudad.getCiudades().toArray()));
        cmbCiudades.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbCiudades.setBounds(43, 133, 442, 25);
        cmbCiudades.setBackground(Color.white);
        ((JLabel) cmbCiudades.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        frame.add(cmbCiudades);

        // Button
        btnRegresar.setBounds(170, 460, 190, 60);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 20));

        frame.add(btnRegresar);

        cmbCiudades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadSeleccionada = (Ciudad) cmbCiudades.getSelectedItem();

                if (ciudadSeleccionada != null) {
                    txtPais.setText(ciudadSeleccionada.getPais());
                    txtProvincia.setText(ciudadSeleccionada.getProvincia());
                    txtCiudad.setText(ciudadSeleccionada.getCiudad());
                    txtEscenario.setText(ciudadSeleccionada.getEscenario());

                } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadesGUI ventanaCiudad = new ciudadesGUI();

                frame.dispose();
            }
        });
    }
}
