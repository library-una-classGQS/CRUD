/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import conexao.Funcionarios;
import conexao.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class usuarios_DAO {
      Connection conn;
    PreparedStatement pstm;
        ResultSet rs;
    ArrayList<Usuarios> lista = new ArrayList<>();

    public ResultSet autenticacaousuarios(Usuarios objusuarios) {
        conn = new conexao_DAO().conectaBD();

        try {
            String sql = "select * from usuarios where cpf_usuario = ?, nome_usuario  = ?, nascimento_usuario  = ?, telefone_usuario  = ?, email_usuario  = ?, and senha_usuario  =?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarios.getCpf());
            pstm.setString(2, objusuarios.getNome());
            pstm.setString(3, objusuarios.getNascimento());
            pstm.setString(4, objusuarios.getTelefone());
            pstm.setString(5, objusuarios.getEmail());
            pstm.setString(6,objusuarios.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionario_DAO: " + erro);
        }
        return null;
    }

    public void cadastrar_usuarios(Usuarios objusuarios) {

        String sql = "insert into usuarios (cpf_usuario, nome_usuario, nascimento_usuario, telefone_usuario, email_usuario, senha_usuario) values(?,?,?,?,?,?)";
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            pstm.setString(1, objusuarios.getCpf());
            pstm.setString(2, objusuarios.getNome());
            pstm.setString(3, objusuarios.getNascimento());
            pstm.setString(4, objusuarios.getTelefone());
            pstm.setString(5, objusuarios.getEmail());
            pstm.setString(6,objusuarios.getSenha());
             
             pstm.execute();
             pstm.close();
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "usuarios_DAO: " + erro);
        }
    }
    
     public void alterar_usuarios(Usuarios objusuarios){
        
        String sql = "update usuarios set nome_usuario = ?, nascimento_usuario =?, telefone_usuario = ?, email_usuario = ?, senha_usuario = ? where cpf_usuario = ?";
        
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            
            
            pstm.setString(1, objusuarios.getNome());
            pstm.setString(2, objusuarios.getNascimento());
            pstm.setString(3, objusuarios.getTelefone());
            pstm.setString(4, objusuarios.getEmail());
            pstm.setString(5, objusuarios.getSenha());
            pstm.setString(6, objusuarios.getCpf());
            

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "usuarios_DAO alterar: " + erro);
        }
        
    }
     
     public ResultSet logar_usuarios(Usuarios objusuarios) {
        conn = new conexao_DAO().conectaBD();

        try {
            String sql = "select * from usuarios where cpf_usuario = ? and senha_usuario =?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarios.getCpf());
            pstm.setString(2, objusuarios.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuario_DAO: " + erro);
        }
        return null;
    }
     
       public ArrayList<Usuarios> pesquisar_Clientes() {

        String sql = "select * from usuarios";
        conn = new conexao_DAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Usuarios objUsuarios = new Usuarios();
                objUsuarios.setCpf(rs.getString("cpf_usuario"));
                objUsuarios.setNome(rs.getString("nome_usuario"));
                objUsuarios.setNascimento(rs.getString("nascimento_usuario"));
                objUsuarios.setTelefone(rs.getString("telefone_usuario"));
                objUsuarios.setEmail(rs.getString("email_usuario"));

                lista.add(objUsuarios);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO pesquisar: " + erro);
        }
        return lista;
    }

}
