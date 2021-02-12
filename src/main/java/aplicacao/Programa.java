package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null,"Lincoln Gadea","lincoln@glinc.com.br");
        Pessoa p2 = new Pessoa(null,"Rafael Gadea","rafael@glinc.com.br");
        Pessoa p3 = new Pessoa(null,"Pedro Gadea","pedro@glinc.com.br");
        Pessoa p4 = new Pessoa(null,"Christiny Gadea","christiny@glinc.com.br");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto-jpa");
        EntityManager em = emf.createEntityManager();


        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p);
        em.close();

        System.out.println("Pronto!");

    }
}
