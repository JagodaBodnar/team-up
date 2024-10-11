package teamup.backend.sport.service;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import teamup.backend.sport.dtos.SportListDto;
import teamup.backend.sport.model.SportCode;
import teamup.backend.sport.repository.MockedSportRepository;
import teamup.backend.sport.repository.SportRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ActiveProfiles("test")
class SportServiceTest {

    @Autowired
    @InjectMocks
    private SportService sportService;

    @MockBean
    private SportRepository mockedSportRepository;

    @Test
    void getAllSports() {
        when(mockedSportRepository.findAll()).thenReturn(List.of(MockedSportRepository.createNewSport()));
        SportListDto actualResult = sportService.getAllSports();
        assertThat(actualResult.listOfSports()).hasSize(1);
        assertEquals(SportCode.VOLLEYBALL, actualResult.listOfSports().getFirst().code());
    }
}
