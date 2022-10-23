package semana6Sockets;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

public class ServidorS {

	int puerto = 5000;
	
	
	
	public ServidorS() {
		try {
			System.out.println("Socket Servidor");
			ServerSocket socketservidor = new ServerSocket(puerto);
			System.out.println("Escucho al puerto " +  puerto);
			
			for (int cli = 1; cli < 4; cli++) {
				Socket socketcliente = socketservidor.accept();
				System.out.println("Sirvo al cliente " + cli);
				DataOutputStream flujo = new DataOutputStream(socketcliente.getOutputStream());
				flujo.writeUTF("Hola cliente " +  cli);
				
				socketcliente.close();
				
			}
			
			System.out.println("Muchos clientes");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		new ServidorS();
	}
	
}


