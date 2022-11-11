package tn.esprit.rh.achat.services;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import tn.esprit.rh.achat.entities.Stock;
import tn.esprit.rh.achat.repositories.StockRepository;

public class StockServiceImplMock {
	@Mock
	StockRepository stockRepository;

	@InjectMocks
	StockServiceImpl stockService;

	Stock stock = new Stock("stock test", 50, 25);

	List<Stock> stocks = new ArrayList<Stock>() {
		{
			add(new Stock("stock test", 50, 25));
			add(new Stock("stock test", 50, 25));
		}
	};

}
