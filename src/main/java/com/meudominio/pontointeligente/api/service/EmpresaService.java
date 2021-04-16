package com.meudominio.pontointeligente.api.service;

import java.util.Optional;

import com.meudominio.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um cnpj
	 * 
	 * @param cnpj
	 * @param Optional<Empresa> 
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados
	 * 
	 * @param empresa
	 * @return empresa 
	 */
	
	Empresa pesistir(Empresa empresa);

}
