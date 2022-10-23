package semana6Sockets;

import java.io.DataInputStream;
import java.net.Socket;

public class ClienteS {
	
	String host = "localhost";
	int puerto = 5000;
	
	
	public ClienteS() {
		try  {
			Socket socketcliente = new Socket(host, puerto);
			DataInputStream flujo = new DataInputStream(socketcliente.getInputStream());
			System.out.println(flujo.readUTF());
			socketcliente.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new ClienteS();
	}
	
}
