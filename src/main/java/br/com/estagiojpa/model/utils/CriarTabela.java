package br.com.estagiojpa.model.utils;

import javax.persistence.Persistence;

public class CriarTabela {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("my_persistence_unit");

	}

}
