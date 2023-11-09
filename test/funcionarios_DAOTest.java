/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAO.funcionarios_DAO;
import conexao.Funcionarios;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author dougl
 */


public class funcionarios_DAOTest {
    private funcionarios_DAO funcionariosDAO;
    
    @Before
    public void setUp() {
        funcionariosDAO = new funcionarios_DAO();
    }

    @Test
    public void testAutenticacaoFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        // Preencha os campos do funcionário com valores apropriados para o teste

        ResultSet rs = funcionariosDAO.autenticacaoFuncionarios(funcionario);

        // Verifique se a autenticação funcionou corretamente, por exemplo, verificando se o resultado do ResultSet é não nulo.
        assertNotNull(rs);

        // Faça mais verificações conforme necessário, como verificar se as credenciais do funcionário estão corretas.
    }

    @Test
    public void testCadastrarFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        // Preencha os campos do funcionário com valores apropriados para o teste

        funcionariosDAO.cadastrar_funcionarios(funcionario);

        // Verifique se o funcionário foi cadastrado com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi criado corretamente.
    }

    @Test
    public void testPesquisarFuncionarios() {
        ArrayList<Funcionarios> funcionarios = funcionariosDAO.pesquisar_Funcionarios();

        // Verifique se a lista de funcionários retornada não é nula e contém resultados
        assertNotNull(funcionarios);
        assertFalse(funcionarios.isEmpty());

        // Faça mais verificações conforme necessário, por exemplo, verificando se os detalhes dos funcionários estão corretos.
    }

    @Test
    public void testAlterarFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        // Preencha os campos do funcionário com valores apropriados para o teste

        funcionariosDAO.alterar_funcionarios(funcionario);

        // Verifique se os dados do funcionário foram alterados com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se as informações foram atualizadas corretamente.
    }

    @Test
    public void testDeletarFuncionarios() {
        Funcionarios funcionario = new Funcionarios();
        // Preencha os campos do funcionário com valores apropriados para o teste

        funcionariosDAO.deletar_funcionarios(funcionario);

        // Verifique se o funcionário foi removido com sucesso do banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi removido corretamente.
    }
}
