/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.estagiojpa.factory;

import br.com.estagiojpa.entities.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Factory {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager manager = factory.createEntityManager();
        
        //Criando os alunos Nicole e Mateus Luiz:
        
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
        
        manager.getTransaction().begin();
        manager.persist(aluno1);
        manager.persist(aluno2);
        manager.getTransaction().commit();
        manager.close();
        
        
        factory.close();
    }
}
