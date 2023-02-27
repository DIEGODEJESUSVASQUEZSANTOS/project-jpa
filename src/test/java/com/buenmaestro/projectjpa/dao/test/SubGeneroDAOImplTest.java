/**
 * 
 */
package com.buenmaestro.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.buenmaestro.projectjpa.dao.SubGeneroDAO;
import com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImpl;
import com.buenmaestro.projectjpa.entity.Genero;
import com.buenmaestro.projectjpa.entity.SubGenero;


/**
 * @author Diego
 * Clase TEST para implemenetar los funcionamientos de los metodos del crud del subgenero
 *
 */
class SubGeneroDAOImplTest {
	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for {@link com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.buenmaestro.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
		
		
	}

	/**
	 * Test method for {@link com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImplactualizar(com.buenmaestro.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado = this.subGeneroDAO.consultarById(7L);
		
		subGeneroConsultado.setDescripcion("Trash Metal");
		subGeneroConsultado.getGenero().setDescripcion("Hevi Metal");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
	}

	/**
	 * Test method for {@link com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(6L);
	}

	/**
	 * Test method for {@link com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();
		assertTrue(subGenerosConsultados.size() > 0);
		
		for(SubGenero subGenero : subGenerosConsultados) {
			System.out.println("Subgenero: " + subGenero.getDescripcion());
			System.out.println("Subgenero: " + subGenero.getGenero().getDescripcion());
		}
	}

	/**
	 * Test method for {@link com.buenmaestro.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
