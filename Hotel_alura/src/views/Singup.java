package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controllers.RegistroController;

import java.awt.Cursor;

public class Singup extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JPasswordField txtContrasena;
	int xMouse, yMouse;
	private JLabel labelExit;
	private JTextField txtNombreUsuario;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singup frame = new Singup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Singup() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 788, 527);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setText("Ingrese Nombre Usuario");
		txtNombreUsuario.setForeground(Color.LIGHT_GRAY);
		txtNombreUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombreUsuario.setText("");
				txtNombreUsuario.setForeground(Color.BLACK);
			}
		});
		txtNombreUsuario.setBorder(null);
		txtNombreUsuario.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtNombreUsuario.setBackground(new Color(255, 255, 255));
		txtNombreUsuario.setBounds(10, 211, 282, 32);
		panel.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBounds(484, 0, 304, 527);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel imgHotel = new JLabel("");
		imgHotel.setVerticalAlignment(SwingConstants.BOTTOM);
		imgHotel.setHorizontalAlignment(SwingConstants.LEFT);
		imgHotel.setBounds(0, 0, 304, 538);
		panel_1.add(imgHotel);
		imgHotel.setIcon(new ImageIcon(Singup.class.getResource("/ImagenesIA/image (3).png")));
		
		JPanel btnexit = new JPanel();
		btnexit.setBounds(251, 0, 53, 36);
		panel_1.add(btnexit);
		btnexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnexit.setBackground(Color.red);
				labelExit.setForeground(Color.white);
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				 btnexit.setBackground(new Color(12, 138, 199));
			     labelExit.setForeground(Color.white);
			}
		});
		btnexit.setBackground(new Color(0, 102, 153));
		btnexit.setLayout(null);
		btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		labelExit = new JLabel("X");
		labelExit.setBounds(0, 0, 53, 36);
		btnexit.add(labelExit);
		labelExit.setForeground(SystemColor.text);
		labelExit.setFont(new Font("Roboto", Font.PLAIN, 18));
		labelExit.setHorizontalAlignment(SwingConstants.CENTER);		
		
		txtNombre = new JTextField();
		txtNombre.setText("Porfavor Ingrese su nombre completo");
		txtNombre.setForeground(Color.LIGHT_GRAY);
		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText("");
				txtNombre.setForeground(Color.BLACK);
			}
		});
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtNombre.setBounds(10, 118, 324, 32);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 120, 215));
		separator.setBounds(10, 161, 324, 2);
		panel.add(separator);
		
		JLabel labelTitulo = new JLabel("REGISTRO");
		labelTitulo.setForeground(SystemColor.textHighlight);
		labelTitulo.setFont(new Font("Dialog", Font.PLAIN, 30));
		labelTitulo.setBounds(129, 11, 202, 26);
		panel.add(labelTitulo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.textHighlight);
		separator_1.setBounds(10, 347, 324, 2);
		panel.add(separator_1);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setText("********");
		txtContrasena.setForeground(Color.LIGHT_GRAY);
		txtContrasena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtContrasena.setText("");
				txtContrasena.setForeground(Color.BLACK);
			}
		});
		
		
		txtContrasena.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtContrasena.setBounds(10, 304, 324, 32);
		panel.add(txtContrasena);
		
		JLabel LabelUsuario = new JLabel("NOMBRE");
		LabelUsuario.setForeground(SystemColor.textInactiveText);
		LabelUsuario.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		LabelUsuario.setBounds(10, 81, 107, 26);
		panel.add(LabelUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setForeground(SystemColor.textInactiveText);
		lblContrasea.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		lblContrasea.setBounds(10, 267, 140, 26);
		panel.add(lblContrasea);
		
		JPanel btnRegistro = new JPanel();
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistro.setBackground(new Color(0, 156, 223));
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistro.setBackground(SystemColor.textHighlight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtContrasena.getPassword() == null) {
					JOptionPane.showMessageDialog(null, "Falta Informacion", "Precaucion", JOptionPane.WARNING_MESSAGE);
				}else {
					botonRegistro();

				}
				
			}
		});
		btnRegistro.setBackground(new Color(0, 102, 153));
		btnRegistro.setBounds(10, 423, 324, 32);
		panel.add(btnRegistro);
		btnRegistro.setLayout(null);
		btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel = new JLabel("REGISTRARSE");
		lblNewLabel.setBounds(0, 0, 324, 32);
		btnRegistro.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/lOGO-50PX.png")));
		lblNewLabel_1.setBounds(10, 0, 48, 59);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblNewLabel_2.setForeground(new Color(102, 102, 102));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setBounds(0, 0, 485, 527);
		panel.add(lblNewLabel_2);
		
		JPanel header = new JPanel();
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				headerMouseDragged(e);
			     
			}
		});
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				headerMousePressed(e);
			}
		});
		header.setBackground(SystemColor.window);
		header.setBounds(484, 0, 304, 37);
		panel.add(header);
		header.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setForeground(SystemColor.textInactiveText);
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblUsuario.setBounds(10, 174, 107, 26);
		panel.add(lblUsuario);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(SystemColor.textHighlight);
		separator_2.setBounds(10, 254, 324, 2);
		panel.add(separator_2);
	}
	
	 private void headerMousePressed(java.awt.event.MouseEvent evt) {
	        xMouse = evt.getX();
	        yMouse = evt.getY();
	    }//GEN-LAST:event_headerMousePressed

	    private void headerMouseDragged(java.awt.event.MouseEvent evt) {
	        int x = evt.getXOnScreen();
	        int y = evt.getYOnScreen();
	        this.setLocation(x - xMouse, y - yMouse);
}
	    
	    private void botonRegistro() {
	    	RegistroController registroCont = new RegistroController();
	    	registroCont.registrarCliente(txtNombre.getText(), txtNombreUsuario.getText(), txtContrasena.getPassword());

	    }
}
