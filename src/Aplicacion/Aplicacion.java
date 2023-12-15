package Aplicacion;

import Vistas.PanelDeControl;
import Controlador.Controlador;
import Modelo.Modelo;

public class Aplicacion {

    public static void main(String[] args) {
        PanelDeControl panel = new PanelDeControl();
        Modelo modelito = new Modelo();
        Controlador control = new Controlador(modelito, panel);
        
        // Iniciar la vista a través del controlador
        control.iniciarVista();
    }
}
