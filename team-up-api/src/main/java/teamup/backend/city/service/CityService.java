package teamup.backend.city.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teamup.backend.city.dto.CityDto;
import teamup.backend.city.model.City;
import teamup.backend.city.repository.CityRepository;
import teamup.backend.exceptions.CityNotFoundException;
import teamup.backend.location.dto.LocationDto;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;


    public List<CityDto> getAllCities(String city, String language) {
        return cityRepository.findAllByTag(city)
                .stream()
                .map(el-> CityDto.toCityDto(el, language))
                .toList();
    }

    public List<LocationDto> getLocations(UUID city) {
        City chosenCity = cityRepository.findById(city)
                .orElseThrow(()-> new CityNotFoundException("City not found."));
        return chosenCity.getLocations().stream().map(LocationDto::toLocationDto).toList();
    }
}
