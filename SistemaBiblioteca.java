import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}

class Biblioteca {
    private ArrayList<Livro> colecao;

    public Biblioteca() {
        colecao = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        colecao.add(livro);
    }

    public void mostrarLivros() {
        if (colecao.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : colecao) {
                System.out.println("Título: " + livro.getTitulo() +
                                   ", Autor: " + livro.getAutor() +
                                   ", Ano de Publicação: " + livro.getAnoPublicacao());
            }
        }
    }
}

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        minhaBiblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        minhaBiblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949));
        minhaBiblioteca.adicionarLivro(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));

        minhaBiblioteca.mostrarLivros();

        System.out.println("Adicionar novo livro à biblioteca:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();
        minhaBiblioteca.adicionarLivro(new Livro(titulo, autor, anoPublicacao));

        minhaBiblioteca.mostrarLivros();

        scanner.close();
    }
}
