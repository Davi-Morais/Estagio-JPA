/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.estagiojpa.factory;

import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Estagio;
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
        
        
        Estagio estagio1 = new Estagio();
        estagio1.setCargaHoraria(100);
        estagio1.setInicioEstagio("15/10/2023");
        estagio1.setFimEstagio("20/03/2024");
        estagio1.setStatus("em andamento");
        estagio1.setAluno(aluno1);
        estagio1.setOrientador(orientador3);
        estagio1.setEmpresa(empresa1);
        
        Estagio estagio2 = new Estagio();
        estagio2.setCargaHoraria(150);
        estagio2.setInicioEstagio("10/08/2021");
        estagio2.setFimEstagio("28/05/2022");
        estagio2.setStatus("finalizado");
        estagio2.setAluno(aluno4);
        estagio2.setOrientador(orientador4);
        estagio2.setEmpresa(empresa2);
        
        Estagio estagio3 = new Estagio();
        estagio3.setCargaHoraria(200);
        estagio3.setInicioEstagio("22/06/2023");
        estagio3.setFimEstagio("22/06/2024");
        estagio3.setStatus("em andamento");
        estagio3.setAluno(aluno5);
        estagio3.setOrientador(orientador2);
        estagio3.setEmpresa(empresa2);
        
        Estagio estagio4 = new Estagio();
        estagio4.setCargaHoraria(150);
        estagio4.setInicioEstagio("16/04/2023");
        estagio4.setFimEstagio("22/11/2023");
        estagio4.setStatus("em andamento");
        estagio4.setAluno(aluno2);
        estagio4.setOrientador(orientador2);
        estagio4.setEmpresa(empresa1);
        
        Estagio estagio5 = new Estagio();
        estagio5.setCargaHoraria(100);
        estagio5.setInicioEstagio("10/02/2020");
        estagio5.setFimEstagio("18/10/2020");
        estagio5.setStatus("finalizado");
        estagio5.setAluno(aluno3);
        estagio5.setOrientador(orientador1);
        estagio5.setEmpresa(empresa1);
        
        manager.getTransaction().begin();
        manager.persist(estagio1);
        manager.persist(estagio2);
        manager.persist(estagio3);
        manager.persist(estagio4);
        manager.persist(estagio5);
        manager.getTransaction().commit();
        */
        
        
        
        //Update/Atualizacao ------
        
        /*
        
        //Atualizar data do Fim do estagio
        Estagio estagio1_update = manager.find(Estagio.class, 1L);
        estagio1_update.setFimEstagio("20/03/2027");
        
        manager.getTransaction().begin();
        manager.merge(estagio1_update);
        manager.getTransaction().commit();
        
        //Atualizar email de aluno:
        Aluno aluno_email_atualizar = manager.find(Aluno.class, 4L);
        aluno_email_atualizar.setEmail("gabrielaNovoEmail@email.com");
        
        manager.getTransaction().begin();
        manager.merge(aluno_email_atualizar);
        manager.getTransaction().commit();
        
        //Atualizar email e nome de orientador:
        Orientador orientador_email_nome = manager.find(Orientador.class, 3L);
        orientador_email_nome.setEmail("joaoFernands@gmail.com");
        orientador_email_nome.setNome("Joao Felix");
        
        manager.getTransaction().begin();
        manager.merge(orientador_email_nome);
        manager.getTransaction().commit();
        
        //Atualizar orientador de aluno
        
        Aluno aluno = manager.find(Aluno.class, 4L);
        Orientador orientadorAntigo = manager.find(Orientador.class, 4L);
        Orientador orientadorNovo = manager.find(Orientador.class, 2L);
        
        orientadorAntigo.getAlunos().remove(aluno);
        orientadorNovo.setAluno(aluno);
        
        
        manager.getTransaction().begin();
        manager.merge(orientadorAntigo);
        manager.merge(orientadorNovo);
        manager.getTransaction().commit();
        
        
        //Atualiza o orientador de um estagio:
        Estagio estagioAtualizado = manager.find(Estagio.class, 2L);
        Orientador orientadorNovoEstagio = manager.find(Orientador.class, 2L);
        
        estagioAtualizado.setOrientador(orientadorNovoEstagio);
        
        manager.getTransaction().begin();
        manager.merge(estagioAtualizado);
        manager.getTransaction().commit();
        
        */
        
        
        
        
        //deixar essas duas linhas aqui no final:
        manager.close();    
        factory.close();
    }
}
