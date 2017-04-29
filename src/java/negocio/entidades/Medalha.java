/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.entidades;

import java.math.BigInteger;

/**
 *
 * @author Camila
 */
public class Medalha {

    private Integer id;
    private String nome;
    private BigInteger pontuacaoNecessaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getPontuacaoNecessaria() {
        return pontuacaoNecessaria;
    }

    public void setPontuacaoNecessaria(BigInteger pontuacaoNecessaria) {
        this.pontuacaoNecessaria = pontuacaoNecessaria;
    }
    
    
}
