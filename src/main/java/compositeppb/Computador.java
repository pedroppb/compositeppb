package compositeppb;

public class Computador {

    private Conteudo descricao;

    public void setDescricao(Conteudo descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        if (this.descricao == null) {
            throw new NullPointerException("Computador sem descrição");
        }
        return this.descricao.getPeca();
    }
}