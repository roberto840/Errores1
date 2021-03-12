package programaerrores1;

public class Errores {
    private double valorReal;
    private double valorAproximado;

    public Errores(double valorReal, double valorAproximado) {
        this.valorReal = valorReal;
        this.valorAproximado = valorAproximado;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorAproximado() {
        return valorAproximado;
    }

    public void setValorAproximado(double valorAproximado) {
        this.valorAproximado = valorAproximado;
    }
       
    public double ErrorAbsoluto(){
        double Absoluto=valorReal-valorAproximado;
        if(Absoluto<0)
            return Absoluto*-1;
        else
            return Absoluto;
    }
    
    public double ErrorRelativo(){
        double Absoluto=ErrorAbsoluto();
        return Absoluto/valorReal;
    }
    
    public double ErrorRelativoPorcentual(){
        return ErrorRelativo()*100;
    }
}
