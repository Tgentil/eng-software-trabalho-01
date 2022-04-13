package Model;

public class FaixaEtaria {
    
    private int de;
    private int ate;

    public boolean ehAbaixo(FaixaEtaria faixa) {
        return (faixa.de >= this.de && faixa.ate <= this.ate);
    }
}
