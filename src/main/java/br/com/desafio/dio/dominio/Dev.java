package br.com.desafio.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev() {
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverNoBootcamp(Boocamp boocamp) {
        this.conteudosInscritos.addAll(boocamp.getConteudos());
        boocamp.getDevsInscritos().add(this);
    }

    public void progredir(){
       Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
       if (conteudo.isPresent()) {
           this.conteudosConcluidos.add(conteudo.get());
           this.conteudosInscritos.remove(conteudo.get());
       } else {
           System.err.println("Você não está inscrito em nenhum conteúdo!");
       }

    }

    public double calcXP(){
       return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcXP()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}