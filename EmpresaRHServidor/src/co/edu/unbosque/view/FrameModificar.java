package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class FrameModificar extends JFrame{
	public static final String ATRÁS = "ATRÁS";
	public static final String ACTUALIZAR = "ACTUALIZAR";
	private JButton atrasbut;
	private JButton actualizarbut;
	private JLabel cedlab;
	private JLabel nomlab;
	private JLabel apelab;
	private JLabel edadlab;
	private JLabel carlab;
	private JTextField cedtf;
	private JTextField nomtf;
	private JTextField cartf;
	private JTextField edadtf;
	private JTextField apetf;
	
	public FrameModificar(Controller pControl) {
		atrasbut = new JButton("Atrás");
		actualizarbut = new JButton("Actualizar");
		cedlab = new JLabel("Cedula:");
		nomlab = new JLabel("Nombres:");
		apelab = new JLabel("Apellidos:");
		edadlab = new JLabel("Edad:");
		carlab = new JLabel("Cargo:");
		cedtf = new JTextField();
		nomtf = new JTextField();
		cartf = new JTextField();
		edadtf = new JTextField();
		apetf = new JTextField();
		setSize (400,400);
		setResizable(false);
		setTitle("SALA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		
		atrasbut.setActionCommand(ATRÁS);
		atrasbut.addActionListener(pControl);
		atrasbut.setFocusPainted(false);
		atrasbut.setBounds(50, 300, 90 ,30 );
		
		
		actualizarbut.setActionCommand(ACTUALIZAR);
		actualizarbut.addActionListener(pControl);
		actualizarbut.setFocusPainted(false);
		actualizarbut.setBounds(250, 300, 90 ,30 );
		
		cedlab.setBounds(50,10 ,100, 75);
		cedtf.setBounds(110, 30, 200,35);
		nomlab.setBounds(50, 60, 100, 75);
		nomtf.setBounds(110, 80, 200, 35);
		apelab.setBounds(50, 110, 100, 75);
		apetf.setBounds(110, 130, 200, 35);
		edadlab.setBounds(50,160 , 100, 75);
		edadtf.setBounds(110, 180, 200, 35);
		carlab.setBounds(50, 210, 100, 75);
		cartf.setBounds(110, 230, 200, 35);

		add(cedlab);
		add(cedtf);
		add(nomtf);
		add(nomlab);
		add(carlab);
		add(cartf);
		add(apelab);
		add(apetf);
		add(edadlab);
		add(edadtf);
		add(carlab);
		add(cartf);
		add(atrasbut);
		add(actualizarbut);
	}




	public JLabel getCedlab() {
		return cedlab;
	}

	public JLabel getNomlab() {
		return nomlab;
	}

	public JLabel getApelab() {
		return apelab;
	}

	public JLabel getEdadlab() {
		return edadlab;
	}

	public JLabel getCarlab() {
		return carlab;
	}

	public JTextField getCedtf() {
		return cedtf;
	}

	public JTextField getNomtf() {
		return nomtf;
	}

	public JTextField getCartf() {
		return cartf;
	}

	public JTextField getEdadtf() {
		return edadtf;
	}

	public JTextField getApetf() {
		return apetf;
	}
	
}
