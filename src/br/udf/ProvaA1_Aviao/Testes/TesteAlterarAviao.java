/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.Testes;

import br.udf.ProvaA1_Aviao.DAL.AviaoDAL;
import br.udf.ProvaA1_Aviao.DTO.AviaoDTO;



/**
 *
 * @author rapha
 */
public class TesteAlterarAviao {

    public static void main(String[] args) throws Exception {
        AviaoDAL dal = new AviaoDAL();
        AviaoDTO aviao = new AviaoDTO();
        aviao.setAviID(6);
        aviao.setAviFabricante("Space X");
        aviao.setAviModelo("Junkers F13");
   
        System.out.print("Avião " + aviao.getAviModelo() + " Alterado com sucesso!");
    }
}
