package br.com.dio.desafio.dominio;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;

    @Getter
    private Set<Conteudo> conteudos;

    public Bootcamp() {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        this.devsInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public Bootcamp(String nome, String descricao, List<Conteudo> conteudos) {
        this();
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos.addAll(conteudos);
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }
}
