package iscot.client;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import iscot.client.gui.ACIcon;
import iscot.enums.AirConditioningMode;
import iscot.enums.Areas;
import iscot.enums.Type;
import iscot.events.AreaTemperatureOrderEvent;

public class AC {

	/**
	 * 
	 * @param server address and port
	 * @param roomName: string
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * @throws NumberFormatException 
	 * @throws InterruptedException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
		if(args.length!=3) {
			System.err.println("Invalid arguments!");
		}
		else {
			// TODO connect to server
			
			// TODO register with the server
			Areas area=Areas.valueOf(args[2]);
			
			JFrame janela = new JFrame("Ventilador em "+area);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
			
			// Criar os componentes gráficos
			JPanel painel=new JPanel();
			painel.setLayout(new BorderLayout());
			ACIcon ac = new ACIcon();
			painel.add(ac,BorderLayout.CENTER);
			janela.setContentPane(painel);
			janela.setLocation(600, 400);
			janela.setMinimumSize(janela.getSize());
			janela.pack();
			janela.setVisible(true);
			
			Thread.sleep(5000);
			ac.setAtivo(true);

			// TODO: receive and handle messages from server
			
			// TODO: for first phase: create an appropriate event hardcoded locally and change the GUI accordingly
			System.out.println("A aguardar 5 segundos para ligar o AC...");
			Thread.sleep(5000);
			
			AreaTemperatureOrderEvent eventoFrio = new AreaTemperatureOrderEvent(area, AirConditioningMode.Frio); 
			System.out.println("Ordem local recebida: " + eventoFrio.toString());
			ac.setAtivo(true);
			AreaTemperatureOrderEvent eventoCalor = new AreaTemperatureOrderEvent(area, AirConditioningMode.Aquecimento); 
			System.out.println("Ordem local recebida: " + eventoCalor.toString());
			ac.setAtivo(true);
			AreaTemperatureOrderEvent eventoVentilacao = new AreaTemperatureOrderEvent(area, AirConditioningMode.Ventilação); 
			System.out.println("Ordem local recebida: " + eventoVentilacao.toString());
			ac.setAtivo(true);

			Thread.sleep(5000);
			AreaTemperatureOrderEvent eventoDesligar = new AreaTemperatureOrderEvent(area, AirConditioningMode.Desligado); 
			System.out.println("Ordem local recebida: " + eventoDesligar.toString());
			ac.setAtivo(false);
		}
	}
}
