package ProcesarEmpleados;

/**
 *
 * @author Genarogg
 */
public class Empleados {
    private String primerNombre;
    private String apellidoPaterno;
    private String departamento;
    private double salario;

    public Empleados(String primerNombre, String apellidoPaterno, String departamento, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}
