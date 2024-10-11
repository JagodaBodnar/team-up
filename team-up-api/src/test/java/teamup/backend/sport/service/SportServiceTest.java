package teamup.backend.sport.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import teamup.backend.sport.dtos.SportDto;

import teamup.backend.sport.model.SportCode;
import teamup.backend.sport.repository.MockedSportRepository;
import teamup.backend.sport.repository.SportRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@SqlGroup({
        @Sql(scripts = "/test-data-clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD),
        @Sql(scripts = "/test-data-sport.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
})
public class SportServiceTest {
    @MockBean
    SportRepository mockedSportRepository;

    @InjectMocks
    SportService sportService;

    @BeforeEach
    void setUp() {
        sportService = new SportService(mockedSportRepository);
    }

    @Test
    void getAllSports() {
        Mockito.when(mockedSportRepository.findAll()).thenReturn(List.of(MockedSportRepository.createNewSport()));
        List<SportDto> actualResult = sportService.getAllSports();
        assertAll(
                "Grouped assertions getAllSports()",
                () -> assertEquals(1, actualResult.size()),
                () -> assertEquals(SportCode.VOLLEYBALL, actualResult.getFirst().code())
        );
    }
}
