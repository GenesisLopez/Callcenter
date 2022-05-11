package com.callcenter;

import java.util.ArrayList;
import java.util.HashSet;

public class Callcenter {

	HashSet<Cliente> listado;
	ArrayList<Integer> zonasDeCobertura;

	public Callcenter(HashSet<Cliente> listado, ArrayList<Integer> zonasDeCobertura) {
		super();
		this.listado = listado;
		this.zonasDeCobertura = zonasDeCobertura;
	}

	public Cliente realizarNuevaLlamada() {
		
		Cliente cliente = buscarAlCandidato();
		
		System.out.println(cliente);

		
		return cliente;
	}

	public Cliente buscarAlCandidato() {
		
		for (Cliente cliente : listado) {
			
			if(!cliente.getEsCliente()) {
				if(cliente.getVolverALlamar()) {
					if(zonasDeCobertura.contains(cliente.getCodigoPostal())) {
						
						return cliente;
					}
					
				}
			}
			
			
		}
		return null;
		

	}

	public HashSet<Cliente> getListado() {
		return listado;
	}

	public void setListado(HashSet<Cliente> listado) {
		this.listado = listado;
	}

	public ArrayList<Integer> getZonasDeCobertura() {
		return zonasDeCobertura;
	}

	public void setZonasDeCobertura(ArrayList<Integer> zonasDeCobertura) {
		this.zonasDeCobertura = zonasDeCobertura;
	}
	
}
