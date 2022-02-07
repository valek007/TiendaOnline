package tienda.modelo.manejo_datos;

import java.sql.ResultSet;
import java.util.ArrayList;

import tienda.modelo.conexiones.ConexionBD;
import tienda.modelo.objetos.Factura;

public class RecuperarDatosFacturas {

	private static ArrayList<Factura> listaFacturas = new ArrayList<>();

	public RecuperarDatosFacturas() {

	}

	public static void recuperarDatosFacturas() {

		listaFacturas.clear();

		ConexionBD conexion = new ConexionBD();

		try {
			String instruSQL1 = "SELECT * FROM FACTURAS WHERE id_usuario=" + VerificacionUsuarios.getIdUsuario();

			ResultSet resultado = conexion.getDeclaracion().executeQuery(instruSQL1);

			while (resultado.next()) {
				listaFacturas.add(new Factura(resultado.getInt(2), resultado.getInt(3), resultado.getDouble(4),
						resultado.getDate(5)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}
}
