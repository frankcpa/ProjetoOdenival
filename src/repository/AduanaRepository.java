/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.AduanaModel;


public class AduanaRepository extends Conexao {

    public void salvar(AduanaModel aduana) {
        super.inicializa();
        super.getSess().saveOrUpdate(aduana);
        super.executar();
    }

    public AduanaModel buscarPorId(Long id) {
        AduanaModel aduana;
        super.inicializa();
        aduana = (AduanaModel) super.getSess().get(AduanaModel.class, id);
        super.executar();
        return aduana;
    }

    public List<AduanaModel> buscarTodos() {
        List<AduanaModel> listaDeAduanas = new ArrayList<>();
        super.inicializa();
        listaDeAduanas = super.getSess().createQuery("from AduanaModel").list();
        super.executar();
        return listaDeAduanas;
    }
    
    public List<AduanaModel> buscarPorCodigo(String codigo) {
        List<AduanaModel> listaDeAduanas = new ArrayList<>();
        super.inicializa();
        listaDeAduanas = super.getSess().createQuery("from AduanaModel where codigo like '%"+codigo+"%'").list();
        super.executar();
        return listaDeAduanas;
    }
    
    public List<AduanaModel> buscarPorNome(String nome) {
        List<AduanaModel> listaDeAduanas = new ArrayList<>();
        super.inicializa();
        listaDeAduanas = super.getSess().createQuery("from AduanaModel where LOWER(nome) like '%"+nome.toLowerCase()+"%'").list();
        super.executar();
        return listaDeAduanas;
    }

    public void excluir(AduanaModel aduana) {
        super.inicializa();
        super.getSess().delete(aduana);
        super.executar();
    }

    public void atualizar(AduanaModel aduana) {
        super.inicializa();
        super.getSess().update(aduana);
        super.executar();

    }
}
