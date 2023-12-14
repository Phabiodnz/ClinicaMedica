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
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Phabi
 */
public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario funcionario) throws ExceptionDAO{
        String sql = "INSERT INTO funcionario (idFuncionario,nome,rg,cpf,endereco,numero,bairro,cidade,estado,telefone,dataNascimento,sexo) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
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
            pStatement.setString(11, funcionario.getSexo());
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
    
    public ArrayList<Funcionario> listarFuncionarios(String nome) throws ExceptionDAO{
        String sql = ("SELECT * FROM funcionario WHERE nome LIKE '%"+ nome +"%' ORDER BY nome");
        PreparedStatement pStatement = null;
        Connection connection = null;
        ArrayList<Funcionario> funcionarios = null;
        
        try{
            connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs!=null){
                funcionarios = new ArrayList<Funcionario>();
                while (rs.next()){
                    Funcionario funcionario = new Funcionario();
                    funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                    funcionario.setNomeCompleto(rs.getString("Nome"));
                    funcionario.setRG(rs.getString("RG"));
                    funcionario.setCPF(rs.getString("CPF"));
                    funcionario.setEndereco(rs.getString("Endereco"));
                    funcionario.setNumero("Numero");
                    funcionario.setBairro(rs.getString("Bairro"));
                    funcionario.setCidade(rs.getString("Cidade"));
                    funcionario.setEstado(rs.getString("Estado"));
                    funcionario.setTelefone(rs.getString("Telefone"));
                    funcionario.setDataNascimento(rs.getDate("dataNascimento"));
                    funcionario.setSexo(rs.getString("Sexo"));
                    funcionarios.add(funcionario);      
                }
            }
            
        } catch (SQLException e1){
            throw new ExceptionDAO("Erro ao Consultar Funcionário" + e1);
        } finally{
            try{
                if(pStatement != null){pStatement.close();}
            } catch (SQLException e2){
                throw new ExceptionDAO("Erro ao Fechar o Statement" + e2);
            }
            try{
                if(connection != null){connection.close();}
            } catch (SQLException e3){
                throw new ExceptionDAO("Erro ao Fechar a Conexão" + e3);
            }
        }
        return funcionarios;
    }
    
    public void alterarFuncionario(Funcionario funcionario) throws ExceptionDAO{
        String sql = "UPDATE funcionario SET nome = ?, rg = ?, cpf = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, telefone = ?, dataNascimento = ? WHERE idFuncionario = ?;";
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
            pStatement.setInt(11, funcionario.getIdFuncionario());
            pStatement.execute();
        }catch(SQLException e1){
            throw new ExceptionDAO("Erro ao alterar" + e1);
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
    
    public void apagarFuncionario(Funcionario funcionario) throws ExceptionDAO{
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionDB().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1,funcionario.getIdFuncionario());
            pStatement.execute();
        }catch(SQLException e1){
            throw new ExceptionDAO("Erro ao apagar" + e1);
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
