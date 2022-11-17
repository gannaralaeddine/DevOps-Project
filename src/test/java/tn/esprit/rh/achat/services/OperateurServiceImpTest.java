package tn.esprit.rh.achat.services;



import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.services.OperateurRepository;


@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
@Slf4j
public class OperateurServiceImpTest {


    @Mock
    OperateurRepository or;

    @InjectMocks
    OperateurServiceImpl os;

    @Test
    public void retrieveOperateurTest(){
        Operateur f = new Operateur(1L,"aziz","test","pwd");

        when(or.findById(1L)).thenReturn(Optional.of(f));
        Operateur Operateur= os.retrieveOperateur((long) 1);
        Assertions.assertNotNull(Operateur);
        log.info("get ==>"+ Operateur.toString());
    }
    @Test
    public void addOperateurTest(){

        Operateur f = new Operateur(1L,"aziz","test","pwd");
        f.setIdOperateur(2L);


        os.adduodateOperateur(f);
        verify(or, times(1)).save(f);
        System.out.println(f);
        log.info("add ==>"+ f.toString());
    }

    @Test
    public void retrieveAllFournisseurs()
    {
        List<Operateur> Lf = new ArrayList<Operateur>() {

            {
                add(new Operateur(1L,"aziz","test","pwd"));
                add(new Operateur(1L,"aziz","test","pwd"));
                add(new Operateur(1L,"aziz","test","pwd"));
            }};


        when(os.retrieveAllOperateurs()).thenReturn(Lf);
        //test
        List<Operateur> operateurList = os.retrieveAllOperateurs();
        assertEquals(3, operateurList.size());
        log.info("retrieve all ==>"+ operateurList.toString());

    }

    @Test
    public void deleteFournisseurTest() {
        Operateur f = new Operateur(1L,"aziz","test","pwd");

        or.save(f);
        os.deleteOperateur(f.getIdOperateur());
        verify(or, times(1)).deleteById(f.getIdOperateur());
        log.info("delete ==>"+ f.toString());

    }


    @Test
    public void updateFournisseurTest() {
        Operateur f = new Operateur(1L,"aziz","test","pwd");
        when(or.save(f)).thenReturn(f);

        assertNotNull(f);
        assertEquals(f, os.adduodateOperateur(f));
        log.info("update ==>"+ f.toString());
    }
}