package PRACTICA_13;

public class Almacen {
	 private Object[][] objetos;
	 
	//CREAR AL MACEN
	public Almacen(int fila, int columna) {
		this.objetos=new Object[fila][columna];
	}
	//POR DEFECTO
	public Almacen() {
		this.objetos=new Object[5][5];
	}

	public void calcularPrecioTodasLasBebidas() {
		double total=0;
		for(int i=0;i<objetos.length;i++) {
			for(int j=0;j<objetos[0].length;j++){
				if(objetos[i][j]!=null) {
					bebida producto=(bebida)objetos[i][j];
					total+=producto.getPrecio();
				}
			}
		}
		System.out.println("Precio total de todas las bebidas: "+total);
	}
	
	public void calcularPrecioUnaSolaMarca(String marca) {
		double precioMarca=0;
		for(int i=0;i<objetos.length;i++) {
			for(int j=0;j<objetos[0].length;j++) {
				bebida producto=(bebida)objetos[i][j];
				if(producto.getMarca().equals(marca)) {
					precioMarca+=producto.getPrecio();
				}
			}
		}
		System.out.println("El precio total de las bebida de la "+marca+" es: "+precioMarca);
	}
	
	public void calcularElPrecioTotalDeUnaEstantería(int columna) {
		double precioEstanderia = 0;

		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i][columna] != null) {
				bebida producto = (bebida) objetos[i][columna];
				precioEstanderia += producto.getPrecio();
			}
		}
		System.out.println("El precio total de esta estanderia es: " + precioEstanderia);
	}
	
	public void agregarProducto(Object producto) {
		//CONDICIONAMOS SI EL PRODUCTO PARAMETRADO ES IGUAL A UN OBJETO TIPO BEBIDA
		//SI NO ES ASI NO SE PRODRA GUARDAR
		if (!(producto instanceof bebida)) {
			System.out.println("El objeto no es una bebida válida.");
			//NO RETORNAMOS NADA EN ESTE CASO
			return;
		}
		//CREAMOS UNA VARIABLE PARA PODER AGREGAR LA BEBIDA EN EL ARRAY
		bebida nuevaBebida = (bebida) producto;
		
		// ENCONTRAR ESPACIO LIBRE
		int fila = 0;
		int columna = 0;
		boolean encontrarEspacio=false;
		for (int i = 0; i < objetos.length; i++) {
			for (int j = 0; j < objetos[0].length; j++) {
				if (objetos[i][j] == null) {
					fila = i;
					columna = j;
					encontrarEspacio=true;
					break;
				}
			}
		}
		if(!encontrarEspacio) {
			System.out.println("No hay espacio disponibles");
			return;
		}
		
		// ENCONTRAR BEBIDAS REPETIDAS POR EL ID SI SON NO SE AGREGARA
		boolean encontrar = false;
		for (int i = 0; i < objetos.length; i++) {
			for (int j = 0; j < objetos[0].length; j++) {
				//SI EL OBJETO COLOCADO ES IGUAL AL UN OBJETO TIPO BEBIDA
				if(objetos[i][j] instanceof bebida) {
					//HACEMOS UN VARIBBLE EN EL CUAL GUARDAMOS LA BEBIDA YA EXISTENTE
					bebida bebidaExistente=(bebida)objetos[i][j];
					//CONDICIONAMOS SI LA BEBIDA NUEVA Y LA BEBIDA EXISTTENTE ID SON IGUALES
					//EL BOOLEANO SE PASARA A TRUE Y SE SALE DEL BUCLE
					if(nuevaBebida.getId()==bebidaExistente.getId()) {
						encontrar=true;
						break;
					}
				}
			}
		}
		//SI ENCONTRADO==TRUE YA SE ENCUENTRA EL PRODUCTO
		if(encontrar) {
			System.out.println("Ese producto ya se encuentra en el almacen");
			return;
		//SI NO PUES LO GUARDAMOS
		}else {
			objetos[fila][columna]=nuevaBebida;
			System.out.println("Se acaba de agregar la bebida ["+fila+"]"+"["+columna+"]");
		}
	}
	
	public void eliminarProducto(int id) {
		boolean encontrado=false;
		for(int i=0;i<objetos.length;i++) {
			for(int j=0;j<objetos[0].length;j++) {
				bebida producto=(bebida)objetos[i][j];
				if(producto.getId()==id) {
					objetos[i][j]=null;
					encontrado=true;
					break;
				}
			}
		}
		if(!encontrado) {
			System.out.println("No se encuentra esa bebida");
		}
		else {
			System.out.println("Se a elimina correctamente");
		}
	}
	
	public void mostrarInformacion() {
		for(int i=0;i<objetos.length;i++) {
			for(int j=0;j<objetos[0].length;j++) {
				bebida producto=(bebida)objetos[i][j];
				if(producto!=null) {
					producto.mostrarInf();
					System.out.println("");
				}
			}
		}
	}
}
