package tn.esprit.rh.achat.services;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Produit;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class FactureServiceImplTest {

	@Autowired
	IFactureService fs;

	@Test
	@Order(1)
	public void testRetrieveAllFactures() {
		List<Facture> listFactures = fs.retrieveAllFactures();
		Assertions.assertEquals(0, listFactures.size());
	}

	@Test
	@Order(2)
	public void testAddFacture() throws ParseException {

	}

}
