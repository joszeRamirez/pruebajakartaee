package ec.edu.ups.ppw64.pruebaramirezj.busines;

import ec.edu.ups.ppw64.pruebaramirezj.dao.ClienteDAO;
import ec.edu.ups.ppw64.pruebaramirezj.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDAO daoCliente;

	@PostConstruct
	public void init() {
//	Tabla: Clientes
		Cliente cli1 = new Cliente();
		cli1.setDni("0706740610");
		cli1.setNombre("José Ramírez");
		cli1.setDireccion("Calle Madrid");
		cli1.setCodunelna("2233445560");
		cli1.setFechaRevision("03/03/2024");
		cli1.setConsumokw(5.8);
		cli1.setDeudaPendiente(10.50);
		daoCliente.insert(cli1);

		Cliente cli2 = new Cliente();
		cli2.setDni("0704585926");
		cli2.setNombre("Christhian Romero");
		cli2.setDireccion("Av. 25 de Junio");
		cli2.setCodunelna("1133445588");
		cli2.setFechaRevision("02/06/2024");
		cli2.setConsumokw(20.42);
		cli2.setDeudaPendiente(80.25);
		daoCliente.insert(cli2);

		Cliente cli3 = new Cliente();
		cli3.setDni("0706740610");
		cli3.setNombre("José Ramírez");
		cli3.setDireccion("Calle Madrid");
		cli3.setCodunelna("2233445560");
		cli3.setFechaRevision("03/04/2024");
		cli3.setConsumokw(4.5);
		cli3.setDeudaPendiente(8.0);
		daoCliente.insert(cli3);

		Cliente cli4 = new Cliente();
		cli4.setDni("0706740610");
		cli4.setNombre("José Ramírez");
		cli4.setDireccion("Calle Madrid");
		cli4.setCodunelna("2233445560");
		cli4.setFechaRevision("03/05/2024");
		cli4.setConsumokw(6.0);
		cli4.setDeudaPendiente(12.15);
		daoCliente.insert(cli4);

		Cliente cli5 = new Cliente();
		cli5.setDni("0102457852");
		cli5.setNombre("Cristian Timbi");
		cli5.setDireccion("Calle Vieja");
		cli5.setCodunelna("1245785620");
		cli5.setFechaRevision("04/07/2024");
		cli5.setConsumokw(8.5);
		cli5.setDeudaPendiente(22.80);
		daoCliente.insert(cli5);

		Cliente cli6 = new Cliente();
		cli6.setDni("0102785970");
		cli6.setNombre("Bryan Ávila");
		cli6.setDireccion("Avenida Pumapungo");
		cli6.setCodunelna("1852752800");
		cli6.setFechaRevision("04/07/2024");
		cli6.setConsumokw(4.8);
		cli6.setDeudaPendiente(0.0);
		daoCliente.insert(cli6);
	}

}
