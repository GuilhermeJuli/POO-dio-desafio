package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

   private double cargaHoraria;
    @Override
    public double cacularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public Curso() {
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
