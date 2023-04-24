package compositeppb;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Conteudo {

    private List<Conteudo> listaConteudos;

    public Categoria(String descricao) {
        super(descricao);
        this.listaConteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo Conteudo) {
        this.listaConteudos.add(Conteudo);
    }

    public String getPeca() {
        String saida = "";
        saida = this.getDescricao() + "\n";
        for (Conteudo conteudo : listaConteudos) {
            saida += conteudo.getPeca();
        }
        return saida;
    }
}
