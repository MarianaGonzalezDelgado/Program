package proyecto240817;

public class Person {
	private String inicioCadenaInsert;
    private String nombre;
    private String apellido;
    private String curp;
    private String fecNacimiento;
    private String genero;
    private String finCadenaInsert;

  public Person(String inicioCadenaInsert, String nombre, String apellido, String curp, String fecNacimiento, 
    		 String genero, String finCadenaInsert){
        this.inicioCadenaInsert = inicioCadenaInsert;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.fecNacimiento = fecNacimiento;
        this.genero = genero;
        this.finCadenaInsert = finCadenaInsert;
        	    }
    public String getInicioCadenaInsert() {
        return inicioCadenaInsert;
    }
    public void setInicioCadenaInsert(String inicioCadenaInsert) {
        this.inicioCadenaInsert = inicioCadenaInsert;
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
  
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }
    public String getFecNacimiento() {
        return fecNacimiento;
    }
    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getFinCadenaInsert() {
        return finCadenaInsert;
    }
    public void setFinCadenaInsert(String finCadenaInsert) {
        this.finCadenaInsert = finCadenaInsert;
    }

@Override
public String toString(){
    return  this.inicioCadenaInsert  + "" +  this.nombre + "" + this.apellido + "" + 
	this.curp + "" + this.fecNacimiento + "" + this.genero + "" +
 this.finCadenaInsert;
}
}