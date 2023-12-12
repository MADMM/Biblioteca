package Aplicacion;


/**
 * Este es el aplicativo desde donde se lanza la aplicación
 * @author Alumno
 * @version 0.0
 */


import Vistas.PanelDeControl;
import Controlador.*;
import Modelo.Modelo;
public class Aplicacion {

    public static void main(String[] args) {
    	PanelDeControl panel = new PanelDeControl();
    	Modelo modelito = new Modelo();
    	
    	Controlador control = new Controlador(modelito, panel);
    	

    }
}
