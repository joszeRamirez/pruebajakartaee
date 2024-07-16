package ec.edu.ups.ppw64.pruebaramirezj.dao;

import java.util.List;

import ec.edu.ups.ppw64.pruebaramirezj.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ClienteDAO {

	@PersistenceContext
	private EntityManager es;

	public void insert(Cliente cliente) {
		es.persist(cliente);
	}

	public void update(Cliente cliente) {
		es.merge(cliente);
	}

	public void delete(String dni) {
		Cliente cliente = es.find(Cliente.class, dni);
		es.remove(cliente);
	}

	public Cliente read(String dni) {
		Cliente cliente = es.find(Cliente.class, dni);
		return cliente;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getAll() {
		String jpql = "SELECT c FROM Cliente c";
		Query q = es.createQuery(jpql, Cliente.class);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> getEspecifics(String dni) {
		String jpql = "SELECT c FROM Cliente c WHERE c.DNI = " + dni;
		Query q = es.createQuery(jpql, Cliente.class);
		return q.getResultList();
	}
}
