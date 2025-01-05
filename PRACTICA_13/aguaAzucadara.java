package PRACTICA_13;

public class aguaAzucadara extends bebida {
	private int porcentajeAzucar;
	private boolean promocion;

	public aguaAzucadara() {
		super();
		this.porcentajeAzucar=0;
		this.promocion=false;
		
	}

	public aguaAzucadara(int cantidadDeLitros, double precio, String marca, int id,int porcentajeAzucar,boolean promocion) {
		super(cantidadDeLitros,precio, marca, id);
		this.porcentajeAzucar=porcentajeAzucar;
		this.promocion=promocion;
		//APLICAR DESCUENTO DI PROMOCIO==TRUE
		if(promocion) {
			//METEMOS EL DESCUENTO CON EL METODO PRIVATE
			setPrecio(descuentoPromocion(super.getPrecio()));
		}else {
			setPrecio(precio);
		}
	}

	@Override
	public void mostrarInf() {
		System.out.println("Cantidad lt: "+getCantidadDeLitros()+"\nPrecio: "+getPrecio()+"\nMarca: "+getMarca()+"\nID: "+getId()+"\nPorcentaje De Azucar: "+this.porcentajeAzucar+"\nPromocion: "+this.promocion);
	}

	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	private double descuentoPromocion(double precio) {
		double precioDescuento=precio*0.10;
		double precioConDescuento=precio-precioDescuento;
		return precioConDescuento;
	}
}
