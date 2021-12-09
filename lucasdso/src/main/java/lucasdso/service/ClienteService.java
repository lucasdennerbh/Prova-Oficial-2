package lucasdso.service;

import java.util.List;

import lucasdso.domain.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);

	void editar(Cliente cliente);

	void excluir(Long id);

	Cliente buscarPorId(Long id);

	List<Cliente> buscarTodos();
}