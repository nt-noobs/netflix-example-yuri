package com.edu.netflixexampleyuri.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Filme {
    @Id
    private long id;
    private String sinopse;
    private List<String> diretor;
    private List<String> nacionalidade;
    private List<String> elenco;
    private List<String> genero;
    private int anoProducao;
    private int anoLancamento;
    private int duracao;
    private List<String> indicacaoPremios;

    public Filme(long id, String sinopse, List<String> diretor, List<String> nacionalidade, List<String> elenco, List<String> genero, int anoProducao, int anoLancamento, int duracao, List<String> indicacaoPremios) {
        this.id = id;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.nacionalidade = nacionalidade;
        this.elenco = elenco;
        this.genero = genero;
        this.anoProducao = anoProducao;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.indicacaoPremios = indicacaoPremios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public List<String> getDiretor() {
        return diretor;
    }

    public void setDiretor(List<String> diretor) {
        this.diretor = diretor;
    }

    public List<String> getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(List<String> nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getIndicacaoPremios() {
        return indicacaoPremios;
    }

    public void setIndicacaoPremios(List<String> indicacaoPremios) {
        this.indicacaoPremios = indicacaoPremios;
    }
}
