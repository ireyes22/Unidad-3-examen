import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Control_escolar {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel panelMostrar;
	private JPanel panelDescarga;
	private JPanel panelConsultar;
    private CardLayout cardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Control_escolar window = new Control_escolar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Control_escolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Control_escolar.class.getResource("/imagenes/buho.png")));
		frame.setTitle("Control escolar");
		frame.setBounds(100, 100, 816, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//agregar los paneles de los voids
		panelLogin();
		panelMenu();
		panelAlumnos();
		panelDocentes();
	}
	
	public void panelLogin() {
		JPanel panelAcceder = new JPanel();
		frame.getContentPane().add(panelAcceder, "name_2096446726499");
		panelAcceder.setLayout(new BorderLayout(0, 0));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(240, 248, 255));
		panelAcceder.add(panelDatos);
		panelDatos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(40);
		panelDatos.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("src/imagenes/buho50px.png"));
		panel_3.add(lblNewLabel_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(211, 211, 211));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setHgap(60);
		panelDatos.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(211, 211, 211));
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setHgap(60);
		panelDatos.add(panel_5, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(211, 211, 211));
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setVgap(20);
		panelDatos.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(211, 211, 211));
		panelDatos.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(8, 1, 30, 10));
		
		JLabel lblNewLabel = new JLabel("Acceder");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_7.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_7.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_7.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_7.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("\u00BFOlvido su contrase\u00F1a?");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_7.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelMenu");
				frame.getContentPane().add(panelAcceder, "panelMenu");
				frame.getContentPane().removeAll();
				panelMenu();
				frame.validate();
	            frame.repaint();
			}
		});
		btnNewButton.setBackground(Color.decode("#102C57"));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_7.add(btnNewButton);
		
		frame.getContentPane().add(panelAcceder, "login");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#102C57"));
		FlowLayout flowLayout_7 = (FlowLayout) panel.getLayout();
		flowLayout_7.setVgap(30);
		panelAcceder.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#102C57"));
		FlowLayout flowLayout_4 = (FlowLayout) panel_1.getLayout();
		flowLayout_4.setVgap(30);
		panelAcceder.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#102C57"));
		FlowLayout flowLayout_5 = (FlowLayout) panel_2.getLayout();
		flowLayout_5.setHgap(50);
		panelAcceder.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.decode("#102C57"));
		FlowLayout flowLayout_6 = (FlowLayout) panel_8.getLayout();
		flowLayout_6.setHgap(50);
		panelAcceder.add(panel_8, BorderLayout.EAST);
	}
	
	public void panelMenu() {
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_20308605878500");
		panelMenu.setLayout(new BorderLayout(0, 0));
		
		JPanel bannerControlEscolar = new JPanel();
		bannerControlEscolar.setBackground(Color.decode("#102C57"));
		panelMenu.add(bannerControlEscolar, BorderLayout.NORTH);
		bannerControlEscolar.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Universidad Autonoma del Paseme por favor");
		lblNewLabel_5.setIcon(new ImageIcon("src/imagenes/buho50px.png"));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		bannerControlEscolar.add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("Control escolar");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBackground(new Color(255, 255, 255));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bannerControlEscolar.add(lblNewLabel_9);
		
		JPanel panelbotones = new JPanel();
		panelbotones.setBackground(Color.decode("#102C57"));
		panelMenu.add(panelbotones, BorderLayout.WEST);
		panelbotones.setLayout(new GridLayout(10, 1, 0, 20));
		
		JButton btnNewButton_1 = new JButton("Alumnos");
		btnNewButton_1.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/graduacion30px.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelAlumnos");
				frame.getContentPane().add(panelMenu, "panelAlumnos");
				frame.getContentPane().removeAll();
				panelAlumnos();
				frame.validate();
	            frame.repaint();
			}
		});
		panelbotones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Docentes");
		btnNewButton_2.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/aprendiendo30px.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelDocentes");
				frame.getContentPane().add(panelMenu, "panelDocentes");
				frame.getContentPane().removeAll();
				panelDocentes();
				frame.validate();
	            frame.repaint();
			}
		});
		panelbotones.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelMenu");
				frame.getContentPane().add(panelMenu, "panelMenu");
				frame.getContentPane().removeAll();
				panelLogin();
				frame.validate();
	            frame.repaint();
			}
		});
		panelbotones.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#102C57"));
		panelMenu.add(panel, BorderLayout.SOUTH);
	}
	
	public void panelAlumnos() {
		JPanel panelAlumnos = new JPanel();
		frame.getContentPane().add(panelAlumnos, "name_3878046112900");
		panelAlumnos.setLayout(new BorderLayout(0, 0));
		
		JPanel bannerAlumnos = new JPanel();
		bannerAlumnos.setBackground(Color.decode("#102C57"));
		panelAlumnos.add(bannerAlumnos, BorderLayout.NORTH);
		bannerAlumnos.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Universidad Autonoma del Paseme por favor");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/buho50px.png")));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		bannerAlumnos.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Alumnos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		bannerAlumnos.add(lblNewLabel_4);
		
		JPanel panelBarraBaja = new JPanel();
		panelBarraBaja.setBackground(Color.decode("#102C57"));
		panelAlumnos.add(panelBarraBaja, BorderLayout.SOUTH);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.decode("#102C57"));
		panelAlumnos.add(panelBotones, BorderLayout.WEST);
		panelBotones.setLayout(new GridLayout(10, 1, 1, 20));
		
		panelMostrar = new JPanel();
        panelAlumnos.add(panelMostrar, BorderLayout.CENTER);
        cardLayout = new CardLayout();
        panelMostrar.setLayout(cardLayout);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/anterior30px.png")));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelMenu");
				frame.getContentPane().add(panelAlumnos, "panelMenu");
				frame.getContentPane().removeAll();
				panelMenu();
				frame.validate();
	            frame.repaint();
			}
		});
		
		JButton btnDescargar = new JButton("Descargar");
		btnDescargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 cardLayout.show(panelMostrar, "panelVerde");
				 panelDescargar();
				 panelMostrar.validate();
				 panelMostrar.repaint();
			}
		});
		btnDescargar.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/descargar30px.png")));
		panelBotones.add(btnDescargar);
		
		JButton btnConsulta = new JButton("Consultar");
		btnConsulta.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/consulta30px.png")));
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelMostrar, "panelMorado");
				panelConsultar();
				panelMostrar.validate();
				 panelMostrar.repaint();
			}
		});
		panelBotones.add(btnConsulta);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/agregar-contacto30px.png")));
		panelBotones.add(btnCrear);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/editar30px.png")));
		panelBotones.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/hombre30px.png")));
		panelBotones.add(btnEliminar);
		panelBotones.add(btnRegresar);
		
		panelDescargar();
		panelConsultar();
	}
	
	public void panelDescargar() {
		panelDescarga = new JPanel();
		panelDescarga.setBackground(new Color(255, 255, 255));
	    panelMostrar.add(panelDescarga, "panelVerde");
	    
	    JLabel lblNewLabel_11 = new JLabel("En proceso...");
	    panelDescarga.add(lblNewLabel_11);
	}
	
	public void panelConsultar() {
		panelConsultar = new JPanel();
		panelConsultar.setBackground(new Color(218, 112, 214));
	    panelMostrar.add(panelConsultar, "panelMorado");
	    
	    JLabel lblNewLabel_12 = new JLabel("En proceso...");
	    panelConsultar.add(lblNewLabel_12);
	}
	
	public void panelDocentes() {
		JPanel panelDocentes = new JPanel();
		frame.getContentPane().add(panelDocentes, "name_17286270886600");
		panelDocentes.setLayout(new BorderLayout(1, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#102C57"));
		panelDocentes.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 1, 1));
		
		JLabel lblNewLabel_10 = new JLabel("Univerdidad Autonoma del paseme por favor");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/buho50px.png")));
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_6 = new JLabel("Docentes");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#102C57"));
		panelDocentes.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(10, 1, 0, 0));
		
		JButton btnNewButton_5 = new JButton("Regresar");
		btnNewButton_5.setIcon(new ImageIcon(Control_escolar.class.getResource("/imagenes/anterior30px.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
		        cardLayout.show(frame.getContentPane(), "panelMenu");
				frame.getContentPane().add(panelDocentes, "panelMenu");
				frame.getContentPane().removeAll();
				panelMenu();
				frame.validate();
	            frame.repaint();
			}
		});
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#102C57"));
		panelDocentes.add(panel_2, BorderLayout.SOUTH);
	}
}


