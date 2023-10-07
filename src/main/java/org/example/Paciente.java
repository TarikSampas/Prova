package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Paciente {
    private int id;
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;
    private String profissao;

    public Paciente() {
        // Construtor vazio
    }

    public Paciente(int id, String nome, String rg, String endereco, String telefone,
                    LocalDate dataNascimento, String profissao) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    // Getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + ", rg=" + rg + ", endereco=" + endereco
                + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", profissao=" + profissao + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Paciente paciente = (Paciente) obj;
        return id == paciente.id && Objects.equals(nome, paciente.nome) && Objects.equals(rg, paciente.rg)
                && Objects.equals(endereco, paciente.endereco) && Objects.equals(telefone, paciente.telefone)
                && Objects.equals(dataNascimento, paciente.dataNascimento)
                && Objects.equals(profissao, paciente.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, rg, endereco, telefone, dataNascimento, profissao);
    }
}

