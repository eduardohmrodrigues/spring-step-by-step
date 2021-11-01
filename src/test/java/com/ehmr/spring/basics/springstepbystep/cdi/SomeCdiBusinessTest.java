package com.ehmr.spring.basics.springstepbystep.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDAO dao;

    @Test
    public void testGetSizeOfDB() {
        // Given
        int expectedLength = 2;
        Mockito.when(dao.getData()).thenReturn(new int[expectedLength]);

        // When
        int actualLength = business.getSizeOfDB();

        // Then
        assertEquals(expectedLength, actualLength);
    }
}
