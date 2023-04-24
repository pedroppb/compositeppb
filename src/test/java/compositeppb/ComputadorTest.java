package compositeppb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ComputadorTest {
    @Test
    void deveRetornarDescricaoDoComputador() {
        Categoria categoria1 = new Categoria("Peças essenciais");
        Peca peca11 = new Peca("cpu: ryzen 5 5600", 500.0F);
        Peca peca12 = new Peca("mobo: a520m-itx/ac", 700.0F);
        Peca peca13 = new Peca("ram: 2x8 3600 gloway rgb", 300.0F);
        Peca peca14 = new Peca("fonte: tr2 500w", 250.0F);
        categoria1.addConteudo(peca11);
        categoria1.addConteudo(peca12);
        categoria1.addConteudo(peca13);
        categoria1.addConteudo(peca14);

        Categoria categoria2 = new Categoria("placas expanção");
        Peca peca21 = new Peca("gpu: rtx 3060 ti", 1300.0F);
        Peca peca22 = new Peca("wifi: placa wifi m.2 onboard", 0.0F);
        categoria2.addConteudo(peca21);
        categoria2.addConteudo(peca22);

        Categoria categoria3 = new Categoria("Armazenamento");
        Peca peca31 = new Peca("ssd: xpg s40 512gb", 300.0F);
        Peca peca32 = new Peca("hd: 3tb 7200", 300.0F);
        categoria3.addConteudo(peca31);
        categoria3.addConteudo(peca32);

        Categoria categoria4 = new Categoria("outras peças");
        Peca peca41 = new Peca("gabinete: cougar qbx", 400.0F);
        Peca peca42 = new Peca("cooler: water cooler custom", 300.0F);
        categoria4.addConteudo(peca41);
        categoria4.addConteudo(peca42);

        Categoria categoria5 = new Categoria("perifericos");
        Peca peca51 = new Peca("monitor: tv 40 polegadas", 1000.0F);
        Peca peca52 = new Peca("teclado/mouse: Teclado e Mouse sem fio Logitech MK220", 100.0F);
        categoria5.addConteudo(peca51);
        categoria5.addConteudo(peca52);

        Categoria listapecas = new Categoria("Computador do pedro");
        listapecas.addConteudo(categoria1);
        listapecas.addConteudo(categoria2);
        listapecas.addConteudo(categoria3);
        listapecas.addConteudo(categoria4);
        listapecas.addConteudo(categoria5);

        Computador computador = new Computador();
        computador.setDescricao(listapecas);

        assertEquals("Computador do pedro\n" +
                "Peças essenciais\n" +
                "cpu: ryzen 5 5600 - R$ 500,00\n" +
                "mobo: a520m-itx/ac - R$ 700,00\n" +
                "ram: 2x8 3600 gloway rgb - R$ 300,00\n" +
                "fonte: tr2 500w - R$ 250,00\n" +
                "placas expanção\n" +
                "gpu: rtx 3060 ti - R$ 1300,00\n" +
                "wifi: placa wifi m.2 onboard - R$ 0,00\n" +
                "Armazenamento\n" +
                "ssd: xpg s40 512gb - R$ 300,00\n" +
                "hd: 3tb 7200 - R$ 300,00\n" +
                "outras peças\n" +
                "gabinete: cougar qbx - R$ 400,00\n" +
                "cooler: water cooler custom - R$ 300,00\n" +
                "perifericos\n" +
                "monitor: tv 40 polegadas - R$ 1000,00\n" +
                "teclado/mouse: Teclado e Mouse sem fio Logitech MK220 - R$ 100,00\n", computador.getDescricao());
    }
    @Test
    void deveRetornarExecacaoComputadrorSemDescricao() {
        try {
            Computador computador = new Computador();
            computador.getDescricao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Computador sem descrição", e.getMessage());
        }
    }
}
