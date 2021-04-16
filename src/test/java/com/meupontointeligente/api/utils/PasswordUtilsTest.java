package com.meupontointeligente.api.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.meudominio.pontointeligente.api.utils.PasswordUtils;

public class PasswordUtilsTest {
	private static final String SENHA = "12345";
	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	
	@Test 
	public void testSenhaNula() throws Exception {
		assertNull(PasswordUtils.gerarBCrypt(null)); //assert null garante que é nulo
	}
	
	@Test
	public void testGerarHashSenha() throws Exception {
		String hash = PasswordUtils.gerarBCrypt(SENHA);
		
		assertTrue(bCryptEncoder.matches(SENHA, hash));
	}

}
