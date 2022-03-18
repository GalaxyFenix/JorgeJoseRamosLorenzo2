
public class Colegio {

	String Nombre, Dirección;
	int num_alumnos;

	public Colegio () {}
	
	public Colegio (String Nombre, String Dirección, int num_alumnos){
	this.Nombre=Nombre;
	this.Dirección=Dirección;
	this.num_alumnos=num_alumnos;}
	
	public void setNombre (String valor1) {
		this.Nombre	= valor1;}
	public void setDireccion (String valor2) {
		this.Dirección = valor2;}
	public void setNum_alumnos (int valor3) {
		this.num_alumnos = valor3;}
	
	public String getNombre () {
		return this.Nombre;	}
	public String getDireccion () {
		return this.Dirección;	}
	public int getNum_alumnos () {
		return this.num_alumnos;	}
 
}
