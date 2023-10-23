package com.alvaro.springbootdi.controllers.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary // Sirve para elegirlo como predeterminado
//@Component("ServicioSimple")
public class MiServicio implements IServicio{

	@Override // @Override: Anotación que indica que un método se sobreescribe de la clase padre, en este caso de la interfaz IServicio
    public String operacion () {
        return "Ejecutando algún proceso importante simple...";
    }
	
}
