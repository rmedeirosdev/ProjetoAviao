/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.Testes;

import br.udf.ProvaA1_Aviao.DAL.AviaoDAL;
import br.udf.ProvaA1_Aviao.DTO.AviaoDTO;


public class TesteIncluirAviao {

    public static void main(String[] args) throws Exception {
        AviaoDTO aviao = new AviaoDTO();
        aviao.setAviFabricante("EUA");
        aviao.setAviModelo("Douglas DC-3");
        AviaoDAL dal = new AviaoDAL();
        dal.incluirAviao(aviao);
        System.out.print("Aviao " + aviao.getAviModelo() + " Cadastrado com sucesso!");
    }
}
