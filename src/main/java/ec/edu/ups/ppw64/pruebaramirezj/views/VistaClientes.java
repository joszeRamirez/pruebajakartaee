package ec.edu.ups.ppw64.pruebaramirezj.views;

import java.util.List;

import ec.edu.ups.ppw64.pruebaramirezj.busines.GestionClientes;
import ec.edu.ups.ppw64.pruebaramirezj.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped
public class VistaClientes {

	@Inject
	private GestionClientes gClientes;

	private Cliente cliente = new Cliente();

	private List<Cliente> listado;

//	@PostConstruct
//	public void init() {
//		listado = gClientes.getCliente();
//	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListado() {
		return listado;
	}

	public void setListado(List<Cliente> listado) {
		this.listado = listado;
	}

	public void buscar() {
		try {
			System.out.println(this.cliente.getDni());
			gClientes.getCliente(cliente.getDni());
			listado = gClientes.getClientespecific(cliente.getDni());
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
