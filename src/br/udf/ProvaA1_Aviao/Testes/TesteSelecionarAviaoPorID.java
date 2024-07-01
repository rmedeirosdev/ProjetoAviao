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
public class TesteSelecionarAviaoPorID {

    public static void main(String[] args) throws Exception {
        AviaoDAL dal = new AviaoDAL();
        AviaoDTO aviao = dal.selecionarAviaoPorID(1);
        System.out.println("Codigo: " + aviao.getAviID());
        System.out.println("Nome Fabricante: " + aviao.getAviFabricante());
        System.out.println("Modelo: " + aviao.getAviModelo());
    }
}
