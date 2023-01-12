package configuracion.personajes;

import com.toedter.calendar.JDateChooser;
import configuracion.configuracionGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class personajesGUI {

    // Frame
    JFrame frame = new JFrame();

    // Labels
    JLabel lblTipo = new JLabel("Tipo");
    JLabel lblPseudonimo = new JLabel("Pseudonimo");
    JLabel lblRaza = new JLabel("Raza");
    JLabel lblFranquicia = new JLabel("Franquicia");
    JLabel lblFotoTraje = new JLabel("FotoTraje");
    JLabel lblFuerza = new JLabel("Fuerza");
    JLabel lblVelocidad = new JLabel("Velocidad");
    JLabel lblInteligencia = new JLabel("Inteligencia");
    JLabel lblEconomia = new JLabel("Economia");
    JLabel lblNombreCompleto = new JLabel("Nombre completo");
    JLabel lblFechaNacimiento = new JLabel("Fecha de nacimiento");
    JLabel lblPaisResidencia = new JLabel("Pais de residencia");
    JLabel lblFoto = new JLabel("Foto");

    // TextFields
    JTextField txtTipo = new JTextField();
    JTextField txtPseudonimo = new JTextField();
    JTextField txtRaza = new JTextField();
    JTextField txtFranquicia = new JTextField();
    JTextField txtFotoTraje = new JTextField();
    JTextField txtFuerza = new JTextField();
    JTextField txtVelocidad = new JTextField();
    JTextField txtInteligencia = new JTextField();
    JTextField txtEconomia = new JTextField();
    JTextField txtNombreCompleto = new JTextField();
    JTextField txtFechaNacimiento = new JTextField();
    JTextField txtPaisResidencia = new JTextField();
    JTextField txtFoto = new JTextField();

    // ComboBox
    String[] tiposPersonaje = {"Heroe", "Antiheroe", "Villano"};
    JComboBox cmbTipo = new JComboBox(tiposPersonaje);
    String[] razas = {"Alienígena", "Mutante / Meta humano"};
    JComboBox cmbRaza = new JComboBox(razas);
    String[] franquicias = {"Marvel", "DC", "Ninguna de las anteriores"};
    JComboBox cmbFranquicia = new JComboBox(franquicias);

    // DateChooser
    JDateChooser dcFechaNacimiento = new JDateChooser();

    // Slider
    JSlider sdFuerza = new JSlider(0, 100, 0);
    JSlider sdVelocidad = new JSlider(0, 100, 0);
    JSlider sdInteligencia = new JSlider(0, 100, 0);
    JSlider sdEconomia = new JSlider(0, 100, 0);

    // Buttons
    JButton btnRegresar = new JButton("Regresar");
    JButton btnFotoTraje = new JButton("...");
    JButton btnFechaNacimiento = new JButton("...");
    JButton btnFoto = new JButton("...");
    JButton btnAgregarPersonaje = new JButton("Agregar Personaje");

    Integer ajusteX = 60;
    Integer x1 = 155 - ajusteX;
    Integer x2 = 405 - ajusteX;
    Integer x3 = 570 - ajusteX;
    Integer ajusteY = 40;

    public personajesGUI(){
        frame.setSize(790,800);
        frame.setLocation(400,200);
        frame.setTitle("Agregar Personaje");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        lblTipo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblTipo.setBackground(Color.white);
        lblTipo.setOpaque(true);
        lblTipo.setBounds(x1, 60 - ajusteY, 230, 25);
        lblTipo.setHorizontalAlignment(JLabel.RIGHT);

        lblPseudonimo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblPseudonimo.setBackground(Color.white);
        lblPseudonimo.setOpaque(true);
        lblPseudonimo.setBounds(x1, 110 - ajusteY, 230, 25);
        lblPseudonimo.setHorizontalAlignment(JLabel.RIGHT);

        lblRaza.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblRaza.setBackground(Color.white);
        lblRaza.setOpaque(true);
        lblRaza.setBounds(x1, 160 - ajusteY, 230, 25);
        lblRaza.setHorizontalAlignment(JLabel.RIGHT);

        lblFranquicia.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblFranquicia.setBackground(Color.white);
        lblFranquicia.setOpaque(true);
        lblFranquicia.setBounds(x1, 210 - ajusteY, 230, 25);
        lblFranquicia.setHorizontalAlignment(JLabel.RIGHT);

        lblFotoTraje.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblFotoTraje.setBackground(Color.white);
        lblFotoTraje.setOpaque(true);
        lblFotoTraje.setBounds(x1, 260 - ajusteY, 230, 25);
        lblFotoTraje.setHorizontalAlignment(JLabel.RIGHT);

        lblFuerza.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblFuerza.setBackground(Color.white);
        lblFuerza.setOpaque(true);
        lblFuerza.setBounds(x1, 310 - ajusteY, 230, 25);
        lblFuerza.setHorizontalAlignment(JLabel.RIGHT);

        lblVelocidad.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblVelocidad.setBackground(Color.white);
        lblVelocidad.setOpaque(true);
        lblVelocidad.setBounds(x1, 360 - ajusteY, 230, 25);
        lblVelocidad.setHorizontalAlignment(JLabel.RIGHT);

        lblInteligencia.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblInteligencia.setBackground(Color.white);
        lblInteligencia.setOpaque(true);
        lblInteligencia.setBounds(x1, 410 - ajusteY, 230, 25);
        lblInteligencia.setHorizontalAlignment(JLabel.RIGHT);

        lblEconomia.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblEconomia.setBackground(Color.white);
        lblEconomia.setOpaque(true);
        lblEconomia.setBounds(x1, 460 - ajusteY, 230, 25);
        lblEconomia.setHorizontalAlignment(JLabel.RIGHT);

        lblNombreCompleto.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNombreCompleto.setBackground(Color.white);
        lblNombreCompleto.setOpaque(true);
        lblNombreCompleto.setBounds(x1, 510 - ajusteY, 230, 25);
        lblNombreCompleto.setHorizontalAlignment(JLabel.RIGHT);

        lblFechaNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblFechaNacimiento.setBackground(Color.white);
        lblFechaNacimiento.setOpaque(true);
        lblFechaNacimiento.setBounds(x1, 560 - ajusteY, 230, 25);
        lblFechaNacimiento.setHorizontalAlignment(JLabel.RIGHT);

        lblPaisResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblPaisResidencia.setBackground(Color.white);
        lblPaisResidencia.setOpaque(true);
        lblPaisResidencia.setBounds(x1, 610 - ajusteY, 230, 25);
        lblPaisResidencia.setHorizontalAlignment(JLabel.RIGHT);

        lblFoto.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblFoto.setBackground(Color.white);
        lblFoto.setOpaque(true);
        lblFoto.setBounds(x1, 660 - ajusteY, 230, 25);
        lblFoto.setHorizontalAlignment(JLabel.RIGHT);

        frame.add(lblTipo);
        frame.add(lblPseudonimo);
        frame.add(lblRaza);
        frame.add(lblFranquicia);
        frame.add(lblFotoTraje);
        frame.add(lblFuerza);
        frame.add(lblVelocidad);
        frame.add(lblInteligencia);
        frame.add(lblEconomia);
        frame.add(lblNombreCompleto);
        frame.add(lblFechaNacimiento);
        frame.add(lblPaisResidencia);
        frame.add(lblFoto);

        // TextField
        txtPseudonimo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtPseudonimo.setBounds(x2, 110 - ajusteY, 230, 25);

        txtFotoTraje.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtFotoTraje.setBounds(x2, 260 - ajusteY, 160, 25);
        txtFotoTraje.setEditable(false);
        txtFotoTraje.setBackground(Color.WHITE);

        txtFuerza.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtFuerza.setBounds(x3, 310 - ajusteY, 65, 25);
        txtFuerza.setText("0%");
        txtFuerza.setEditable(false);
        txtFuerza.setBackground(Color.WHITE);
        txtFuerza.setHorizontalAlignment(JTextField.HORIZONTAL);

        txtVelocidad.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtVelocidad.setBounds(x3, 360 - ajusteY, 65, 25);
        txtVelocidad.setText("0%");
        txtVelocidad.setEditable(false);
        txtVelocidad.setBackground(Color.WHITE);
        txtVelocidad.setHorizontalAlignment(JTextField.HORIZONTAL);

        txtInteligencia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtInteligencia.setBounds(x3, 410 - ajusteY, 65, 25);
        txtInteligencia.setText("0%");
        txtInteligencia.setEditable(false);
        txtInteligencia.setBackground(Color.WHITE);
        txtInteligencia.setHorizontalAlignment(JTextField.HORIZONTAL);

        txtEconomia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtEconomia.setBounds(x3, 460 - ajusteY, 65, 25);
        txtEconomia.setText("0%");
        txtEconomia.setEditable(false);
        txtEconomia.setBackground(Color.WHITE);
        txtEconomia.setHorizontalAlignment(JTextField.HORIZONTAL);

        txtNombreCompleto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtNombreCompleto.setBounds(x2, 510 - ajusteY, 230, 25);
        txtNombreCompleto.setEditable(false);
        txtNombreCompleto.setBackground(Color.WHITE);

        txtFechaNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtFechaNacimiento.setBounds(x2, 560 - ajusteY, 160, 25);
        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setBackground(Color.WHITE);
        txtFechaNacimiento.setEditable(false);

        txtPaisResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtPaisResidencia.setBounds(x2, 610 - ajusteY, 230, 25);
        txtPaisResidencia.setEditable(false);
        txtPaisResidencia.setBackground(Color.WHITE);

        txtFoto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtFoto.setBounds(x2, 660 - ajusteY, 160, 25);
        txtFoto.setEditable(false);
        txtFoto.setBackground(Color.WHITE);

        frame.add(txtPseudonimo);
        frame.add(txtFotoTraje);
        frame.add(txtFuerza);
        frame.add(txtVelocidad);
        frame.add(txtInteligencia);
        frame.add(txtEconomia);
        frame.add(txtNombreCompleto);
        frame.add(txtFechaNacimiento);
        frame.add(txtPaisResidencia);
        frame.add(txtFoto);

        // ComboBox
        cmbTipo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbTipo.setBounds(x2, 60 - ajusteY, 230, 25);
        cmbTipo.setBackground(Color.white);
        ((JLabel) cmbTipo.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        cmbRaza.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbRaza.setBounds(x2, 160 - ajusteY, 230, 25);
        cmbRaza.setBackground(Color.white);
        ((JLabel) cmbRaza.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        cmbFranquicia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbFranquicia.setBounds(x2, 210 - ajusteY, 230, 25);
        cmbFranquicia.setBackground(Color.white);
        ((JLabel) cmbFranquicia.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        frame.add(cmbTipo);
        frame.add(cmbRaza);
        frame.add(cmbFranquicia);

        // Slider
        sdFuerza.setBounds(x2, 310 - ajusteY, 160, 25);
        sdFuerza.setBackground(Color.WHITE);

        sdVelocidad.setBounds(x2, 360 - ajusteY, 160, 25);
        sdVelocidad.setBackground(Color.WHITE);

        sdInteligencia.setBounds(x2, 410 - ajusteY, 160, 25);
        sdInteligencia.setBackground(Color.WHITE);

        sdEconomia.setBounds(x2, 460 - ajusteY, 160, 25);
        sdEconomia.setBackground(Color.WHITE);

        frame.add(sdFuerza);
        frame.add(sdVelocidad);
        frame.add(sdInteligencia);
        frame.add(sdEconomia);

        // Button
        btnFotoTraje.setBounds(x3, 260 - ajusteY, 65, 25);
        btnFotoTraje.setBackground(Color.lightGray);
        btnFotoTraje.setForeground(Color.darkGray);
        btnFotoTraje.setFont(new Font("Segoe UI", Font.BOLD, 20));

        btnFechaNacimiento.setBounds(x3, 560 - ajusteY, 65, 25);
        btnFechaNacimiento.setBackground(Color.lightGray);
        btnFechaNacimiento.setForeground(Color.darkGray);
        btnFechaNacimiento.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnFechaNacimiento.setEnabled(false);

        btnFoto.setBounds(x3, 660 - ajusteY, 65, 25);
        btnFoto.setBackground(Color.lightGray);
        btnFoto.setForeground(Color.darkGray);
        btnFoto.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnFoto.setEnabled(false);

        btnRegresar.setBounds(170, 715 - ajusteY, 210, 60);
        btnRegresar.setBackground(Color.lightGray);
        btnRegresar.setForeground(Color.darkGray);
        btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 20));

        btnAgregarPersonaje.setBounds(400, 715 - ajusteY, 210, 60);
        btnAgregarPersonaje.setBackground(Color.lightGray);
        btnAgregarPersonaje.setForeground(Color.darkGray);
        btnAgregarPersonaje.setFont(new Font("Segoe UI", Font.BOLD, 20));

        frame.add(btnFotoTraje);
        frame.add(btnFechaNacimiento);
        frame.add(btnFoto);
        frame.add(btnRegresar);
        frame.add(btnAgregarPersonaje);

        sdFuerza.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txtFuerza.setText(sdFuerza.getValue()+"%");
            }
        });

        sdVelocidad.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txtVelocidad.setText(sdVelocidad.getValue()+"%");
            }
        });

        sdInteligencia.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txtInteligencia.setText(sdInteligencia.getValue()+"%");
            }
        });

        sdEconomia.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                txtEconomia.setText(sdEconomia.getValue()+"%");
            }
        });

        cmbTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (String.valueOf(cmbTipo.getSelectedItem()).equals("Heroe")) {
                    txtNombreCompleto.setEditable(true);
                    btnFechaNacimiento.setEnabled(true);
                    txtPaisResidencia.setEditable(true);
                    btnFoto.setEnabled(true);
                } else {
                    txtNombreCompleto.setEditable(false);
                    btnFechaNacimiento.setEnabled(false);
                    txtPaisResidencia.setEditable(false);
                    btnFoto.setEnabled(false);
                }
            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configuracionGUI ventanaConfig = new configuracionGUI();
                frame.dispose();
            }
        });
    }
}
