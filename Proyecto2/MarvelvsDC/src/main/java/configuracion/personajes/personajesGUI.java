package configuracion.personajes;

import configuracion.configuracionGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class personajesGUI extends Component {

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
    JTextField txtPseudonimo = new JTextField();
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
    String[] dias = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    JComboBox cmbDias = new JComboBox(dias);
    String[] meses = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    JComboBox cmbMeses = new JComboBox(meses);
    JComboBox cmbAnios = new JComboBox();

    // FileChooser
    JFileChooser chFotoTraje = new JFileChooser();
    JFileChooser chFoto = new JFileChooser();

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

    // Bases de Datos de Clases
    BDheroe heroe = new BDheroe();
    BDantiheroe antiheroe = new BDantiheroe();
    BDvillano villano = new BDvillano();

    // Variables
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
        txtNombreCompleto.setBackground(Color.WHITE);

        txtFechaNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtFechaNacimiento.setBounds(x2, 560 - ajusteY, 160, 25);
        txtFechaNacimiento.setBackground(Color.WHITE);

        txtPaisResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtPaisResidencia.setBounds(x2, 610 - ajusteY, 230, 25);
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

        cmbDias.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbDias.setBounds(x2, 560 - ajusteY, 65, 25);
        cmbDias.setBackground(Color.white);
        ((JLabel) cmbDias.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        cmbMeses.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbMeses.setBounds(427, 560 - ajusteY, 65, 25);
        cmbMeses.setBackground(Color.white);
        ((JLabel) cmbMeses.getRenderer()).setHorizontalAlignment(JLabel.CENTER);

        cmbAnios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        cmbAnios.setBounds(x3, 560 - ajusteY, 65, 25);
        cmbAnios.setBackground(Color.white);
        ((JLabel) cmbAnios.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 1950; i < 2051; i++)
            cmbAnios.addItem(i);
        cmbAnios.setSelectedItem(2023);

        frame.add(cmbTipo);
        frame.add(cmbRaza);
        frame.add(cmbFranquicia);
        frame.add(cmbDias);
        frame.add(cmbMeses);
        frame.add(cmbAnios);

        // Slider
        sdFuerza.setBounds(x2, 310 - ajusteY, 160, 25);
        sdFuerza.setBackground(Color.WHITE);
        sdFuerza.setValue(0);

        sdVelocidad.setBounds(x2, 360 - ajusteY, 160, 25);
        sdVelocidad.setBackground(Color.WHITE);
        sdVelocidad.setValue(0);

        sdInteligencia.setBounds(x2, 410 - ajusteY, 160, 25);
        sdInteligencia.setBackground(Color.WHITE);
        sdInteligencia.setValue(0);

        sdEconomia.setBounds(x2, 460 - ajusteY, 160, 25);
        sdEconomia.setBackground(Color.WHITE);
        sdEconomia.setValue(0);

        frame.add(sdFuerza);
        frame.add(sdVelocidad);
        frame.add(sdInteligencia);
        frame.add(sdEconomia);

        // Button
        btnFotoTraje.setBounds(x3, 260 - ajusteY, 65, 25);
        btnFotoTraje.setBackground(Color.lightGray);
        btnFotoTraje.setForeground(Color.darkGray);
        btnFotoTraje.setFont(new Font("Segoe UI", Font.BOLD, 20));

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
                    cmbDias.setEnabled(true);
                    cmbMeses.setEnabled(true);
                    cmbAnios.setEnabled(true);
                } else {
                    txtNombreCompleto.setText("");
                    txtPaisResidencia.setText("");
                    txtFoto.setText("");
                    txtNombreCompleto.setEditable(false);
                    btnFechaNacimiento.setEnabled(false);
                    txtPaisResidencia.setEditable(false);
                    btnFoto.setEnabled(false);
                    btnFoto.setEnabled(false);
                    cmbDias.setEnabled(false);
                    cmbMeses.setEnabled(false);
                    cmbAnios.setEnabled(false);
                }
            }
        });

        btnFotoTraje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = "";
                int returnVal = chFotoTraje.showOpenDialog(personajesGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath = chFotoTraje.getSelectedFile().getAbsolutePath();
                    txtFotoTraje.setText(filePath);
                }
            }
        });

        btnFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = "";
                int returnVal = chFoto.showOpenDialog(personajesGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath = chFoto.getSelectedFile().getAbsolutePath();
                    txtFoto.setText(filePath);
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

        btnAgregarPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Instanciar variables
                String tipo = String.valueOf(cmbTipo.getSelectedItem());
                String pseudonimo = txtPseudonimo.getText();
                String raza = String.valueOf(cmbRaza.getSelectedItem());
                String franquicia = String.valueOf(cmbFranquicia.getSelectedItem());
                String fotoTraje = txtFotoTraje.getText();
                Double fuerza = (double) sdFuerza.getValue();
                Double velocidad = (double) sdVelocidad.getValue();
                Double inteligencia = (double) sdInteligencia.getValue();
                Double economia = (double) sdEconomia.getValue();
                Double poderTotal = ((fuerza/100) * (velocidad/100) * (inteligencia/100) * (economia/100));
                String nombreCompleto = txtNombreCompleto.getText();
                String fechaNacString = cmbDias.getSelectedItem() + "." + cmbMeses.getSelectedItem() + "." + cmbAnios.getSelectedItem();
                String pais = txtPaisResidencia.getText();
                String foto = txtFoto.getText();

                if (!tipo.equals("") && !pseudonimo.equals("") && !raza.equals("") && !franquicia.equals("") && !fotoTraje.equals("")) {
                    DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                    Date date = null;
                    try {date = df.parse(fechaNacString);} catch (ParseException ex) {throw new RuntimeException(ex);}
                    System.out.println("Poder total"+poderTotal);

                    // Agregar Heroe
                    if (String.valueOf(cmbTipo.getSelectedItem()).equals("Heroe")) {
                        if (!nombreCompleto.equals("") && !pais.equals("") && !foto.equals("")) {
                            Heroe heroeNuevo = new Heroe(tipo, pseudonimo, raza, franquicia, fotoTraje, fuerza, velocidad, inteligencia, economia, poderTotal, nombreCompleto, date, pais, foto);
                            heroe.addHeroe(heroeNuevo);
                            try {heroe.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}
                            JOptionPane.showMessageDialog(null, "El Heroe se ha guardado con exito.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);

                        } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}

                    // Agregar Antiheroe
                    } else if (String.valueOf(cmbTipo.getSelectedItem()).equals("Antiheroe")) {
                        Antiheroe antiheroeNuevo = new Antiheroe(tipo, pseudonimo, raza, franquicia, fotoTraje, fuerza, velocidad, inteligencia, economia, poderTotal);
                        antiheroe.addAntiheroe(antiheroeNuevo);
                        try {antiheroe.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}
                        JOptionPane.showMessageDialog(null, "El Antiheroe se ha guardado con exito.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);

                    // Agregar Villano
                    } else if (String.valueOf(cmbTipo.getSelectedItem()).equals("Villano")) {
                        Villano villanoNuevo = new Villano(tipo, pseudonimo, raza, franquicia, fotoTraje, fuerza, velocidad, inteligencia, economia, poderTotal);
                        villano.addVillano(villanoNuevo);
                        try {villano.guardar();} catch (IOException ex) {throw new RuntimeException(ex);}
                        JOptionPane.showMessageDialog(null, "El Villano se ha guardado con exito.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {JOptionPane.showMessageDialog(null, "INTENTE DE NUEVO.", "ERROR", JOptionPane.ERROR_MESSAGE);}
            }
        });

    }
}
