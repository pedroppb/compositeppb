package compositeppb;


public class Peca extends Conteudo {

    private float valor;

    public Peca(String descricao, float valor) {
        super(descricao);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPeca() {
        return this.getDescricao() + " - R$ " + String.format("%.02f", this.valor )+ "\n";
    }

}