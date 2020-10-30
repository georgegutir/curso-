package sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ejercicios.interfaces.app.clases.Patinete;

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {

		String sql = "SELECT * FROM coche ORDER BY nombre ASC;";

		// Todo lo que metamos dentro de los () del try se cierra automaticamente al
		// terminar el try
		// Esto es posible porque los recursos implementan la interfaz AutoClosable
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/concesionario.db");
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				Patinete patin = new Patinete();) {

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("nombre"));

			}

		} // try, se cierran Connection, PreparedStatement, ResultSet y Patinete

		System.out.println("terminamos");

	}

}