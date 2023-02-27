package com.buenmaestro.projectjpa.dao;

import java.util.List;

import com.buenmaestro.projectjpa.entity.Disquera;

/*
 * 
 *DIEGO DE jESUS vasquez Santos
 *Intercafe que genera el DAO para las transacciones del CRUD a la tabla de disquera
 */

public interface DisqueraDAO {
	void guardar (Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	
	/*
	 * Metodo que permite consultar con SQL nativo la disquera a partir de una descripcion
	 *@param descripcion {@link String} descripcion de la disquera 
	 *@return {@link} la disquera consultada 
	 */
	
	Disquera consultarByDescripcionNative(String descripcion);
}
