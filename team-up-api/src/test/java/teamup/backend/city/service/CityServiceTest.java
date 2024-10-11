package teamup.backend.city.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import teamup.backend.city.MockedCity;
import teamup.backend.city.repository.CityRepository;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@SqlGroup({
        @Sql(scripts = "/test-data-clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD),
        @Sql(scripts = "/test-data-city.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
})
public class CityServiceTest {
    @Autowired
    private CityService cityService;
    @MockBean
    CityRepository cityRepository;

    @Test
    void whenGetAllCities_thenReturnListOf2Cities() {
        Mockito.when(cityRepository.findAllByTag("War"))
                .thenReturn(MockedCity.createListOfCities());
        var actualResult = cityService.getAllCities("War", "EN");
        assertAll(
                "Grouped assertions getAllCities()",
                () -> assertEquals(2, actualResult.size()),
                () -> assertEquals("Warszawa", actualResult.getLast().name()),
                () -> assertEquals(actualResult.getFirst().name(), "Warka")
        );
    }

    @Test
    void whenGetLocations_thenReturnListOf3LocationsForWar() {
        Mockito.when(cityRepository.findById(UUID.fromString("b44a02e8-8e04-4afc-bf97-feb84c0e113a")))
                .thenReturn(Optional.ofNullable(MockedCity.createListOfCities().getLast()));
        var actualResult = cityService.getLocations(UUID.fromString("b44a02e8-8e04-4afc-bf97-feb84c0e113a"));
        assertAll(
                "Grouped getLocations()",
                () -> assertEquals(3, actualResult.size()),
                () -> assertEquals("Szkoła Podstawowa nr 10", actualResult.get(1).name())
        );

    }
}
