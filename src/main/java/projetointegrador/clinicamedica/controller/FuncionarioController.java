/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointegrador.clinicamedica.controller;
import java.text.ParseException;
import projetointegrador.clinicamedica.model.Funcionario;
import java.util.Date;
import java.text.SimpleDateFormat;
import projetointegrador.clinicamedica.daos.ExceptionDAO;

/**
 *
 * @author Phabi
 */
public class FuncionarioController {
    public boolean cadastrarFuncionario(String nomeCompleto,String RG,String CPF,String endereco,String numero,String bairro,String cidade,String estado,String telefone,String dataNascimento,String sexo) throws ParseException, ExceptionDAO{
        if(nomeCompleto != null && nomeCompleto.length() > 0 && RG != null && RG.length() > 0 && validarCPF(CPF) && endereco != null && endereco.length() > 0 
                && numero != null && numero.length() > 0 && bairro != null && bairro.length() > 0 && cidade != null && cidade.length() > 0 && estado != null && estado.length() > 0 
                && telefone != null && telefone.length() > 0 && validarDataNascimento(dataNascimento) && sexo != null && sexo.length() > 0){
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataNascimento);
            Funcionario funcionario = new Funcionario(nomeCompleto,RG,CPF,endereco,numero,bairro,cidade,estado,telefone,data,sexo);
            funcionario.cadastrarFuncionario(funcionario);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarCPF(String CPF){
        for (int i=0; i < CPF.length(); i++){
            if(!Character.isDigit(CPF.charAt(i))){
                if(!(i == 3 || i == 7 || i == 11)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean validarDataNascimento(String dataNascimento){
        for (int i=0; i < dataNascimento.length(); i++){
            if(!Character.isDigit(dataNascimento.charAt(i))){
                if(!(i == 2 || i == 5)){
                    return false;
                }
            }
        }   
        return true;
    } 
}
