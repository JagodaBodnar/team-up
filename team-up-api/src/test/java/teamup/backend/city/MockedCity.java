package teamup.backend.city;

import teamup.backend.city.dto.CityDto;
import teamup.backend.city.model.City;
import teamup.backend.city.model.Country;
import teamup.backend.location.dto.LocationDto;
import teamup.backend.location.model.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class MockedCity {
    public static List<CityDto> createMockedListOfCities() {
        return List.of(new CityDto(UUID.fromString("1c73e6e2-36a0-4eb9-b184-931f1f66173d"), Country.PL, "Warszawa"),
                new CityDto(UUID.fromString("9bc430cc-53d2-44c4-985d-6a682a1f2937"), Country.PL, "Warka"));
    }

    public static List<LocationDto> createMockedListOfLocations() {
        return List.of(new LocationDto(UUID.fromString("b44a02e8-8e04-4afc-bf97-feb84c0e113a"), "Centrum Sportowe AZOTY"),
                new LocationDto(UUID.fromString("d2a5cf2e-c9e7-4ab9-959c-3bb990572b98"), "Szkoła Podstawowa nr 10"),
                new LocationDto(UUID.fromString("6e10eb1b-a218-48f1-a17e-77edc1ed16b9"), "Hala sportowa Warszawka"));
    }

    public static List<City> createListOfCities() {
        return List.of(new City(
                        UUID.fromString("0f7084a3-13d2-4afa-b5e5-9e7df3718d32"),
                        Country.PL,
                        Map.of("PL", "Warka", "EN", "Warka"),
                        List.of()),
                new City(UUID.fromString("12d96e44-a623-4e7e-aced-25422bbc0938"),
                        Country.PL,
                        new HashMap<String, String>() {{
                            put("PL", "Warszawa");
                            put("EN", "Warszawa");
                        }}, List.of(new Location(UUID.fromString(
                                "b44a02e8-8e04-4afc-bf97-feb84c0e113a"),
                                "ul.Warszawaska 12",
                                "Centrum Sportowe AZOTY",
                                List.of()),
                        new Location(UUID.fromString(
                                "d2a5cf2e-c9e7-4ab9-959c-3bb990572b98"),
                                "ul.Dworcowa 5",
                                "Szkoła Podstawowa nr 10",
                                List.of()),
                        new Location(UUID.fromString(
                                "b44a02e8-8e04-4afc-bf97-feb84c0e113a"),
                                "ul.Warszawaska 12",
                                "Centrum Sportowe AZOTY",
                                List.of())))
        );
    }
}
