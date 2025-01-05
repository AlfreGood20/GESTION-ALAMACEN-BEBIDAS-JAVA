package PRACTICA_13;

public abstract class bebida {

	private int CantidadDeLitros;
	private double precio;
	private String marca;
	private int id;
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public bebida(int cantidadDeLitros, double precio, String marca, int id) {
		this.CantidadDeLitros = cantidadDeLitros;
		this.precio = precio;
		this.marca = marca;
		this.id = id;
	}
	
	//CONSTRUCTOR POR DEFECTO
	public bebida() {
		this.CantidadDeLitros = 0;
		this.precio = 0.0;
		this.marca = "";
		this.id = 0;
	}

	public abstract void mostrarInf();

	public int getCantidadDeLitros() {
		return CantidadDeLitros;
	}

	public void setCantidadDeLitros(int cantidadDeLitros) {
		CantidadDeLitros = cantidadDeLitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}