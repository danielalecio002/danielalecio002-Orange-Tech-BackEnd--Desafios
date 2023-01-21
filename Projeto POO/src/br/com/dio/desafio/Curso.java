package br.com.dio.desafio;

public class Curso extends Conteudo{
    private int cargaHoraria;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo =' " + getTitulo() +
                "' descrição = '" + getDescricao() +
                "' cargaHoraria = " + cargaHoraria +
                '}';
    }
}
