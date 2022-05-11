package com.callcenter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

public class CallcenterTest {

	@Test
	public void queSePuedaBuscarUnCandidato() {
		
		HashSet<Cliente>listado = new HashSet<>();
		ArrayList<Integer>zonasDeCobertura = new ArrayList<>();
		
		
		zonasDeCobertura.add(1755);
		zonasDeCobertura.add(2590);
		zonasDeCobertura.add(3214);
		zonasDeCobertura.add(4897);
		
		Cliente cliente = new Cliente("Genesis", "Lopez", "lopez@gmail.com", "La Matanza", Provincia.BUENOS_AIRES, "Miguel Cane", 1755, 1134353637, false, true);
		Cliente cliente2 = new Cliente("Nahuel", "Giani", "lopez@gmail.com", "La Matanza", Provincia.BUENOS_AIRES, "Miguel Cane", 2590, 1134353637, false, true);
		Cliente cliente3 = new Cliente("Nahuel", "Giani", "lopez@gmail.com", "La Matanza", Provincia.BUENOS_AIRES, "Miguel Cane", 2590, 1134353637, false, true);
		
		
		listado.add(cliente);
		listado.add(cliente2);
		listado.add(cliente3);
		
		Callcenter callcenter = new Callcenter(listado, zonasDeCobertura);
		
		String valorEsperado = "Genesis";
		String valorObtenido = callcenter.buscarAlCandidato().getNombre();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void queSePuedaRealizarUnaNuevaLlamadaSiNoEsCliente() {
		
		HashSet<Cliente>listado = new HashSet<>();
		ArrayList<Integer>zonasDeCobertura = new ArrayList<>();
		
		
		zonasDeCobertura.add(1755);
		zonasDeCobertura.add(2590);
		zonasDeCobertura.add(2456);
		zonasDeCobertura.add(4897);
		
		Cliente cliente = new Cliente("Juan", "Perez", "Perez@hotmail.com", "San Justo", Provincia.BUENOS_AIRES , "Indart", 2456, 1178090032, false, true);
		
		listado.add(cliente);
		
		Callcenter callcenter = new Callcenter(listado, zonasDeCobertura);
		
		String valorEsperado = "Juan";
		String valorObtenido = callcenter.realizarNuevaLlamada().getNombre();
		
		assertEquals(valorEsperado,valorObtenido);
	}
}
