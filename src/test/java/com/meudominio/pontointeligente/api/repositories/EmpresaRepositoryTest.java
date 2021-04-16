package com.meudominio.pontointeligente.api.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.meudominio.pontointeligente.api.entities.Empresa;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.meudominio.pontointeligente.api.repositories.EmpresaRepository.class)
@ActiveProfiles("test")
public class EmpresaRepositoryTest {
	//Injeta a dependência empresaRepository, assim podemos utiliza-la aqui
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final String CNPJ = "000123456789100";
	
	@Before
	public void setUp() throws Exception {
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Empresa de exemplo");
		empresa.setCnpj(CNPJ);
		this.empresaRepository.save(empresa);
	}
	
	@After
	public final void tearDown() {
		this.empresaRepository.deleteAll();
	}
	
	@Test
	public void testBuscarPorCnpj() {
		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);
		
		assertEquals(CNPJ, empresa.getCnpj());
	}
	
			
	

}
