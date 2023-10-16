/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.estagiojpa.factory;

import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Estagio;
import br.com.estagiojpa.entities.Orientador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


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
        
        
        
        

        // Listando 
        
        //Listagem Aluno
        
        /*
        manager.getTransaction().begin();

        Query query = manager.createQuery("FROM Aluno");

        List<Aluno> alunos = query.getResultList();


        manager.getTransaction().commit();


        for (Aluno a: alunos) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Email: " + a.getEmail());
            System.out.println("Genero: " + a.getGenero());
            System.out.println("Idade: " + a.getIdade());

            System.out.println();
        }
        */

        
        //Listagem Empresas

        /*manager.getTransaction().begin();

        Query query = manager.createQuery("FROM Empresa");

        List<Empresa> empresas = query.getResultList();


        manager.getTransaction().commit();


        for (Empresa e: empresas) {
            System.out.println("Nome: " + e.getNome());
            System.out.println("Cnpj: " + e.getCnpj());


            System.out.println();
        }
        */

        
        //Listagem Estagios

        /*
        manager.getTransaction().begin();

        Query query = manager.createQuery("FROM Estagio");

        List<Estagio> estagios = query.getResultList();


        manager.getTransaction().commit();


        for (Estagio e: estagios) {
            System.out.println("Aluno: " + e.getAluno());
            System.out.println("Empresa: " + e.getEmpresa());
            System.out.println("Orientador: " + e.getOrientador());
            System.out.println("Carga Horaria: " + e.getCargaHoraria());
            System.out.println("Inicio do estagio: " + e.getInicioEstagio());
            System.out.println("Fim do estagio: " + e.getFimEstagio());
            System.out.println("Status: " + e.getStatus());

            System.out.println();
        }
        */

        
        
        //Listagem Orientadores
        /*
        manager.getTransaction().begin();

        Query query = manager.createQuery("FROM Orientador");

        List<Orientador> orientadores = query.getResultList();


        manager.getTransaction().commit();

        for (Orientador o: orientadores) {
            System.out.println("Nome: " + o.getNome());
            System.out.println("Empresa: " + o.getEmail());

        for (Orientador o: orientadores) {
        System.out.println("Nome: " + o.getNome());
        System.out.println("Empresa: " + o.getEmail());

        System.out.println();

            System.out.println();
        }*/



        //Listagem filtrada

        //Obter dados da entidade Aluno nos quais a entidade Estagio tem a coluna status igual a 'finalizado'

        /*String jpql = "SELECT a FROM Aluno a WHERE a.id IN (SELECT e.aluno.id FROM Estagio e WHERE e.status = 'finalizado')";
        TypedQuery<Aluno> query = manager.createQuery(jpql, Aluno.class);

        List<Aluno> resultados = query.getResultList();

        for (Aluno aluno : resultados) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Genero: " + aluno.getGenero());
        }*/


        //Obter dados da entidade Empresa e nome dos alunos onde na entidade Estagio tem a coluna status igual a 'em andamento'

        /*
        String jpql = "SELECT a.nome AS nomeAluno, e.nome AS nomeEmpresa " +
          "FROM Estagio estagio " +
          "JOIN estagio.aluno a " +
          "JOIN estagio.empresa e " +
          "WHERE estagio.status = 'em andamento'";

        TypedQuery<Object[]> query = manager.createQuery(jpql, Object[].class);

        List<Object[]> resultados = query.getResultList();

        for (Object[] resultado : resultados) {
            String nomeAluno = (String) resultado[0];
            String nomeEmpresa = (String) resultado[1];

            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("Nome da Empresa: " + nomeEmpresa);
        }
        */

       
       
        //Buscar o email de todos os alunos que são orientados pelo orientador 2
        
        /*
        String jpql = "SELECT a.email " +
          "FROM Estagio estagio " +
          "JOIN estagio.aluno a " +
          "JOIN estagio.empresa e " +
          "WHERE estagio.orientador.id  = 2 ";


        TypedQuery<String> query = manager.createQuery(jpql, String.class);

        List<String> emails = query.getResultList();

        for (String email : emails) {
            System.out.println("Email do Aluno: " + email);
        }

           
           
           

       
        
        
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
        
        
        
        //Operacoes de Remocao:
        
        //Removendo Estagio 1:
        
        /*
        manager.getTransaction().begin();
        
        var e = new Estagio();
        
        e = manager.find(Estagio.class, 1L);
        
        if (e == null) {
            System.out.println("Não deu certo");
        } else {
            manager.remove(e);
            manager.getTransaction().commit();
            System.out.println("Removido com sucesso!");
        }
        */
        
        
        //Revomer o aluno1 da empresa1:
        
        /*
        manager.getTransaction().begin();
        
        Empresa empresa1_remover_aluno = manager.find(Empresa.class, 1L);
        Aluno a = manager.find(Aluno.class, 1L);
        
        if (a == null) {
            System.out.println("Não deu certo");
        } else {
            empresa1_remover_aluno.getAlunos().remove(a);
            manager.merge(empresa1_remover_aluno);
            
            manager.getTransaction().commit();
            
            System.out.println("Aluno saiu da Empresa!");
        }
        */
        
        //Remover o aluno1 do Orientador3:
        
        /*
        manager.getTransaction().begin();
        
        Orientador orientador_remover_aluno = manager.find(Orientador.class, 3L);
        Aluno a = manager.find(Aluno.class, 1L);
        
        if (a == null) {
            System.out.println("Não deu certo");
        } else {
            orientador_remover_aluno.getAlunos().remove(a);
            manager.merge(orientador_remover_aluno);
            
            manager.getTransaction().commit();
            
            System.out.println("Remocao de Orientador com sucesso!");
        }
        */
        
        
        //Removendo Orientador 3
        
        /*
        Orientador orientador3_remover = manager.find(Orientador.class, 3L);
        
        if (orientador3_remover == null) {
            System.out.println("Não deu certo");
        } else {
            manager.getTransaction().begin();
            manager.remove(orientador3_remover);
            manager.getTransaction().commit();
            
            System.out.println("Orientador removido!");
        }
        */
        
        
        //Removendo aluno 1:
        
        /*
        Aluno a1 = manager.find(Aluno.class, 1L);
        
        if (a1 == null) {
            System.out.println("Não deu certo");
        } else {
            manager.getTransaction().begin();
            manager.remove(a1);
            manager.getTransaction().commit();
            
            System.out.println("Aluno removido!");
        }
        */
        
        
        
        //deixar essas duas linhas aqui no final:
        manager.close();    
        factory.close();
    }
}

