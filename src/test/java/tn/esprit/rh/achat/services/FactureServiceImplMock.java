package tn.esprit.rh.achat.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.FactureRepository;
import tn.esprit.rh.achat.repositories.ProduitRepository;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class FactureServiceImplMock {

	
	@Mock
	FactureRepository factureRepository;
	
	@InjectMocks
	FactureServiceImpl factureService;
	
	Facture produit = new Facture();
	List<Facture> listFactures = new ArrayList<Facture>() {
		{
			add(new Facture());
		}
	};
	
	
	
	
}
