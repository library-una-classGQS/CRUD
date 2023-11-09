/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bblioteca;

import DAO.funcionarios_DAO;
import DAO.livros_DAO;
import conexao.Funcionarios;
import conexao.Livros;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author will
 */
public class frm_livros extends javax.swing.JFrame {

    /**
     * Creates new form frm_livros
     */
    public frm_livros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo_livros = new javax.swing.JLabel();
        lbl_livro = new javax.swing.JLabel();
        txt_livro = new javax.swing.JTextField();
        lbl_autor = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        lbl_editora = new javax.swing.JLabel();
        txt_editora = new javax.swing.JTextField();
        lbl_publicacao = new javax.swing.JLabel();
        txt_publicacao = new javax.swing.JTextField();
        lbl_endereco = new javax.swing.JLabel();
        txt_endereco_Livros = new javax.swing.JTextField();
        lbl_genero = new javax.swing.JLabel();
        cb_genero = new javax.swing.JComboBox<>();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_paginas = new javax.swing.JLabel();
        txt_qtdPaginas = new javax.swing.JTextField();
        lbl_classificacao = new javax.swing.JLabel();
        cb_classificacao = new javax.swing.JComboBox<>();
        lbl_danificado = new javax.swing.JLabel();
        cb_danificado = new javax.swing.JComboBox<>();
        btn_salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        lbl_emprestado = new javax.swing.JLabel();
        cb_emprestado = new javax.swing.JComboBox<>();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().setLayout(null);

        lbl_titulo_livros.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_titulo_livros.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo_livros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo_livros.setText("Livros");
        lbl_titulo_livros.setAlignmentX(0.5F);
        lbl_titulo_livros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_titulo_livros);
        lbl_titulo_livros.setBounds(0, 0, 750, 28);

        lbl_livro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_livro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_livro.setText("Livro:");
        getContentPane().add(lbl_livro);
        lbl_livro.setBounds(6, 116, 60, 25);
        getContentPane().add(txt_livro);
        txt_livro.setBounds(117, 116, 620, 29);

        lbl_autor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_autor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_autor.setText("Autor:");
        getContentPane().add(lbl_autor);
        lbl_autor.setBounds(6, 167, 60, 25);
        getContentPane().add(txt_autor);
        txt_autor.setBounds(117, 163, 620, 29);

        lbl_editora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_editora.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editora.setText("Editora:");
        getContentPane().add(lbl_editora);
        lbl_editora.setBounds(6, 217, 70, 25);
        getContentPane().add(txt_editora);
        txt_editora.setBounds(117, 213, 620, 29);

        lbl_publicacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_publicacao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_publicacao.setText("Publicação:");
        getContentPane().add(lbl_publicacao);
        lbl_publicacao.setBounds(6, 264, 100, 25);
        getContentPane().add(txt_publicacao);
        txt_publicacao.setBounds(117, 260, 620, 29);

        lbl_endereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_endereco.setForeground(new java.awt.Color(255, 255, 255));
        lbl_endereco.setText("Endereço:");
        getContentPane().add(lbl_endereco);
        lbl_endereco.setBounds(6, 311, 77, 25);
        getContentPane().add(txt_endereco_Livros);
        txt_endereco_Livros.setBounds(117, 307, 620, 29);

        lbl_genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_genero.setForeground(new java.awt.Color(255, 255, 255));
        lbl_genero.setText("Genero:");
        getContentPane().add(lbl_genero);
        lbl_genero.setBounds(230, 70, 83, 25);

        cb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Infantil", "Romance", "Terror", "Poesia", "Fantasia", "Suspense", "Ficção científica", "Ficção literária" }));
        cb_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_generoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_genero);
        cb_genero.setBounds(320, 69, 133, 29);

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("ID:");
        getContentPane().add(lbl_id);
        lbl_id.setBounds(6, 70, 43, 25);
        getContentPane().add(txt_id);
        txt_id.setBounds(61, 69, 133, 29);

        lbl_paginas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_paginas.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paginas.setText("Paginas:");
        getContentPane().add(lbl_paginas);
        lbl_paginas.setBounds(502, 73, 80, 25);
        getContentPane().add(txt_qtdPaginas);
        txt_qtdPaginas.setBounds(600, 69, 133, 29);

        lbl_classificacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_classificacao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_classificacao.setText("Classificação:");
        getContentPane().add(lbl_classificacao);
        lbl_classificacao.setBounds(10, 360, 110, 25);

        cb_classificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "12 Anos", "14 Anos", "16 Anos", "18 +" }));
        getContentPane().add(cb_classificacao);
        cb_classificacao.setBounds(120, 360, 133, 29);

        lbl_danificado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_danificado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_danificado.setText("Danificado:");
        getContentPane().add(lbl_danificado);
        lbl_danificado.setBounds(260, 360, 100, 25);

        cb_danificado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        getContentPane().add(cb_danificado);
        cb_danificado.setBounds(360, 360, 133, 29);

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar);
        btn_salvar.setBounds(60, 460, 90, 29);

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar);
        btn_editar.setBounds(170, 460, 90, 29);

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir);
        btn_excluir.setBounds(480, 460, 90, 29);

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(630, 460, 90, 29);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar);
        btn_buscar.setBounds(330, 460, 90, 29);

        lbl_emprestado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_emprestado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emprestado.setText("Emprestado:");
        getContentPane().add(lbl_emprestado);
        lbl_emprestado.setBounds(521, 358, 100, 25);

        cb_emprestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        getContentPane().add(cb_emprestado);
        cb_emprestado.setBounds(640, 360, 90, 29);

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem do WhatsApp de 2023-09-11 à(s) 20.19.25.jpg"))); // NOI18N
        getContentPane().add(lbl_fundo);
        lbl_fundo.setBounds(0, -20, 800, 780);

        setSize(new java.awt.Dimension(750, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_generoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        inserir_livros();
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        
        frm_menu objfrm_menu = new frm_menu();
                objfrm_menu.setVisible(true);
                
                dispose();
                
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        
        Alterar_livro();
        
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        
        buscar_item();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_excluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_livros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cb_classificacao;
    private javax.swing.JComboBox<String> cb_danificado;
    private javax.swing.JComboBox<String> cb_emprestado;
    private javax.swing.JComboBox<String> cb_genero;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_classificacao;
    private javax.swing.JLabel lbl_danificado;
    private javax.swing.JLabel lbl_editora;
    private javax.swing.JLabel lbl_emprestado;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_livro;
    private javax.swing.JLabel lbl_paginas;
    private javax.swing.JLabel lbl_publicacao;
    private javax.swing.JLabel lbl_titulo_livros;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_editora;
    private javax.swing.JTextField txt_endereco_Livros;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_livro;
    private javax.swing.JTextField txt_publicacao;
    private javax.swing.JTextField txt_qtdPaginas;
    // End of variables declaration//GEN-END:variables



 private int inserir_livros(){
       
       String livro, autor, editora, publicacao, endereco, genero, paginas, classificacao, danificado, emprestado;
       
       
       livro = txt_livro.getText();
       autor = txt_autor.getText();
       editora = txt_editora.getText();
       publicacao = txt_publicacao.getText();
       endereco = txt_endereco_Livros.getText();
       genero = (String) cb_genero.getSelectedItem();
       paginas = txt_qtdPaginas.getText();
       classificacao = (String) cb_classificacao.getSelectedItem();
       danificado = (String) cb_danificado.getSelectedItem();
       emprestado = (String) cb_emprestado.getSelectedItem();
       
       Livros objlivros = new Livros();
       objlivros.setNome(livro);
       objlivros.setAutor(autor);
       objlivros.setEditora(editora);
       objlivros.setPublicacao(publicacao);
       objlivros.setEndereco(endereco);
       objlivros.setGereno(genero);
       objlivros.setPaginas(paginas);
       objlivros.setClassificacao(classificacao);
       objlivros.setDanificado(danificado);
       objlivros.setEmprestado(emprestado);
       
       livros_DAO objlivros_dao = new livros_DAO();
       objlivros_dao.cadastrar_livros(objlivros);
       return 0;
   }
 
 

    private void Alterar_livro(){
            int id_livro;
            String nome_livro, autor, editora, publicacao, genero, paginas, classificacao, danificado, endereco, emprestado;
            
         id_livro = Integer.parseInt(txt_id.getText());
         nome_livro = txt_livro.getText();
         endereco = txt_endereco_Livros.getText();
         autor = txt_autor.getText();
         editora = txt_editora.getText();
         publicacao = txt_publicacao.getText();
         genero = (String) cb_genero.getSelectedItem();
         paginas = txt_qtdPaginas.getText();
         classificacao = (String) cb_classificacao.getSelectedItem();
         danificado = (String) cb_danificado.getSelectedItem();
         emprestado = (String) cb_emprestado.getSelectedItem();
         
         Livros objlivros = new Livros();
         
         objlivros.setId(id_livro);
         objlivros.setNome(nome_livro);
         objlivros.setAutor(autor);
         objlivros.setEditora(editora);
         objlivros.setPublicacao(publicacao);
         objlivros.setGereno(genero);
         objlivros.setPaginas(paginas);
         objlivros.setClassificacao(classificacao);
         objlivros.setDanificado(danificado);
         objlivros.setEndereco(endereco);
         objlivros.setEmprestado(emprestado);
         
         livros_DAO objlivros_dao = new livros_DAO();
         objlivros_dao.alterar_livros(objlivros);
         
        }
    
    private void buscar_item(){
    
    String sql = " select * from livros where id = " + txt_id.getText();
        try
        {
            livros_DAO objlivros_dao = new livros_DAO();
            ResultSet rs = objlivros_dao.executarconsulta(sql);
            while (rs.next())
            {
                txt_id.setText("" + rs.getInt("id"));
                txt_livro.setText("" + rs.getString("nome"));
                txt_autor.setText("" + rs.getString("autor"));
                txt_editora.setText("" + rs.getString("editora"));
                txt_publicacao.setText("" + rs.getString("publicacao"));
                cb_genero.setSelectedItem("" + rs.getString("genero"));
                txt_qtdPaginas.setText("" + rs.getString("paginas"));
                cb_classificacao.setSelectedItem("" + rs.getString("classificacao"));
                cb_danificado.setSelectedItem("" + rs.getString("danificado"));
                txt_endereco_Livros.setText("" + rs.getString("endereco"));
                cb_emprestado.setSelectedItem("" + rs.getString("emprestado"));

            }
        }
        catch (Exception erro)
        {
            System.out.println("Problema na busca");
        }

       

    }
 

}