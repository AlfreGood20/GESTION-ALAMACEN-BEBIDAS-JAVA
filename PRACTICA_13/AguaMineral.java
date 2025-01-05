package PRACTICA_13;

public class AguaMineral extends bebida{
	private String origen;
	
	public AguaMineral() {
		super();
		this.origen="";
	}

	public AguaMineral(int cantidadDeLitros, double precio, String marca, int id,String origen) {
		super(cantidadDeLitros, precio, marca, id);
		this.origen=origen;
	}

	@Override
	public void mostrarInf() {
		System.out.println("Cantidad lt: "+getCantidadDeLitros()+"\nPrecio: "+getPrecio()+"\nMarca: "+getMarca()+"\nID: "+getId()+"\nOrigen: "+this.origen);
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
