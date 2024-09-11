import java.time.LocalDate;
import java.time.Period;

public class Trabajador {
    //Atributos
    private String nombre;
    private LocalDate fechaInicio;
    private double salarioBase;

    // Constructor
    public Trabajador(String nombre, LocalDate fechaInicio, double salarioBase){
        this.nombre=nombre;
        this.fechaInicio=fechaInicio;
        this.salarioBase=salarioBase;

    }
    // get y set

    public String getNombre(){
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    //metodos
    public int calcularDiasVacaciones(){
        int diasVacaciones;
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(this.fechaInicio,fechaHoy);
        int anios = periodo.getYears();
        diasVacaciones = anios*7;
        return  diasVacaciones;


    }
    public double calcularAumentoSalarial(){
        int aumento;
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(this.fechaInicio,fechaHoy);
        int anios = periodo.getYears();
        aumento = anios * 1000;
        return  aumento;
    }
    public double calcularIndeminizacionDespido(int salarioBase){
        double indemnizacion;
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(this.fechaInicio,fechaHoy);
        int anios = periodo.getYears();
        indemnizacion = anios * this.salarioBase;
        return indemnizacion;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
