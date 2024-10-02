package questaoLivro;

import java.util.Scanner;

public class Livro {
    //A classe deve ter os atributos titulo, autor e numeroDePaginas.
    //Crie métodos exibirDetalhes() e adicionarPaginas(int paginas)
    // que exibem os detalhes e adicionam páginas ao livro, respectivamente.

    private String titulo;
    private String autor;
    private Integer numeroDePaginas;

    Livro (String titulo, String autor, Integer numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public Integer getNumeroDePaginas(){
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(Integer numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Número de páginas: " + getNumeroDePaginas());
    }

    public void adicionarPaginas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas páginas você deseja adicionar ao livro?");
        Integer qtdPaginas = teclado.nextInt();
        setNumeroDePaginas(getNumeroDePaginas() + qtdPaginas);
        System.out.println(qtdPaginas + " páginas foram adicionadas ao livro: " + getTitulo());
        System.out.println("Agora o livro tem " + getNumeroDePaginas() + " páginas!");
    }
}
