package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sorinaccio on 10/24/2016.
 */
public class ShipwreckControllerTest {

    @InjectMocks
    ShipwreckController sc;

    @Mock
    ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() {
        Shipwreck sw = new Shipwreck();
        sw.setId(1l);

        when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck wreck = sc.get(1L);

        verify(shipwreckRepository).findOne(1l);
        //assertEquals(1L, wreck.getId().longValue());
        assertThat(wreck.getId(), is(1l));
    }
}
