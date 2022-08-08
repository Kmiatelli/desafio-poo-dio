import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devKarina = new Dev();
        devKarina.setNome("Karina");
        devKarina.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Karina: " + devKarina.getConteudosInscritos());

        devKarina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Karina: " + devKarina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Karina: " + devKarina.getConteudosConcluidos());
        System.out.println("XP: " + devKarina.calcularTotal());

        System.out.println("--------------");

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Natalia: " + devNatalia.getConteudosInscritos());

        devNatalia.progredir();
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Natalia: " + devNatalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Natalia: " + devNatalia.getConteudosConcluidos());
        System.out.println("XP: " + devKarina.calcularTotal());




    }
}
