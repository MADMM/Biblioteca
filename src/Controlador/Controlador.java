package Controlador;

import Modelo.*;
import Vistas.*;

public class Controlador {

	private Modelo MiModelo;
	private PanelDeControl MiPanelDeControl;
	private Consultas MiConsultas;


	public Controlador(Modelo MiModelo, PanelDeControl MiPanelDeControl) {
		super();
		MiModelo = MiModelo;
		MiPanelDeControl = MiPanelDeControl;
		
	
	}
	
	/**
	 * M�todo iniciador del interfaz
	 */
	public void iniciarVista() {
		
		
		MiPanelDeControl.setTitle(MiModelo.getNombreVentana() );
		MiPanelDeControl.setVisible(true);
		MiPanelDeControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
