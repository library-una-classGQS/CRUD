/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import conexao.Funcionarios;
import conexao.Livros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class funcionarios_DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Funcionarios> lista = new ArrayList<>();

    public ResultSet autenticacaoFuncionarios(Funcionarios objfuncionarios) {
        conn = new conexao_DAO().conectaBD();

        try {
            String sql = "select * from funcionarios where cpf_funcionario = ? and senha_funcionario =?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionarios.getCpf());
            pstm.setString(2, objfuncionarios.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "funcionario_DAO: " + erro);
        }
        return null;
    }

    public void cadastrar_funcionarios(Funcionarios objfuncionarios) {

        String sql = "insert into funcionarios (cpf_funcionario, nome_funcionario, senha_funcionario) values(?,?,?)";
        conn = new conexao_DAO().conectaBD();

        try {
             pstm = conn.prepareCall(sql);
             pstm.setString(1, objfuncionarios.getCpf());
             pstm.setString(2, objfuncionarios.getNome());
             pstm.setString(3, objfuncionarios.getSenha());
             
             pstm.execute();
             pstm.close();
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "funcionarios_DAO: " + erro);
        }
    }
    
     public ArrayList<Funcionarios> pesquisar_Funcionarios() {

        String sql = "select * from funcionarios";
        conn = new conexao_DAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionarios objfuncionarios = new Funcionarios();
                objfuncionarios.setCpf(rs.getString("cpf_funcionario"));
                objfuncionarios.setNome(rs.getString("nome_funcionario"));

                lista.add(objfuncionarios);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO pesquisar: " + erro);
        }
        return lista;
    }
    
    
    public void alterar_funcionarios(Funcionarios objfuncionarios){
        
        String sql = "update funcionarios set nome_funcionario = ?, senha_funcionario = ? where cpf_funcionario = ?";
        
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            
            
            pstm.setString(1, objfuncionarios.getNome());
            pstm.setString(2, objfuncionarios.getSenha());
            pstm.setString(3, objfuncionarios.getCpf());
            

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO alterar: " + erro);
        }
        
    }
    
    public void deletar_funcionarios(Funcionarios objfuncionarios){
        
        String sql = "DELETE FROM funcionarios WHERE cpf+funcionario= ?";
        
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            
            
            pstm.setString(1, objfuncionarios.getCpf());
            

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO deletar: " + erro);
        }
        
    }
    
    
}
