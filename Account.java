package proyecto240817;

public class Account {
	private String inicioCadenaInsert;
    private String status;
    private String pass;
    private String alumno;
    private String maestro;
    private String administrador;
    private String finCadenaInsert;

    public Account(String inicioCadenaInsert, String pass,  
    		String alumno, String maestro, String administrador, String status, String finCadenaInsert){
        this.inicioCadenaInsert = inicioCadenaInsert;
        this.pass = pass;
        this.alumno = alumno;
        this.maestro = maestro;
        this.administrador = administrador;
        this.status = status;
        this.finCadenaInsert = finCadenaInsert;
    }

    public String getInicioCadenaInsert() {
        return inicioCadenaInsert;
    }

    public void setInicioCadenaInsert(String inicioCadenaInsert) {
        this.inicioCadenaInsert = inicioCadenaInsert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getFinCadenaInsert() {
        return finCadenaInsert;
    }

    public void setFinCadenaInsert(String finCadenaInsert) {
        this.finCadenaInsert = finCadenaInsert;
    }

   
@Override
public String toString(){
	return this.inicioCadenaInsert + "" + this.pass + "" + this.alumno + "" + this.maestro + "" 
+ this.administrador + "" + this.status + "" + this.finCadenaInsert;
}
}

