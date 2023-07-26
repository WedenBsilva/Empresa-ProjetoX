package Controller;

import Model.Cliente;

public interface Controllerdados {

        void salvarCliente();

        void atualizarCliente(Cliente cliente);

        void listarCliente();

        Cliente buscarNumeroCliente(int bloco);

        void excluirCliente(int bloco);

        int gerarNumero();

        int retornabloco(int bloco);
    }

