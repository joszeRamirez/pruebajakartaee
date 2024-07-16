package ec.edu.ups.ppw64.pruebaramirezj.busines;

import java.util.List;

import ec.edu.ups.ppw64.pruebaramirezj.dao.ClienteDAO;
import ec.edu.ups.ppw64.pruebaramirezj.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionClientes {

	@Inject
	private ClienteDAO daoCliente;

	public void guardarCliente(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getDni());
		if (cli != null) {
			daoCliente.update(cliente);
		} else {
			daoCliente.insert(cliente);
		}
	}

	public void actualizarCliente(Cliente cliente) throws Exception {
		Cliente cli = daoCliente.read(cliente.getDni());
		if (cli != null) {
			daoCliente.update(cliente);
		} else {
			throw new Exception("Cliente no existe");
		}
	}

	public void borrarCliente(String dni) {
		daoCliente.delete(dni);
	}

	public Cliente getCliente(String dni) {
		Cliente cliente = daoCliente.read(dni);
		return cliente;
	}

	public List<Cliente> getClientespecific(String dni) {
		return daoCliente.getEspecifics(dni);
	}

}
