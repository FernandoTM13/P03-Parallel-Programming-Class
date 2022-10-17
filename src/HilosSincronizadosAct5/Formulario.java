package HilosSincronizadosAct5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tareaSemana5Hilos.MainHiloP;

public class Formulario extends JFrame implements ActionListener{
	

		
	
	public JButton btn1, btn2;
	public JLabel l1, l2;
	public JPanel p1, p2;
	public Thread hilo1, hilo2;
	
	public Formulario() {
		initComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initComponentes() {
		
		this.setSize(500,450);
		getContentPane().setLayout(null);
		
		btn1 = new JButton();
		btn1.setText("Iniciar Tiempo Hilo");
		btn1.setBounds(100, 100, 300, 40);
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Parar Hilo");
		btn2.setBounds(100, 150, 300, 40);
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
		p1 = new JPanel();
		getContentPane().add(p1);
		p1.setBackground(Color.green);
		p1.setBounds(100, 200, 300, 70);
		p1.setVisible(false);
		
		p2 = new JPanel();
		getContentPane().add(p2);
		p2.setBackground(Color.red);
		p2.setBounds(100, 200, 300, 70);
		p2.setVisible(false);
		
		l1 = new JLabel("");
		p1.add(l1);
		l1.setVisible(true);
		
		l2 = new JLabel("");
		p2.add(l2);
		l2.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			
			p1.setVisible(true);
			
			DatoC d = new DatoC();
			hilo1 = new Thread(new HiloEscritorCro(d));
			hilo2 = new Thread(new HiloLectorCro(d));
			hilo1.start();
			
			hilo2.start();
		}
		
		if(e.getSource() == btn2) {
			hilo1.stop();
			hilo2.stop();
		}
		
	}	
}
