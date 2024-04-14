/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Produtos {
 private String codigo;
 private String descricao;
 private String fornecedor;
 private String qtdestoque;
 private String valorunitario;
 
 public void setCodigo(String codigo_){codigo = codigo_ ;}
 public void setDescricao(String descricao_){descricao = descricao_;}
 public void setFornecedor(String fornecedor_){fornecedor = fornecedor_ ;}
 public void setQtdestoque(String qtdestoque_){qtdestoque = qtdestoque_ ;}
 public void setValorunitario(String valorunitario_){ valorunitario = valorunitario_ ;}
 
 public String getCodigo(){return codigo;}
 public String getDescricao(){return descricao;}
 public String getFornecedor(){return fornecedor;}
 public String getQtdestoque(){return qtdestoque;}
 public String getValorunitario(){return valorunitario;}
}
   
