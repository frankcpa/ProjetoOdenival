/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Conexao {

    private Session sess;
    private Transaction tra;

    public Conexao() {
        try {
            this.sess = HibernateUtil.getSessionFactory().openSession();
            this.tra = sess.beginTransaction();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inicializa() {
        if (!this.sess.isOpen()) {
            this.sess = HibernateUtil.getSessionFactory().openSession();
        }
        if (!this.tra.isActive()) {
            this.tra = sess.beginTransaction();
        }
    }

    public void fecharConexao(){
        if (this.sess.isOpen()) {
            this.sess.close();
        }
    }
    
    public void executar() {
        this.tra.commit();
        this.sess.close();
    }

    public Session getSess() {
        return sess;
    }

    public void setSess(Session sess) {
        this.sess = sess;
    }

    public Transaction getTra() {
        return tra;
    }

    public void setTra(Transaction tra) {
        this.tra = tra;
    }
}
