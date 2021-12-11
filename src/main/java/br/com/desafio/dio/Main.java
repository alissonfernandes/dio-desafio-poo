package br.com.desafio.dio;

import br.com.desafio.dio.dominio.Boocamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java POO");
        curso.setDescricao("Curso java com POO");
        curso.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Prática com Java POO");
        mentoria.setDescricao("Aprendendo na prática o Java POO");
        mentoria.setData(LocalDate.now());



        Boocamp boocamp = new Boocamp();
        boocamp.setNome("Bootcamp Java Deveper");
        boocamp.setDescricao("Aprenda do básico ao avançado com a linguagem Java");
        boocamp.getConteudos().add(curso);
        boocamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");
        dev1.inscreverNoBootcamp(boocamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getNome());
        System.out.println("\tInscrito: " + dev1.getConteudosInscritos());
        System.out.println("\tConcluido: " + dev1.getConteudosConcluidos());
        System.out.println("\tXP: " + dev1.calcXP());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverNoBootcamp(boocamp);
        dev2.progredir();
        System.out.println(dev2.getNome());
        System.out.println("\tIncrito: " + dev2.getConteudosInscritos());
        System.out.println("\tConcluido: " + dev2.getConteudosConcluidos());
        System.out.println("\tXP: " + dev2.calcXP());
    }
}