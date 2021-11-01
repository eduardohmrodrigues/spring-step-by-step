package com.ehmr.spring.basics.junitstepbystep.mockito;

import com.ehmr.spring.basics.junitstepbystep.mockito.dao.DataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class SomeBusinessImplTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindGreatestFromAllData() throws Exception {
        // Given
        int expected = 111;
        int[] data = new int[]{5, 7, 6, -1, expected};
        when(dataServiceMock.retrieveAllData()).thenReturn(data);

        // When
        int actual = someBusiness.findGreatesFromAllData();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFindGreatestFromAllDataForNegativeValues() throws Exception {
        // Given
        int expected = -1;
        int[] data = new int[]{-999, expected};
        when(dataServiceMock.retrieveAllData()).thenReturn(data);

        // When
        int actual = someBusiness.findGreatesFromAllData();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFindGreatestFromAllDataThrowsExceptionForEmptyData() throws Exception {
        // Given
        int[] data = new int[0];
        when(dataServiceMock.retrieveAllData()).thenReturn(data);

        // When/Then
        assertThrows(Exception.class, someBusiness::findGreatesFromAllData);
    }
}
