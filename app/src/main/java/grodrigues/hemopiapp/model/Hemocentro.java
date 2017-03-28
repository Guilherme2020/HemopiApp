package grodrigues.hemopiapp.model;

import java.util.Date;
import java.util.List;

/**
 * Created by grodrigues on 25/03/17.
 */

public class Hemocentro {

    private String nome;

    private Date dataDoacao;

    private int qtdBolsas;

    private  RegistroDoadores doador;

    private  List<RegistroDoadores> doadores;



    public Hemocentro(){

    }
    public Hemocentro(String nome,Date dataDoacao,int qtdBolsas){
            this.nome = nome; this.dataDoacao = dataDoacao; this.qtdBolsas = qtdBolsas;
    }


    public String getNome() {
        return nome;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public int getQtdBolsas() {
        return qtdBolsas;
    }
}
