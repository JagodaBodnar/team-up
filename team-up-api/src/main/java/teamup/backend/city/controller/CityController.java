package teamup.backend.city.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teamup.backend.city.dto.CityListDto;
import teamup.backend.city.service.CityService;
import teamup.backend.location.dto.LocationListDto;

import java.util.UUID;

@RestController
@RequestMapping("/api/cities")
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;

    @GetMapping
    public ResponseEntity<CityListDto> findAllCities(@RequestParam String city, @RequestParam String language) {
        return ResponseEntity.ok(new CityListDto(cityService.getAllCities(city, language)));
    }

    @GetMapping("/{id}/locations")
    public ResponseEntity<LocationListDto> findAllLocations(@PathVariable UUID id) {
        return ResponseEntity.ok(new LocationListDto(cityService.getLocations(id)));
    }
}
