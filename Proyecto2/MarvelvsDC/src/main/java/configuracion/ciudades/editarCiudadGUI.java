package configuracion.ciudades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class editarCiudadGUI {
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
    JComboBox cmbEscenario = new JComboBox(tiposEscenario);
    JComboBox<Ciudad> cmbCiudades = new JComboBox<>();

    // Buttons
    JButton btnRegresar = new JButton("Regresar");
    JButton btnEditarCiudad = new JButton("Editar Ciudad");

    // BDciudades
    BDciudad ciudad = new BDciudad();
    Ciudad ciudadSeleccionada;

    editarCiudadGUI() throws IOException {
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

        txtProvincia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtProvincia.setBounds(252, 237, 190, 25);

        txtCiudad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtCiudad.setBounds(252, 289, 190, 25);

        frame.add(txtPais);
        frame.add(txtProvincia);
        frame.add(txtCiudad);

        // ComboBox
        cmbEscenario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbEscenario.setBounds(252, 341, 190, 25);
        cmbEscenario.setBackground(Color.white);
        ((JLabel) cmbEscenario.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        cmbCiudades.setModel(new DefaultComboBoxModel(ciudad.getCiudades().toArray()));
        cmbCiudades.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbCiudades.setBounds(43, 133, 442, 25);
        cmbCiudades.setBackground(Color.white);
        ((JLabel) cmbCiudades.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        frame.add(cmbEscenario);
        frame.add(cmbCiudades);

        // Button
        btnRegresar.setBounds(75, 460, 190, 60);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 20));

        btnEditarCiudad.setBounds(275, 460, 190, 60);
        btnEditarCiudad.setBackground(Color.lightGray);
        btnEditarCiudad.setForeground(Color.darkGray);
        btnEditarCiudad.setFont(new Font("Segoe UI", Font.BOLD, 20));

        frame.add(btnRegresar);
        frame.add(btnEditarCiudad);

        cmbCiudades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadSeleccionada = (Ciudad) cmbCiudades.getSelectedItem();

                if (ciudadSeleccionada != null) {
                    txtPais.setText(ciudadSeleccionada.getPais());
                    txtProvincia.setText(ciudadSeleccionada.getProvincia());
                    txtCiudad.setText(ciudadSeleccionada.getCiudad());
                    cmbEscenario.setSelectedItem(ciudadSeleccionada.getEscenario());

                } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ciudadesGUI ventanaCiudades = new ciudadesGUI();
                frame.dispose();
            }
        });

        btnEditarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtPais.getText().equals("") && !txtProvincia.getText().equals("") && !txtCiudad.getText().equals("")) {
                    Ciudad ciudadNueva = new Ciudad(txtPais.getText(), txtProvincia.getText(), txtCiudad.getText(), String.valueOf(cmbEscenario.getSelectedItem()));

                    if (!ciudad.existeCiudad(ciudadNueva)) {
                        ciudadSeleccionada.setPais(txtPais.getText());
                        ciudadSeleccionada.setProvincia(txtProvincia.getText());
                        ciudadSeleccionada.setCiudad(txtCiudad.getText());
                        ciudadSeleccionada.setEscenario(String.valueOf(cmbEscenario.getSelectedItem()));

                        int index = ciudad.getCiudades().indexOf(ciudadSeleccionada);
                        ciudad.getCiudades().set(index, ciudadSeleccionada);

                        try {ciudad.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}

                        JOptionPane.showMessageDialog(null, "La ciudad se ha editado con exito.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);

                        ciudadesGUI ventanaCiudades = new ciudadesGUI();
                        frame.dispose();

                    } else {JOptionPane.showMessageDialog(null, "Ya existe esa ciudad - INTENTE DE NUEVO.", "Ciudad Existente", JOptionPane.INFORMATION_MESSAGE);}

                } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });
    }
}
