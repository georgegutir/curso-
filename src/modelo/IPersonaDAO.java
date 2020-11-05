package modelo;

import com.ipartek.pojo.Persona;

public interface IPersonaDAO extends IDao<Persona> {
	
	Persona recuperarPorDni(String dni);

}