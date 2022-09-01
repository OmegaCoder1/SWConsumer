package br.uefs.ecomp.swConsumer.model;

/**
 *  Essa classe é responsável pela definição de Hidrometro
 * @author Robson Jones
 */
public class Hidrometro {
    private int id;
    private int vazao;
    private int consumo;
    private boolean abastecimento;

    public Hidrometro(int id, int vazao, int consumo, boolean abastecimento) {
        this.id = id;
        this.vazao = vazao;
        this.consumo = consumo;
        this.abastecimento = abastecimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAbastecimento() {
        return abastecimento;
    }

    public void setAbastecimento(boolean abastecimento) {
        this.abastecimento = abastecimento;
    }
    
}
