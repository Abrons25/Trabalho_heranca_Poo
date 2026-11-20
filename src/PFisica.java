public class PFisica extends Contribuinte {
    protected String cpf;

    public PFisica(String n, double r, String c) {
        this.nome = n;
        this.rendaBrt = r;
        this.cpf = c;
    }

    public double calcImposto() {
        double imposto = 0;

        if (rendaBrt <= 1400){
            imposto = 0;
        } else if(rendaBrt <= 2100){
            imposto = (rendaBrt * 0.10) - 100;
        }else if (rendaBrt <= 2800.00) {
            imposto = (rendaBrt * 0.15) - 270.00;
        } else if (rendaBrt <= 3600.00) {
            imposto = (rendaBrt * 0.25) - 500.00;
        } else {
            imposto = (rendaBrt * 0.30) - 700.00;
        }
        return imposto;
    }
}