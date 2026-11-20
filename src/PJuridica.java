public class PJuridica extends Contribuinte {
    protected String cnpj;

    public PJuridica(String n, double r, String c) {
        this.nome = n;
        this.rendaBrt = r;
        this.cnpj = c;
    }

    public double calcImposto() {
        double imposto = rendaBrt * 0.10;
        return imposto;
    }
}