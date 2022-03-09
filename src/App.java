import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso cursoJs = new Curso("Curso JavaScript", "Descrição curso JavaScript", 4);

        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Descicao mentoria Java", LocalDate.now());
        Mentoria mentoriaJs = new Mentoria("Mentoria de JavaScript", "Descicao mentoria JavaScript", LocalDate.now());

        Dev victor = new Dev("Victor");
        Dev joao = new Dev("João");

        Bootcamp bootcamp = new Bootcamp("Java e JavaScript", "Bootcamp Java e JavaScript", Arrays.asList(cursoJava, mentoriaJava, cursoJs, mentoriaJs));
        bootcamp.inscreverDev(victor);
        bootcamp.inscreverDev(joao);

        System.out.println("Conteudos que o " + victor.getNome() + " ta inscrito: " + victor.getConteudosInscritos());
        victor.progredir();
        System.out.println("---");
        System.out.println("Conteudos que o " + victor.getNome() + " concluiu: " + victor.getConteudosConcluidos());
        System.out.println("Conteudos que o " + victor.getNome() + " ta inscrito: " + victor.getConteudosInscritos());
        System.out.println("XP do " + victor.getNome() + ": " + victor.cacularTotalXp());

        System.out.println("------------------------");

        System.out.println("Conteudos que o " + joao.getNome() + " ta inscrito: " + joao.getConteudosInscritos());
        joao.progredir();
        joao.progredir();
        System.out.println("---");
        System.out.println("Conteudos que o " + joao.getNome() + " concluiu: " + joao.getConteudosConcluidos());
        System.out.println("Conteudos que o " + joao.getNome() + " ta inscrito: " + joao.getConteudosInscritos());
        System.out.println("XP do " + joao.getNome() + ": " + joao.cacularTotalXp());
    }
}
