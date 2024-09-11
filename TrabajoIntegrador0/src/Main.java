import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String nombre= validarNombre("Ingrese el nombre del empleado!");
        LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inicio"));
        double salarioBase= Double.parseDouble(validarSalario("Ingrese el salario"));


        Trabajador trabajador1 = new Trabajador(nombre,fechaInicio,salarioBase);
        JOptionPane.showMessageDialog(null,trabajador1);

        int vacaciones = trabajador1.calcularDiasVacaciones();
        JOptionPane.showMessageDialog(null,vacaciones);

        double aumentoSalarial = trabajador1.calcularAumentoSalarial();
        JOptionPane.showMessageDialog(null,aumentoSalarial);

        double indemnizacion = trabajador1.calcularIndeminizacionDespido(100);
        JOptionPane.showMessageDialog(null,indemnizacion);




    }
    public static String validarNombre(String mensaje){
        boolean flag;
        String validar;

        do{
            flag=true;
            validar=JOptionPane.showInputDialog(null,mensaje);
            while(validar.isEmpty()){
                validar=JOptionPane.showInputDialog(null,"Error"+mensaje);
            }
            for (int i = 0; i < validar.length(); i++) {
                if(!Character.isAlphabetic(validar.charAt(i))){
                    JOptionPane.showMessageDialog(null,"Ingresa el nombre, sin numeros");
                    flag=false;
                    break;
                }

            }

        }while(!flag);
        return validar;
    }
    public static String validarSalario(String mensaje){
        boolean flag;
        String validar;

        do{
            flag=true;
            validar=JOptionPane.showInputDialog(null,mensaje);
            while(validar.isEmpty()){
                validar=JOptionPane.showInputDialog(null,"Error"+mensaje);
            }
            for (int i = 0; i < validar.length(); i++) {
                if(!Character.isDigit(validar.charAt(i))){
                    JOptionPane.showMessageDialog(null,"Ingresa un salario valido");
                    flag=false;
                    break;
                }
                double salarioD = Double.parseDouble(validar);
                if(salarioD <= 0){
                    JOptionPane.showMessageDialog(null,"Ingresa un salario valido");
                    flag=false;
                    break;
                }

            }

        }while(!flag);
        return validar;
    }


}