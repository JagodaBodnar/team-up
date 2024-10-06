package teamup.backend.sport.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import teamup.backend.sport.service.SportService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SportController.class)
class SportControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    SportService sportService;

    @Test
    @DisplayName("findAll() returns list of 3 sports.")
    public void whenFindAllSports_thenReturnListOf3Sports() throws Exception {
        Mockito.when(sportService.getAllSports()).thenReturn(MockedSportController.createMockedListOfSports());
        mockMvc.perform(get("/api/sports"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.listOfSports.length()").value(3));

    }
}