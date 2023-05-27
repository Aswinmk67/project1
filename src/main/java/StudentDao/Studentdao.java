package StudentDao;

import javax.persistence.*;

import StudentDto.Studentdto;

public class Studentdao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	 public void insert(Studentdto dto1)
	 {
		 et.begin();
		 em.persist(dto1);
		 et.commit();
		 
		 System.out.println("data inserted...!!!");
	 }

}
