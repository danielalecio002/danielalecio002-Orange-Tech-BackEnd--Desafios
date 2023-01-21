import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("java");
        c1.setDescricao("Aprendendo java do zero!");
        c1.setCargaHoraria(4);

        Curso c2 = new Curso();
        c2.setTitulo("Spring");
        c2.setDescricao("Aprendendo spring do zero!");
        c2.setCargaHoraria(4);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Emergindo no java");
        m1.setDescricao("Uma visão geral da tec java");
        m1.setData(LocalDate.now());

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Orange tech");
        b1.setDescricao("Bootcamp backend dio e inter");
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);
        b1.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Daniel");
        dev1.inscreverBootcamp(b1);
        System.out.println("Conteudos inscritos Daniel" + dev1.getConteudosIncritos());
        dev1.progredir();


        Dev dev2 = new Dev();
        dev2.setNome("joao");
        dev2.inscreverBootcamp(b1);
        System.out.println("Conteudos inscritos joao" + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Conteudos inscritos Daniel" + dev1.getConteudosIncritos());
        System.out.println("Conteudos concluidos Daniel" + dev1.getConteudosConcluidos());
        System.out.println("Xp Daniel: " + dev1.calcularTotalXp());

        System.out.println("Conteudos inscritos joao" + dev2.getConteudosIncritos());
        System.out.println("Conteudos concluidos joao" + dev2.getConteudosConcluidos());
        System.out.println("Xp Joao: " + dev2.calcularTotalXp());
    }
}
