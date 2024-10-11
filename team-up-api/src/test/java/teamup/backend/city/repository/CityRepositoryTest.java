package teamup.backend.city.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
@SqlGroup({
        @Sql(scripts = "/test-data-clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD),
        @Sql(scripts = "/test-data-city.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
})
public class CityRepositoryTest {
    @Autowired
    private CityRepository cityRepository;

    @Test
    @DisplayName("When findAllByTag() return list of 3 cities.")
    public void whenFindAllByTag_thenReturnListOf3Cities() {
        var actualResult = cityRepository.findAllByTag("War");
        System.out.println("actualResult = " + actualResult);
        assertAll(
                "Grouped assertions findAllByTag()",
                () -> assertEquals(actualResult.size(), 2),
                () -> assertTrue(actualResult.getLast().getCityNames().containsValue("Warszawa")),
                () -> assertTrue(actualResult.getFirst().getCityNames().containsValue("Warka"))
        );
    }
}
