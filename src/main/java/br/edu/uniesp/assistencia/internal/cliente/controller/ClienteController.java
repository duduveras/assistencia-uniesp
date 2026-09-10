package br.edu.uniesp.assistencia.internal.cliente.controller;

import br.edu.uniesp.assistencia.internal.cliente.dto.ClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;
import br.edu.uniesp.assistencia.internal.cliente.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<ClienteEntity> cadastrar(
            @RequestBody ClienteRequest request) {

        ClienteEntity cliente = clienteService.cadastrar(request);

        return ResponseEntity.ok(cliente);
    }
}