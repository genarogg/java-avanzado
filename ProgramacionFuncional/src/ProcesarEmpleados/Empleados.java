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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String obtenerNombre(){
        return String.format("%s %s", getPrimerNombre(), getApellidoPaterno());
    }
    @Override
    public String toString(){
        return String.format("%-10s %-10s %10.2f %s", 
                                                      getPrimerNombre(),
                                                      getApellidoPaterno(),
                                                      getSalario(),
                                                      getDepartamento());
    }
    
}
