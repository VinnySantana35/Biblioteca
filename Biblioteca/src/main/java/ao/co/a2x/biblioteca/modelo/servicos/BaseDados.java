/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.co.a2x.biblioteca.modelo.servicos;

import ao.co.a2x.biblioteca.modelo.Autor;
import ao.co.a2x.biblioteca.modelo.Editora;
import ao.co.a2x.biblioteca.modelo.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinny
 */
public class BaseDados {

    private List<Livro> livros;
    private List<Autor> autores;

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    private List<Editora> editoras;

    public BaseDados() {

        autores = new ArrayList<>();
        livros = new ArrayList<>();
        editoras = new ArrayList<>();
    }

    public boolean criarAutor(Autor autor) {
        if (autor.getId() == 0) {
            autor.setId(autores.size() + 1);
        }
        return autores.add(autor);
    }

    public Autor buscarAutor(String nome) {
        for (Autor autor : autores) {
            if (autor.getNome().equalsIgnoreCase(nome)) {
                return autor;
            }
        }
        return null;
    }

    public Autor buscarAutorId(int id) {
        for (Autor autor : autores) {
            if (autor.getId() == id) {
                return autor;
            }
        }
        return null;
    }

    public boolean removeAutor(Autor autor) {
        if (autores.contains(autor)) {
            return autores.remove(autor);
        }

        return false;
    }

    public Autor editarAutor(Autor autor) {
        if (autores.contains(autor)) {
            removeAutor(autor);
            autores.add(autor);
        }

        return autor;
    }

    public void popularAutores() {

        Autor autor = new Autor();
        autor.setId(1);
        autor.setNome("Hideo Kojima");
        autor.setGenero(true);
        autores.add(autor);

        autor = new Autor();
        autor.setId(2);
        autor.setNome("Sakura");
        autor.setGenero(false);
        autores.add(autor);

        autor = new Autor();
        autor.setId(3);
        autor.setNome("Itto Ogami");
        autor.setGenero(true);
        autores.add(autor);

    }

    public void popularEditoras() {

        Editora editora = new Editora();

        editora.setId(1);
        editora.setNome("Suma");
        editoras.add(editora);

        editora = new Editora();
        editora.setId(2);
        editora.setNome("Aleph");
        editoras.add(editora);

        editora = new Editora();
        editora.setId(3);
        editora.setNome("Darkside Books");
        editoras.add(editora);
    }

    public List<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(List<Editora> editoras) {
        this.editoras = editoras;
    }

    public boolean criarEditora(Editora editora) {
        if (editora.getId() == 0) {
            editora.setId(editoras.size() + 1);
        }
        return editoras.add(editora);
    }

    public Editora buscarEditora(String nome) {
        for (Editora editora : editoras) {
            if (editora.getNome().equalsIgnoreCase(nome)) {
                return editora;
            }
        }
        return null;
    }

    public Editora buscarEditoraId(int id) {
        for (Editora editora : editoras) {
            if (editora.getId() == id) {
                return editora;
            }
        }
        return null;
    }

    public boolean removeEditora(Editora editora) {
        if (editoras.contains(editora)) {
            return editoras.remove(editora);
        }

        return false;
    }

    public Editora editarEditora(Editora editora) {
        if (editoras.contains(editora)) {
            removeEditora(editora);
            editoras.add(editora);
        }

        return editora;
    }
}
