package tn.esprit.rh.achat.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.rh.achat.entities.Stock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest
{
    @Autowired
    IStockService stockService;

    @Test
    public void testAddStock()
    {
        List<Stock> stocks = stockService.retrieveAllStocks();
        Stock savedStock= stockService.addStock( new Stock("stock test",50,25) );
        assertEquals(stocks.size()+1, stockService.retrieveAllStocks().size());
        assertNotNull(savedStock.getLibelleStock());
        stockService.deleteStock(savedStock.getIdStock());
    }


}
