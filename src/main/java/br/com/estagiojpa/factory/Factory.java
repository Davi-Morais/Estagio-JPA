/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.estagiojpa.factory;

import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Orientador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Factory {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager manager = factory.createEntityManager();
        
        //Criando os alunos e os seus Orientadores:
        /*
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Nicole");
        aluno1.setGenero('F');
        aluno1.setEmail("nicole.@email.com");
        aluno1.setIdade(20);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Mateus Luiz");
        aluno2.setGenero('M');
        aluno2.setEmail("mateusluiz@email.com");
        aluno2.setIdade(19);
        
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Ricardo");
        aluno3.setGenero('M');
        aluno3.setEmail("ricardoj@email.com");
        aluno3.setIdade(25);
        
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Gabriela");
        aluno4.setGenero('F');
        aluno4.setEmail("gabi@email.com");
        aluno4.setIdade(23);
        
        Aluno aluno5 = new Aluno();
        aluno5.setNome("Juliano");
        aluno5.setGenero('M');
        aluno5.setEmail("julion@email.com");
        aluno5.setIdade(20);
        
        manager.getTransaction().begin();
        manager.persist(aluno1);
        manager.persist(aluno2);
        manager.persist(aluno3);
        manager.persist(aluno4);
        manager.persist(aluno5);
        manager.getTransaction().commit();
                
        
        //Criando os orientadores
        
        Orientador orientador1 = new Orientador();
        orientador1.setNome("Rafael");
        orientador1.setEmail("rafael@email.com");
        orientador1.setAluno(aluno3);
        
        Orientador orientador2 = new Orientador();
        orientador2.setNome("Luiza");
        orientador2.setEmail("luiza@email.com");
        orientador2.setAluno(aluno2);
        orientador2.setAluno(aluno5);
        
        Orientador orientador3 = new Orientador();
        orientador3.setNome("Joao");
        orientador3.setEmail("joao@email.com");
        orientador3.setAluno(aluno1);
        
        Orientador orientador4 = new Orientador();
        orientador4.setNome("Pedro");
        orientador4.setEmail("pedro@email.com");
        orientador4.setAluno(aluno4);
        
        
        manager.getTransaction().begin();
        manager.persist(orientador1);
        manager.persist(orientador2);
        manager.persist(orientador3);
        manager.persist(orientador4);
        manager.getTransaction().commit();
        
        
        Empresa empresa1 = new Empresa();
        empresa1.setNome("Happy Code Solucoes");
        empresa1.setCnpj("00.XXX.000/0001-77");
        empresa1.setAlunos(aluno1);
        empresa1.setAlunos(aluno2);
        empresa1.setAlunos(aluno3);
        
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Escopo Digital Cajazeiras");
        empresa2.setCnpj("11.XXX.111/0001-99");
        empresa2.setAlunos(aluno4);
        empresa2.setAlunos(aluno5);
        
        manager.getTransaction().begin();
        manager.persist(empresa1);
        manager.persist(empresa2);
        manager.getTransaction().commit();
        */

        
        manager.close();    
        factory.close();
    }
}
