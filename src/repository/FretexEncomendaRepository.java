/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.crt.FretexEncomendaModel;


public class FretexEncomendaRepository extends Conexao {

    public void salvar(FretexEncomendaModel fretexEncomendaModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(fretexEncomendaModel);
        super.executar();
    }

    public FretexEncomendaModel buscarPorId(Long id) {
        FretexEncomendaModel fretexEncomendaModel;
        super.inicializa();
        fretexEncomendaModel = (FretexEncomendaModel) super.getSess().get(FretexEncomendaModel.class, id);
        super.executar();
        return fretexEncomendaModel;
    }

    public List<FretexEncomendaModel> buscarTodos() {
        List<FretexEncomendaModel> listaDeFretexEncomenda = new ArrayList<>();
        super.inicializa();
        listaDeFretexEncomenda = super.getSess().createQuery("from FretexEncomendaModel where finalizada = false").list();
        super.executar();
        return listaDeFretexEncomenda;
    }
    
    public List<FretexEncomendaModel> buscarPorNome(String nome) {
        List<FretexEncomendaModel> listaDeFretexEncomenda = new ArrayList<>();
        super.inicializa();
        listaDeFretexEncomenda = super.getSess().createQuery("from FretexEncomendaModel where nome like '%"+nome+"%'").list();
        super.executar();
        return listaDeFretexEncomenda;
    }
    
     public List<FretexEncomendaModel> buscarPorFrete(Long idFrete) {
        List<FretexEncomendaModel> listaDeFretexEncomenda = new ArrayList<>();
        super.inicializa();
        listaDeFretexEncomenda = super.getSess().createQuery("from FretexEncomendaModel where idFrete = "+idFrete+" and finalizada = false").list();
        super.executar();
        return listaDeFretexEncomenda;
    }

    public void excluir(FretexEncomendaModel fretexEncomendaModel) {
        super.inicializa();
        super.getSess().delete(fretexEncomendaModel);
        super.executar();
    }

    public void atualizar(FretexEncomendaModel fretexEncomendaModel) {
        super.inicializa();
        super.getSess().update(fretexEncomendaModel);
        super.executar();

    }
}
