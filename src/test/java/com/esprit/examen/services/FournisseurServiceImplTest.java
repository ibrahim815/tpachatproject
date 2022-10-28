package com.esprit.examen.services;




import org.junit.runner.RunWith;




import com.esprit.examen.entities.Fournisseur;
import com.esprit.examen.repositories.FournisseurRepository;



import org.junit.Assert;



import lombok.extern.slf4j.Slf4j;


import org.junit.jupiter.api.Test;


//import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;





@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FournisseurServiceImplTest {
	@Autowired
	FournisseurServiceImpl fournisseurServiceImpl;
	FournisseurRepository fournisseurRepository;

	
	/*
	IUserService us;
	@Order(1)
	public void testRetrieveAllUsers () {
		List<User> ListUsers = us.retrieveAllUsers();
		Assertions.assertEquals(0, ListUsers.size());
	}
	*/
	@Test
	public void   addFournisseur( ) {	
		Fournisseur four = new Fournisseur(1000L,"aa","aa");
		Fournisseur fot =fournisseurServiceImpl.addFournisseur(four);	
		log.info("sa:"+fot);
		Assert.assertEquals(four.getLibelle(), fot.getLibelle());

	
	}
}
