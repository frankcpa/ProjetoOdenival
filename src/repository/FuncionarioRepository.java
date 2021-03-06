/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.FuncionarioModel;


public class FuncionarioRepository extends Conexao {
    private CargoRepository cargoRepository = null;

    public void salvar(FuncionarioModel funcionarioModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(funcionarioModel);
        super.executar();
    }

    public FuncionarioModel buscarPorId(Long id) {
        FuncionarioModel funcionarioModel;
        super.inicializa();
        funcionarioModel = (FuncionarioModel) super.getSess().get(FuncionarioModel.class, id);
        super.executar();
        return funcionarioModel;
    }

    public List<FuncionarioModel> buscarTodos() {
        List<FuncionarioModel> listaDeFuncionarioModel = new ArrayList<>();
        super.inicializa();
        listaDeFuncionarioModel = super.getSess().createQuery("from FuncionarioModel").list();
        super.executar();
        return listaDeFuncionarioModel;
    }
    
    public List<FuncionarioModel> buscarTodosMotorista() {
        if (this.cargoRepository == null) {
            this.cargoRepository = new CargoRepository();
        }
        
        List<FuncionarioModel> listaDeFuncionarioModel = new ArrayList<>();
        long idMotorista = this.cargoRepository.BuscaCargoId("Motorista");
        cargoRepository.fecharConexao();
        
        super.inicializa();
        listaDeFuncionarioModel = super.getSess().createQuery("from FuncionarioModel where idCargo = " + idMotorista).list();
        super.executar();
        return listaDeFuncionarioModel;
    }
    
    public List<FuncionarioModel> buscarPorNome(String nome) {
        List<FuncionarioModel> listaDefuncionarioModel = new ArrayList<>();
        super.inicializa();
        listaDefuncionarioModel = super.getSess().createQuery("from FuncionarioModel where LOWER(nome) like '%"+nome.toLowerCase()+"%'").list();
        super.executar();
        return listaDefuncionarioModel;
    }

    public void excluir(FuncionarioModel funcionarioModel) {
        super.inicializa();
        super.getSess().delete(funcionarioModel);
        super.executar();
    }

    public void atualizar(FuncionarioModel funcionarioModel) {
        super.inicializa();
        super.getSess().update(funcionarioModel);
        super.executar();

    }
}
