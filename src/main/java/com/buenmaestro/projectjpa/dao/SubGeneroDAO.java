/**
 * 
 */
package com.buenmaestro.projectjpa.dao;

import java.util.List;

import com.buenmaestro.projectjpa.entity.SubGenero;


/**
 * @author Diego  de Jesus Vasquez Santos
 * Interface DAO que realiza el CRUD con JPA para la tabla SubGenero
 *
 */
public interface SubGeneroDAO {
	
	void guardar(SubGenero subGenero);
	/**
	 * Metodo que permite guardar un subGenero
	 * @param subGnero {@link long} identificador del subjenero a guardar 
	 */

	void actualizar(SubGenero subGenero);
	/**
	 * Metodo que permite actualizar un subGenero
	 * @param subGnero {@link long} objeto a actualizar
	 */
	
	void eliminar(Long id);
	/**
	 * Metodo que permite eliminar un subGenero
	 * @return {@link list} lista de subgeneros consultados
	 */

	List<SubGenero> consultar();
	/**
	 * Metodo que permite consultar un subgenero a partir de su identificador 
	 * @param subGnero {@link long} identificador del subjenero a guardar 
	 * @return {@link subgenero} un objeto subgenero consultado 
	 */

	SubGenero consultarById(Long id);
	/**
	 * Metodo que permite guardar un subGenero}
	 * @param id {@link long} identificador del subjenero a consultar
	 * 
	 */
}
