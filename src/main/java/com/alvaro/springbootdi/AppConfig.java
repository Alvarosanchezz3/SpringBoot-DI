package com.alvaro.springbootdi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alvaro.springbootdi.controllers.domain.ItemFactura;
import com.alvaro.springbootdi.controllers.domain.Producto;
import com.alvaro.springbootdi.controllers.services.IServicio;
import com.alvaro.springbootdi.controllers.services.MiServicio;
import com.alvaro.springbootdi.controllers.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Primary
	@Bean("ServicioSimple")
	public IServicio registrarMiServicioSimple() {
		return new MiServicio();
	}
	
	@Bean("ServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems () {
		Producto producto1 = new Producto("Cámara Logitech", 100);
		Producto producto2 = new Producto("Bicicleta de montaña", 300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2); // Crea lista de los items
	}
	
	@Primary
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina () {
		Producto producto1 = new Producto("Monitor LG 24", 250);
		Producto producto2 = new Producto("Notebook Asus", 500);
		Producto producto3 = new Producto("Impresora HP", 80);
		Producto producto4 = new Producto("Escritorio oficina", 300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4); // Crea lista de los items
	}
}