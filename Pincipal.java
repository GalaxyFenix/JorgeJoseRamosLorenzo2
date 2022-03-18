
public class Pincipal {

	public static void main(String[] args) {
		Colegio col1 = new Colegio();
		
		
		
		Colegio col2 = new Colegio("Campo Arañuelo", "c/no se cual",300 );
		
		System.out.println("Los atributos son: ");
		System.out.println("Nombre: " +col2.getNombre());
		System.out.println("Dirección: " +col2.getDireccion());
		System.out.println("Numero de alumnos: " +col2.getNum_alumnos());

	}

}
