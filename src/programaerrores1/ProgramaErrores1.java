package programaerrores1;
import java.util.Scanner;
public class ProgramaErrores1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ValorReal,ValorAproximado;
        System.out.println("Ingrese el valor real:");
        ValorReal=teclado.nextDouble();
        System.out.println("Ingrese el valor aproximado:");
        ValorAproximado=teclado.nextDouble();
        Errores error1=new Errores(ValorReal,ValorAproximado);
        System.out.println("El error absoluto es: "+error1.ErrorAbsoluto());
        System.out.println("El error relativo es: "+error1.ErrorRelativo());
        System.out.println("El error relativo porcentual es: "+error1.ErrorRelativoPorcentual()+"%");
    }
    
}
