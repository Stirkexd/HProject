package hproject;
import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
public class Medico extends ControlePrincipal {
    private String paciente;
    private String sexo;
    private int nascimento_dia;
    private int nascimento_mes;
    private int nascimento_ano;
    private String qalergia;
    private String tipoSanguineo;
    private String observacoes;
    
    public void statusAvaliacao(){
        System.out.println("Avaliacao realizada em " + getPaciente() + ". Paciente apresenta: " + getObservacoes());
    }
    
    public void AvaliacaoPaciente(){
        Scanner av = new Scanner(System.in);
        System.out.println("-----------------Prontuario-----------------");
        
        System.out.println("Nome do paciente:");
        this.paciente = av.next();
        addpaci(this.paciente);
        
        System.out.println("sexo:");
        this.sexo = av.next();
        
        System.out.println("data de nascimento:");
        System.out.println("dia:");
        this.nascimento_dia = av.nextInt();
        System.out.println("mes:");
        this.nascimento_mes = av.nextInt();
        System.out.println("ano:");
        this.nascimento_ano = av.nextInt();
        
        System.out.println("possui alergia? Se sim, listar abaixo:");
        this.qalergia = av.next();
        
        System.out.println("tipo sanguineo:");
        this.tipoSanguineo = av.next();
        
        System.out.println("Observacoes sobre a avaliacao realizada:");
        this.observacoes = av.next();
        
    }

        //getters and setters da classe
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }


    public int getNascimento_dia() {
        return nascimento_dia;
    }

    public void setNascimento_dia(int nascimento_dia) {
        this.nascimento_dia = nascimento_dia;
    }

    public int getNascimento_mes() {
        return nascimento_mes;
    }

    public void setNascimento_mes(int nascimento_mes) {
        this.nascimento_mes = nascimento_mes;
    }

    public int getNascimento_ano() {
        return nascimento_ano;
    }

    public void setNascimento_ano(int nascimento_ano) {
        this.nascimento_ano = nascimento_ano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getQalergia() {
        return qalergia;
    }

    public void setQalergia(String qalergia) {
        this.qalergia = qalergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}
