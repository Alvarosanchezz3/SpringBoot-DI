package com.alvaro.springbootdi.controllers.services;

import org.springframework.stereotype.Component;

//@Component("ServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override /* @Override: Anotación que indica que un método se sobreescribe de la clase padre, en este caso de la interfaz IServicio*/
    public String operacion () {
        return "Ejecutando algún proceso importante complicado...";
    }
	
}
