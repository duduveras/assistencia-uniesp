package br.edu.uniesp.assistencia.internal.cliente.dto;

public record ClienteRequest(
        String nome,
        String cpf,
        String email
) {
}