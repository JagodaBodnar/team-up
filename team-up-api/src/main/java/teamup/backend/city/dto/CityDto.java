package teamup.backend.city.dto;

import teamup.backend.city.model.City;
import teamup.backend.city.model.Country;

import java.util.UUID;

public record CityDto(UUID id, Country country, String name) {
    public static CityDto toCityDto(City city, String language) {
        return new CityDto(
                city.getId(),
                city.getCountry(),
                city.getCityNames().getOrDefault(language, city.getCityNames().get("EN")));
    }
}
