package br.uefs.ecomp.swConsumer.model;

/**
 * Essa classe define a Nuvem do servidor
 * @author omega
 */
public class Nuvem {
    private int vazao;
    private int consumo;

    public Nuvem(int vazao, int consumo) {
        this.vazao = vazao;
        this.consumo = consumo;
    }

    public int getVazao() {
        return vazao;
    }

    public void setVazao(int vazao) {
        this.vazao = vazao;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    
    
}
