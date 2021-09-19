package com.grupo53.tienda53.BO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	
	
	
	@RequestMapping("/saludo")
	public String saludo() {
		
		return "hola soy un servicio wed (api)";
	}
	@RequestMapping("/listanum")
	public ArrayList<Integer> listanum(){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		return lista;
	}
	@RequestMapping("/listapaises")
	public ArrayList<Pais> listapais(){
		ArrayList<Pais> lista = new ArrayList<>();
		lista.add(new Pais(1,"Polombia"));
		lista.add(new Pais(2,"Rusia"));
		lista.add(new Pais(3,"España"));
		lista.add(new Pais(4,"Polonia"));
		lista.add(new Pais(5,"Alemania"));
		lista.add(new Pais(6,"Francia"));
		lista.add(new Pais(7,"Suecia"));
		return lista;
		
	}
	
	static class Pais implements Serializable{
		int id;
		String nombre;
		
		public Pais() {
			
		}

		public Pais(int id, String nombre) {
			this.id = id;
			this.nombre = nombre;
		}
		
	}

}
