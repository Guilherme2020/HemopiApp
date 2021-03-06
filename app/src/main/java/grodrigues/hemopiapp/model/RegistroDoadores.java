package grodrigues.hemopiapp.model;
/**
 * Created by grodrigues on 26/03/17.
 */

public class RegistroDoadores {
    private String nome;
    private String sexo;
    private  int numeroContato;
    private String tipoSanguineo;

    public RegistroDoadores(){}
    public RegistroDoadores(String nome,String sexo, int numeroContato,String tipoSanguineo){
        this.nome = nome;
        this.sexo = sexo;
        this.numeroContato = numeroContato;
        this.tipoSanguineo = tipoSanguineo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Doador" +
                "id" +
                "nome" +
                "tipo Sanguineo"+tipoSanguineo;
    }
}
