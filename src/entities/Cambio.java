package entities;

public class Cambio {
    Double moedaPesquisada;
    Double moedaConvertida;

    public Cambio() {
    }

    public Cambio(Double moedaPesquisada, Double moedaConvertida) {
        this.moedaPesquisada = moedaPesquisada;
        this.moedaConvertida = moedaConvertida;
    }

    public Double getMoedaPesquisada() {
        return moedaPesquisada;
    }

    public void setMoedaPesquisada(Double moedaPesquisada) {
        this.moedaPesquisada = moedaPesquisada;
    }

    public Double getMoedaConvertida() {
        return moedaConvertida;
    }

    public void setMoedaConvertida(Double moedaConvertida) {
        this.moedaConvertida = moedaConvertida;
    }
}
