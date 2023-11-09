/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAO.emprestimo_DAO;
import conexao.Emprestimo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
/**
 *
 * @author dougl
 */


public class emprestimo_DAOTest {
    private emprestimo_DAO emprestimoDAO;
    
    @Before
    public void setUp() {
        emprestimoDAO = new emprestimo_DAO();
    }
    
    /*
    @Test
    public void testFazerEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        // Preencha os campos do empréstimo com valores apropriados para o teste

        emprestimoDAO.fazer_emprestimo(emprestimo);

        // Verifique se o empréstimo foi registrado com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi criado corretamente.
        // Ou, se você tem um método de consulta na classe, você pode usá-lo para verificar a existência do empréstimo.
    }
    */
    
    @Test
    public void testPesquisarEmprestimo() {
        int pedido = 1; // Substitua pelo valor do pedido que deseja pesquisar

        ArrayList<Emprestimo> emprestimos = emprestimoDAO.pesquisar_emprestimo(pedido);

        // Verifique se a lista de empréstimos retornada não é nula e contém resultados
        assertNotNull(emprestimos);
        assertFalse(emprestimos.isEmpty());

        // Faça mais verificações conforme necessário, por exemplo, verificando se os detalhes do empréstimo estão corretos.
    }

    @Test
    public void testDeletarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        // Preencha os campos do empréstimo com valores apropriados para o teste

        emprestimoDAO.deletar_emprestimo(emprestimo);

        // Verifique se o empréstimo foi removido com sucesso do banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi removido corretamente.
    }
}
