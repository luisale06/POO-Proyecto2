package configuracion.usuarios;

import javax.swing.*;

public class agregarUsuarioGUI {
    JFrame frame = new JFrame();

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

    JButton btnAgregarUsuario = new JButton();
    JButton btnRegresar = new JButton();

    BDusuario usuario = new BDusuario();

    public agregarUsuarioGUI(){}
}
