package br.com.desafio.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Boocamp {

    private String nome;
    private final LocalDate dataInicio ;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;

    public Boocamp() {
        this.dataInicio = LocalDate.now();
        this.dataFinal = dataInicio.plusDays(45);
        this.devsInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boocamp boocamp = (Boocamp) o;
        return Objects.equals(nome, boocamp.nome) && Objects.equals(dataInicio, boocamp.dataInicio) && Objects.equals(dataFinal, boocamp.dataFinal) && Objects.equals(devsInscritos, boocamp.devsInscritos) && Objects.equals(conteudos, boocamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataInicio, dataFinal, devsInscritos, conteudos);
    }
}
