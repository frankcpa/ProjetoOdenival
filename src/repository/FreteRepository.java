/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.crt.FreteModel;


public class FreteRepository extends Conexao {

    public void salvar(FreteModel frete) {
        super.inicializa();
        super.getSess().saveOrUpdate(frete);
        super.executar();
    }
    
    public FreteModel buscarPorId(Long id) {
        FreteModel frete;
        super.inicializa();
        frete = (FreteModel) super.getSess().get(FreteModel.class, id);
        super.executar();
        return frete;
    }

    public List<FreteModel> buscarTodos() {
        List<FreteModel> listaDeFretes = new ArrayList<>();
        super.inicializa();
        listaDeFretes = super.getSess().createQuery("from FreteModel where finalizada = false").list();
        super.executar();
        return listaDeFretes;
    }
    
    public List<FreteModel> buscarPorNome(String nome) {
        List<FreteModel> listaDeFretes = new ArrayList<>();
        super.inicializa();
        listaDeFretes = super.getSess().createQuery("from FreteModel where nome like '%"+nome+"%'").list();
        super.executar();
        return listaDeFretes;
    }

    public void excluir(FreteModel frete) {
        super.inicializa();
        super.getSess().delete(frete);
        super.executar();
    }

    public void atualizar(FreteModel frete) {
        super.inicializa();
        super.getSess().update(frete);
        super.executar();

    }
}