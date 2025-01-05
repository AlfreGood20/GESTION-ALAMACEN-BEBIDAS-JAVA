package PRACTICA_13;

public class Principal {

	public static void main(String[] args) {
		Almacen nuevaAlmacen=new Almacen(2,2);
		
		AguaMineral bebida1=new AguaMineral(2,22.50,"Peñafiel",9920,"Mañatial");
		AguaMineral bebida2=new AguaMineral(1,30,"Peñafiel",83874,"DEL RIO");
		aguaAzucadara bebida3=new aguaAzucadara(500,22.88,"Coca-Cola",77788,25,false);
		aguaAzucadara bebida4 = new aguaAzucadara(500, 25.99, "Fanta", 77785, 50,true);
		aguaAzucadara bebida5=new aguaAzucadara(200,50.5,"Mirinda",4345,35,true);
		
		nuevaAlmacen.agregarProducto(bebida1);
		nuevaAlmacen.agregarProducto(bebida2);
		nuevaAlmacen.agregarProducto(bebida3);
		nuevaAlmacen.agregarProducto(bebida4);
		nuevaAlmacen.agregarProducto(bebida5);
		
		System.out.println("-------------------------------------------------------------");
		nuevaAlmacen.calcularPrecioTodasLasBebidas();
		System.out.println("-------------------------------------------------------------");
		nuevaAlmacen.calcularElPrecioTotalDeUnaEstantería(0);
		System.out.println("-------------------------------------------------------------");
		nuevaAlmacen.calcularPrecioUnaSolaMarca("Peñafiel");
		System.out.println("-------------------------------------------------------------");
		nuevaAlmacen.eliminarProducto(464564);
		nuevaAlmacen.eliminarProducto(77785);
		System.out.println("-------------------------------------------------------------");
		nuevaAlmacen.mostrarInformacion();
	}
}
