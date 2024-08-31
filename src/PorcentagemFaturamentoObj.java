public class PorcentagemFaturamentoObj {
    private double porcentagem;
    private double faturamento;
    private String estado;
    public PorcentagemFaturamentoObj(double porcentagem, double faturamento, String estado) {
        this.porcentagem = porcentagem;
        this.faturamento = faturamento;
        this.estado = estado;
    }
    public String toString() {
        return "Porcentagem: " + porcentagem + "% - Faturamento: " + faturamento + " - Estado: " + estado;
    }
}
