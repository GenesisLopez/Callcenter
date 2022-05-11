package com.callcenter;

public class Cliente {

	private String nombre;
	private String apellido;
	private String email;
	private String localidad;
	private Provincia provincia;
	private String direccion;
	private Integer codigoPostal;
	private Integer celular;
	private Boolean esCliente;
	private Boolean volverALlamar;

	public Cliente(String nombre, String apellido, String email, String localidad, Provincia provincia,
			String direccion, Integer codigoPostal, Integer celular, Boolean esCliente, Boolean volverALlamar) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.localidad = localidad;
		this.provincia = provincia;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.celular = celular;
		this.esCliente = esCliente;
		this.volverALlamar = volverALlamar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getVolverALlamar() {
		return volverALlamar;
	}

	public void setVolverALlamar(Boolean volverALlamar) {
		this.volverALlamar = volverALlamar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		return true;
	}
	
}
