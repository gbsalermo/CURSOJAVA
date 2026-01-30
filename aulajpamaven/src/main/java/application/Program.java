package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


//Teste JPA - AULA 1
public class Program {

	public static void main(String[] args) {
	
		//O id vai ser nulo pois o proprio banco de dados vai atribuir um valor
		Pessoa p1 = new Pessoa(null, "Calos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");	
		EntityManager em = emf.createEntityManager(); //Com isso eu ja tenho uma conexão direta com o banco de dados
		/*Transação com o banco de dados(inicio)
		em.getTransaction().begin();
		
		//O persist é o que vai salvar o obj no banco de dados
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		//Transação com o banco de dados(fim)
		em.getTransaction().commit();
		*/
		
		//Buscando um obj pelo id
		Pessoa p = em.find(Pessoa.class, 2);
		
		//Para remover
		em.getTransaction().begin();
		em.remove(p); //Mas primeiro eu tenho de buscar com o find e estar entre transações
		em.getTransaction().commit();
		//Imprimo a busca
		System.out.println(p);
		
		System.out.println("pronto");
		
		//fechando ambos
		em.close();
		emf.close();
		

		
	}

}
