/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AluguelDeCarro.AluguelDeCarroSenac.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vickp
 */
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCliente;
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Aluguel> aluguel = new ArrayList<>();;
    private String nome;
    private String cpf;
    private int idade;
    private String rg;

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String cpf, int idade, String rg) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
    }

    public Cliente(String nome, String cpf, int idade, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Aluguel> getAluguel() {
        return aluguel;
    }
    
}
