package br.edu.uniesp.assistencia.internal.cliente.service;

import br.edu.uniesp.assistencia.internal.cliente.dto.ClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;
import br.edu.uniesp.assistencia.internal.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity cadastrar(ClienteRequest request) {

        ClienteEntity cliente = new ClienteEntity(
                request.nome(),
                request.cpf(),
                request.email()
        );

        return clienteRepository.save(cliente);
    }
}