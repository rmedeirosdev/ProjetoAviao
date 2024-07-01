/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.Testes;

import br.udf.ProvaA1_Aviao.DAL.AviaoDAL;

/**
 *
 * @author rapha
 */
public class TesteExcluirAviao {

    public static void main(String[] args) throws Exception {
        AviaoDAL dal = new AviaoDAL();
        dal.excluirAviao(2);
        System.out.print("Avião Excluído com sucesso!");
    }
}
