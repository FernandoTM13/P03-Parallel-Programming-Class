package tareaSemana5Hilos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainHiloP implements Runnable {
	
	static InterfazHilo objeto;
	
	public static void main(String args[]){
	
		objeto = new InterfazHilo();
		objeto.setVisible(true);
	}

	@Override
	public void run() {
		
		int segundos = 0, minutos = 0, contadorColor = 2 ;
		
		while (true) {
			
			try {
				Thread.sleep(1000);
				if(segundos == 59) {
					minutos++;
					segundos = 0;
				}
				
				if(contadorColor == 2) {
					objeto.p1.setBackground(Color.green);
					contadorColor = 1;
				}else{
					objeto.p1.setBackground(Color.red);
					contadorColor = 2;
				}
				
				segundos++;
				objeto.l1.setText(minutos + " min: " + segundos + " seg");
				
			} catch (Exception e) {
				System.out.println("Error en el programa: " + e.getMessage());
			}
		}
		
}}



class InterfazHilo extends JFrame implements ActionListener{
	
	public JButton btn1, btn2;
	public JLabel l1, l2;
	public JPanel p1, p2;
	public Thread hilo1;
	
	public InterfazHilo() {
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
		p1.setBackground(Color.blue);
		p1.setBounds(100, 200, 300, 70);
		p1.setVisible(false);
		
		p2 = new JPanel();
		getContentPane().add(p2);
		p2.setBackground(Color.blue);
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
			hilo1 = new Thread(new MainHiloP());
			hilo1.start();
		}
		
		if(e.getSource() == btn2) {
			hilo1.stop();
		}
		
	}	
}