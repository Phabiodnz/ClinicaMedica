/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointegrador.clinicamedica.daos;
import projetointegrador.clinicamedica.model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;

/**
 *
 * @author Phabi
 */
public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario funcionario) throws ExceptionDAO{
        String sql = "INSERT INTO funcionario (idFuncionario,nome,rg,cpf,endereco,numero,bairro,cidade,estado,telefone,dataNascimento) VALUES (NULL,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, funcionario.getNomeCompleto());
            pStatement.setString(2, funcionario.getRG());
            pStatement.setString(3, funcionario.getCPF());
            pStatement.setString(4, funcionario.getEndereco());
            pStatement.setString(5, funcionario.getNumero());
            pStatement.setString(6, funcionario.getBairro());
            pStatement.setString(7, funcionario.getCidade());
            pStatement.setString(8, funcionario.getEstado());
            pStatement.setString(9, funcionario.getTelefone());
            pStatement.setDate(10, new Date(funcionario.getDataNascimento().getTime()));
            pStatement.execute();
        }catch(SQLException e1){
            throw new ExceptionDAO("Erro ao cadastrar" + e1);
        }finally{
            try{
                if (pStatement != null) {pStatement.close();} 
            }catch(SQLException e2){
                throw new ExceptionDAO("Erro ao fechar o Statement: "+ e2);
            }
            
            try{
                if (connection != null) {connection.close();}
            }catch(SQLException e3){
                throw new ExceptionDAO("Erro ao fechar a Conexão: "+ e3);
            }
        }
    }
}
