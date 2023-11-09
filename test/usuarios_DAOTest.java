/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAO.usuarios_DAO;
import conexao.Usuarios;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author dougl
 */


public class usuarios_DAOTest {
    private usuarios_DAO usuariosDAO;
    
    @Before
    public void setUp() {
        usuariosDAO = new usuarios_DAO();
    }

    /*
    @Test
    public void testAutenticacaoUsuarios() {
        Usuarios usuario = new Usuarios();
        // Preencha os campos do usuário com valores apropriados para o teste

        ResultSet rs = usuariosDAO.autenticacaousuarios(usuario);

        // Verifique se a autenticação funcionou corretamente, por exemplo, verificando se o resultado do ResultSet é não nulo.
        assertNotNull(rs);

        // Faça mais verificações conforme necessário, como verificar se as credenciais do usuário estão corretas.
    }
    */
    
    @Test
    public void testCadastrarUsuarios() {
        Usuarios usuario = new Usuarios();
        // Preencha os campos do usuário com valores apropriados para o teste

        usuariosDAO.cadastrar_usuarios(usuario);

        // Verifique se o usuário foi cadastrado com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se o registro foi criado corretamente.
    }

    @Test
    public void testAlterarUsuarios() {
        Usuarios usuario = new Usuarios();
        // Preencha os campos do usuário com valores apropriados para o teste

        usuariosDAO.alterar_usuarios(usuario);

        // Verifique se os dados do usuário foram alterados com sucesso no banco de dados
        // Você pode consultar o banco de dados e verificar se as informações foram atualizadas corretamente.
    }

    @Test
    public void testLogarUsuarios() {
        Usuarios usuario = new Usuarios();
        // Preencha os campos do usuário com valores apropriados para o teste

        ResultSet rs = usuariosDAO.logar_usuarios(usuario);

        // Verifique se o login funcionou corretamente, por exemplo, verificando se o resultado do ResultSet é não nulo.
        assertNotNull(rs);

        // Faça mais verificações conforme necessário, como verificar se as credenciais do usuário estão corretas.
    }

    @Test
    public void testPesquisarClientes() {
        ArrayList<Usuarios> usuarios = usuariosDAO.pesquisar_Clientes();

        // Verifique se a lista de usuários (clientes) retornada não é nula e contém resultados
        assertNotNull(usuarios);
        assertFalse(usuarios.isEmpty());

        // Faça mais verificações conforme necessário, como verificar se os detalhes dos clientes estão corretos.
    }
}
