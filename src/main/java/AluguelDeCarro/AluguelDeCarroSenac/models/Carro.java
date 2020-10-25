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
import javax.persistence.Table;

/**
 *
 * @author vickp
 */
@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCarro;
//    @JsonIgnore
//    @OneToMany(mappedBy = "carro")
//    private List<Aluguel> alugueis = new ArrayList<>();
    private String marca;
    private String placa;
    private int qntPOrtas;
    private double preco;
    private String cor;
    private String tipo;

    public Carro() {
    }

    public Carro(String marca, String placa, int qntPOrtas, double preco, String cor, String tipo) {
        this.marca = marca;
        this.placa = placa;
        this.qntPOrtas = qntPOrtas;
        this.preco = preco;
        this.cor = cor;
        this.tipo = tipo;
    }

    public Carro(int idCarro, String marca, String placa, int qntPOrtas, double preco, String cor, String tipo) {
        this.idCarro = idCarro;
        this.marca = marca;
        this.placa = placa;
        this.qntPOrtas = qntPOrtas;
        this.preco = preco;
        this.cor = cor;
        this.tipo = tipo;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQntPOrtas() {
        return qntPOrtas;
    }

    public void setQntPOrtas(int qntPOrtas) {
        this.qntPOrtas = qntPOrtas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//    public List<Aluguel> getAluguel() {
//        return alugueis;
//    }

}
