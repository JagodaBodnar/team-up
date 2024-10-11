package teamup.backend.city.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.web.servlet.MockMvc;
import teamup.backend.city.MockedCity;
import teamup.backend.city.service.CityService;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CityController.class)
@ActiveProfiles("test")
public class CityControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    CityService cityService;

    @Test
    @DisplayName("findAllCities() where city War and lang PL returns list of 1")
    public void whenFindAllCities_thenReturnListOf2Cities() throws Exception {
        Mockito.when(cityService.getAllCities("War", "PL"))
                .thenReturn(MockedCity.createMockedListOfCities());
        mockMvc.perform(get("/api/cities")
                        .param("language", "PL")
                        .param("city", "War"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.cityDtoList[0].name").value("Warszawa"))
                .andExpect(jsonPath("$.cityDtoList[0].country").value("PL"))
                .andExpect(jsonPath("$.cityDtoList[1].name").value("Warka"))
                .andExpect(jsonPath("$.cityDtoList.length()").value(2));

    }

    @Test
    @DisplayName("findAllLocations() where city id '12d96e44-a623-4e7e-aced-25422bbc0938' returns list of 3")
    public void whenFindAllLocations_thenReturnListOf3Locations() throws Exception {
        Mockito.when(cityService.getLocations(UUID.fromString("12d96e44-a623-4e7e-aced-25422bbc0938")))
                .thenReturn(MockedCity.createMockedListOfLocations());
        mockMvc.perform(get("/api/cities/12d96e44-a623-4e7e-aced-25422bbc0938/locations"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.locationDtoList[0].name").value("Centrum Sportowe AZOTY"))
                .andExpect(jsonPath("$.locationDtoList[1].id").value("d2a5cf2e-c9e7-4ab9-959c-3bb990572b98"))
                .andExpect(jsonPath("$.locationDtoList[2].name").value("Hala sportowa Warszawka"))
                .andExpect(jsonPath("$.locationDtoList.length()").value(3));
    }
}
