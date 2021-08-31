package com.example.havagas.model;

public class User {
    private String nome;
    private String email;
    private Boolean receberEmail;
    private String tipoTelefone;
    private String telefone;
    private String celular;
    private String sexo;
    private String dataNascimento;
    private String formacao;
    private String medioAnoformatura;
    private String graduacaoConclusao;
    private String graduacaoInstituicao;
    private String doutoradoConclusao;
    private String doutoradoInstituicao;
    private String doutoradoMonografia;
    private String doutoradoOrientador;
    private String vagas;

    public User(String nome, String email, Boolean receberEmail, String tipoTelefone, String telefone,
                String celular, String sexo, String dataNascimento, String formacao, String medioAnoformatura,
                String graduacaoConclusao, String graduacaoInstituicao, String doutoradoConclusao, String doutoradoInstituicao,
                String doutoradoMonografia, String doutoradoOrientador, String vagas) {

        this.nome = nome;
        this.email = email;
        this.receberEmail = receberEmail;
        this.tipoTelefone = tipoTelefone;
        this.telefone = telefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.medioAnoformatura = medioAnoformatura;
        this.graduacaoConclusao = graduacaoConclusao;
        this.graduacaoInstituicao = graduacaoInstituicao;
        this.doutoradoConclusao = doutoradoConclusao;
        this.doutoradoInstituicao = doutoradoInstituicao;
        this.doutoradoMonografia = doutoradoMonografia;
        this.doutoradoOrientador = doutoradoOrientador;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(Boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getMedioAnoformatura() {
        return medioAnoformatura;
    }

    public void setMedioAnoformatura(String medioAnoformatura) {
        this.medioAnoformatura = medioAnoformatura;
    }

    public String getGraduacaoConclusao() {
        return graduacaoConclusao;
    }

    public void setGraduacaoConclusao(String graduacaoConclusao) {
        this.graduacaoConclusao = graduacaoConclusao;
    }

    public String getGraduacaoInstituicao() {
        return graduacaoInstituicao;
    }

    public void setGraduacaoInstituicao(String graduacaoInstituicao) {
        this.graduacaoInstituicao = graduacaoInstituicao;
    }

    public String getDoutoradoConclusao() {
        return doutoradoConclusao;
    }

    public void setDoutoradoConclusao(String doutoradoConclusao) {
        this.doutoradoConclusao = doutoradoConclusao;
    }

    public String getDoutoradoInstituicao() {
        return doutoradoInstituicao;
    }

    public void setDoutoradoInstituicao(String doutoradoInstituicao) {
        this.doutoradoInstituicao = doutoradoInstituicao;
    }

    public String getDoutoradoMonografia() {
        return doutoradoMonografia;
    }

    public void setDoutoradoMonografia(String doutoradoMonografia) {
        this.doutoradoMonografia = doutoradoMonografia;
    }

    public String getDoutoradoOrientador() {
        return doutoradoOrientador;
    }

    public void setDoutoradoOrientador(String doutoradoOrientador) {
        this.doutoradoOrientador = doutoradoOrientador;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

}
