/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAO.livros_DAO;
import conexao.Livros;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author dougl
 */


public class livros_DAOTest {
    private livros_DAO livrosDAO;
    
    @Before
    public void setUp() {
        livrosDAO = new livros_DAO();
    }

    @Test
    public void testCadastrarLivros() {
        Livros livro = new Livros();
        // Preencha os campos do livro com valores apropriados para o teste

        livrosDAO.cadastrar_livros(livro);

        // Verifique se o livro foi cadastrado com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi criado corretamente.
    }

    @Test
    public void testPesquisarLivros() {
        ArrayList<Livros> livros = livrosDAO.pesquisar_livro();

        // Verifique se a lista de livros retornada não é nula e contém resultados
        assertNotNull(livros);
        assertFalse(livros.isEmpty());

        // Faça mais verificações conforme necessário, por exemplo, verificando se os detalhes dos livros estão corretos.
    }

    /*
    @Test
    public void testAlterarLivros() {
        Livros livro = new Livros();
        // Preencha os campos do livro com valores apropriados para o teste

        livrosDAO.alterar_livros(livro);

        // Verifique se os dados do livro foram alterados com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se as informações foram atualizadas corretamente.
    }
    */
    
    @Test
    public void testExecutarConsulta() {
        String sql = "SELECT * FROM livros WHERE genero = 'Ficção'";
        ResultSet resultSet = livrosDAO.executarconsulta(sql);

        // Verifique se o resultado da consulta não é nulo
        assertNotNull(resultSet);

        // Faça mais verificações, como verificar se os resultados correspondem aos critérios da consulta.
    }
}
