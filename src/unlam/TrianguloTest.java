package unlam;

import org.junit.Test;
import org.junit.Assert;
public class TrianguloTest {

	@Test
	public void prueba00FuncionesClaseTriangulo() {
		Triangulo triang=new Triangulo(1,1,1);
		Triangulo triang2=new Triangulo(-1,1,1);
		Assert.assertEquals(true,triang.esTriangulo());
		Assert.assertEquals(false,triang2.esTriangulo());
	}
	
	@Test
	public void prueba01Equilatero() {
		Triangulo triang=new Triangulo(1,1,1);
		Assert.assertEquals("Equilatero", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba02Isosceles() {
		Triangulo triang=new Triangulo(2,3,2);
		Assert.assertEquals("Isosceles", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba03Escaleno() {
		Triangulo triang=new Triangulo(4,2,3);
		Assert.assertEquals("Escaleno", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba04LadoNegativo() {
		Triangulo triang=new Triangulo(-2,3,2);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba05TodosLosLadosNegativos() {
		Triangulo triang=new Triangulo(-2,-3,-2);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
		
	@Test
	public void prueba07IngresoUnaLetra() {
		Triangulo triang=new Triangulo('a',20,60);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba08IngresoUnCaracterNoNumerico() {
		Triangulo triang=new Triangulo('%',20,60);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba09UnLadoConCero() {
		Triangulo triang=new Triangulo(0,20,60);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba10TresLadosIgualesACero() {
		Triangulo triang=new Triangulo(0,0,0);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba11TresEnterosCuyaSumaDeDosSeaMayorAlTercero() {
		Triangulo triang=new Triangulo(5,3,3);
		Assert.assertEquals("Isosceles", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba12distintosTiposDeIsosceles() {
		Triangulo triang=new Triangulo(2,1,2);
		Triangulo triang2=new Triangulo(2,2,1);
		Triangulo triang3=new Triangulo(1,2,2);
		Assert.assertEquals("Isosceles", triang.tipoTriangulo());
		Assert.assertEquals("Isosceles", triang2.tipoTriangulo());
		Assert.assertEquals("Isosceles", triang3.tipoTriangulo());
	}
	
	@Test
	public void prueba13distintosTiposDeEscalenos() {
		Triangulo triang=new Triangulo(4,2,3);
		Triangulo triang2=new Triangulo(2,4,3);
		Triangulo triang3=new Triangulo(3,2,4);
		Assert.assertEquals("Escaleno", triang.tipoTriangulo());
		Assert.assertEquals("Escaleno", triang2.tipoTriangulo());
		Assert.assertEquals("Escaleno", triang3.tipoTriangulo());
	}
	
	@Test
	public void prueba14distintosTiposDeEquilateros() {
		Triangulo triang=new Triangulo(4,4,4);
		Triangulo triang2=new Triangulo(4,4,4);
		Triangulo triang3=new Triangulo(4,4,4);
		Assert.assertEquals("Equilatero", triang.tipoTriangulo());
		Assert.assertEquals("Equilatero", triang2.tipoTriangulo());
		Assert.assertEquals("Equilatero", triang3.tipoTriangulo());
	}
	
	@Test
	public void prueba15TresEnterosCuyaSumaDeDosSeaMayorAlTerceroPermutado() {
		Triangulo triang=new Triangulo(5,3,4);
		Triangulo triang2=new Triangulo(4,3,5);
		Triangulo triang3=new Triangulo(3,5,4);
		Assert.assertEquals("Escaleno", triang.tipoTriangulo());
		Assert.assertEquals("Escaleno", triang2.tipoTriangulo());
		Assert.assertEquals("Escaleno", triang3.tipoTriangulo());
	}
	
	@Test
	public void prueba16TresEnterosCuyaSumaDeDosSeaMenorAlTercero() {
		Triangulo triang=new Triangulo(1,1,3);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba17TresEnterosCuyaSumaDeDosSeaMenorAlTerceroPermutado() {
		Triangulo triang=new Triangulo(1,1,3);
		Triangulo triang2=new Triangulo(1,3,1);
		Triangulo triang3=new Triangulo(3,1,1);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
		Assert.assertEquals("No es un triangulo", triang2.tipoTriangulo());
		Assert.assertEquals("No es un triangulo", triang3.tipoTriangulo());
	}

	/**
	 * 	No deja hacer el test
	 *	tira error por el constructor
	 *
	@Test
	public void prueba17ValorNoEntero() {
		Triangulo triang=new Triangulo(1.3,1,3);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	*/
	
	@Test
	public void prueba18DosLados() {
		Triangulo triang=new Triangulo(1,3);
		Assert.assertEquals("No es un triangulo", triang.tipoTriangulo());
	}
	
	@Test
	public void prueba19CuatroOMasLados() {
		Triangulo t1 = new Triangulo(1,2,3,4,5);
		Triangulo t2 = new Triangulo(1,2,3,4);
		Triangulo t3 = new Triangulo(1,2,3,4,5,6);
		Assert.assertEquals("No es un triangulo", t1.tipoTriangulo());
		Assert.assertEquals("No es un triangulo", t2.tipoTriangulo());
		Assert.assertEquals("No es un triangulo", t3.tipoTriangulo());
	}
}




