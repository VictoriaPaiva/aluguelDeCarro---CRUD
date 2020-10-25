/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluguelDeCarro.AluguelDeCarroSenac.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vickp
 */
@Entity
@Table(name="aluguel")
public class Aluguel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn
    private Carro carro;
    @ManyToOne
    @JoinColumn
    private Cliente cliente;
    private double preco;
    private String dataLocacao;
    private String prazoDevolucao;
    private String dataDevolucao;
    private double juros;

    public Aluguel() {
    }

    public Aluguel(Carro carro, Cliente cliente, double preco, String dataLocacao, String prazoDevolucao, String dataDevolucao, double juros) {
        this.carro = carro;
        this.cliente = cliente;
        this.preco = preco;
        this.dataLocacao = dataLocacao;
        this.prazoDevolucao = prazoDevolucao;
        this.dataDevolucao = dataDevolucao;
        this.juros = juros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(String prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    
}
