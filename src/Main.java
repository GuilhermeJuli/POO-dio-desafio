import br.com.dio.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BooCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);



        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Gulherme");
        devGuilherme.inscreverBooCamp(bootCamp);
        System.out.println("Conteudos Inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("--");
        System.out.println("Conteudos Concluidos Guilherme" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Guilherme" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP" + devGuilherme.calcularTotalXP());


        System.out.println("--------------");


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBooCamp(bootCamp);
        System.out.println("Conteudos Inscritos Lucas" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Conluidos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("XP" + devLucas.calcularTotalXP());



    }
}