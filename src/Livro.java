public class Livro {
    String Titulo;
    String Autor;
    int Paginas;
    boolean Disponibilidade;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }

    public boolean getDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public void exibirDetalhes(){

        System.out.println(getTitulo() + getAutor() + getPaginas() + getDisponibilidade());
    }

    public void devolver(){

    }

    public void resarvar(){

    }
}
