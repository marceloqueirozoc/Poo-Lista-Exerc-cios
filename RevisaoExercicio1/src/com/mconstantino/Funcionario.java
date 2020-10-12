package com.mconstantino;

import java.time.LocalDate;

public class Funcionario {

    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;

    public int getIfFunc() {
        return idFunc;
    }

    public void setIfFunc(int ifFunc) {
        this.idFunc = ifFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento){

        if (aumento > 0){
            this.salario += aumento;
        }

    }

    public void demiteFuncionario(){
        if (ativo) {
            this.ativo = false;
        }

    }

    public void imprimir(){
        System.out.println("Id = " + nomeFunc);
        System.out.println("Nome do Funcionario = " + nomeFunc);
        System.out.println("Departamento = " + departamento);
        System.out.println("Data de Contratação = " + dataContratacao);
        System.out.println("Salario = " + salario);
        System.out.println("Documento = " + documento);
        if (ativo){
            System.out.println("Ativo = Sim");
        }else{
            System.out.println("Ativo = Não");
        }

    }
}
