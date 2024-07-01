/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.DAL;

import br.udf.ProvaA1_Aviao.DTO.AviaoDTO;
import java.util.ArrayList;
import java.util.List;

public class AviaoDAL extends ConexaoMySQL {

    public void incluirAviao(AviaoDTO aviao) throws Exception {

        abrirBD();

        SQL = "INSERT INTO aviao (aviFabricante, aviModelo) VALUES (?, ? )";

        ps = con.prepareStatement(SQL);

//Busca os valores da classe AviaoDTO
        ps.setString(1, aviao.getAviFabricante());
        ps.setString(2, aviao.getAviModelo());
        ps.execute();
        fecharBD();
    }

    public AviaoDTO selecionarAviaoPorID(Integer aviID) throws Exception {
        abrirBD();
        SQL = "SELECT * FROM aviao WHERE aviID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, aviID);
        rs = ps.executeQuery();
        AviaoDTO aviao = new AviaoDTO();
        if (rs.next()) {
            aviao.setAviID(rs.getInt("aviID"));
            aviao.setAviFabricante(rs.getString("aviFabricante"));
            aviao.setAviModelo(rs.getString("aviModelo"));
            fecharBD();
        }
        return aviao;
    }

    public List selecionarListaAviao() throws Exception {
        abrirBD();
        SQL = "SELECT * FROM aviao ORDER BY aviModelo";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaAviao = new ArrayList();
        while (rs.next()) {
            AviaoDTO aviao = new AviaoDTO();
            aviao.setAviID(rs.getInt("aviID"));
            aviao.setAviFabricante(rs.getString("aviFabricante"));
            aviao.setAviModelo(rs.getString("aviModelo"));
            listaAviao.add(aviao);
        }
        fecharBD();
        return listaAviao;
    }

    public void alterarAviao(AviaoDTO aviao) throws Exception {
        abrirBD();
        SQL = "UPDATE aviao SET aviFabricante = ?, aviModelo = ? WHERE aviID = ?";
        ps = con.prepareStatement(SQL);
        ps.setString(1, aviao.getAviFabricante());
        ps.setString(2, aviao.getAviModelo());
        ps.setLong(3, aviao.getAviID());
        ps.execute();
        fecharBD();
    }

    public void excluirAviao(Integer aviID) throws Exception {
        abrirBD();
        SQL = "DELETE FROM aviao WHERE aviID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, aviID);
        ps.execute();
        fecharBD();
    }

}
