package com.esprit.examen.services;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.CategorieFournisseur;
import com.esprit.examen.entities.DetailFournisseur;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Fournisseur;
import com.esprit.examen.entities.SecteurActivite;

import org.junit.Assert;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FournisseurServiceImplTest {
	@Autowired
	FournisseurServiceImpl fournisseurServiceImpl;
	@Test
	public Fournisseur addFournisseur( ) {	
		Fournisseur fo = new Fournisseur(1000L,"aa","aa");
		Fournisseur fot =fournisseurServiceImpl.addFournisseur(fo);
		log.info("sa:"+fo);
		Assert.assertEquals(fo.getLibelle(), fot.getLibelle());
		
		return fo;
	
	}
}
