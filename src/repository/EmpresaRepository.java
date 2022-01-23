/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.EmpresaModel;


public class EmpresaRepository extends Conexao {

    public void salvar(EmpresaModel empresaModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(empresaModel);
        super.executar();
    }

    public EmpresaModel buscarPorId(Long id) {
        EmpresaModel empresaModel;
        super.inicializa();
        empresaModel = (EmpresaModel) super.getSess().get(EmpresaModel.class, id);
        super.executar();
        return empresaModel;
    }

    public List<EmpresaModel> buscarTodos() {
        List<EmpresaModel> listaDeEmpresaModel = new ArrayList<>();
        super.inicializa();
        listaDeEmpresaModel = super.getSess().createQuery("from EmpresaModel").list();
        super.executar();
        return listaDeEmpresaModel;
    }
    
    public List<EmpresaModel> buscarPorNome(String nome) {
        List<EmpresaModel> listaDeEmpresaModel = new ArrayList<>();
        super.inicializa();
        listaDeEmpresaModel = super.getSess().createQuery("from EmpresaModel where nomeFantasia like '%"+nome+"%'").list();
        super.executar();
        return listaDeEmpresaModel;
    }

    public void excluir(EmpresaModel empresaModel) {
        super.inicializa();
        super.getSess().delete(empresaModel);
        super.executar();
    }

    public void atualizar(EmpresaModel empresaModel) {
        super.inicializa();
        super.getSess().update(empresaModel);
        super.executar();

    }
}
