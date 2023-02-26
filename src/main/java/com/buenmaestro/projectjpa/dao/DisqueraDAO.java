package com.buenmaestro.projectjpa.dao;

import java.util.List;

import com.buenmaestro.projectjpa.entity.Disquera;

/*
 * 
 *dIEGO DE jESUS vasquez Santos
 *Intercafe que genera el DAO para las transacciones del CRUD a la tabla de disquera
 */

public interface DisqueraDAO {
	void guardar (Disquera disquera);
	void actualizar(Disquera disquera);
	void eliminar(Long id);
	
	List<Disquera> consultar();
	Disquera consultarById(Long id);
}
