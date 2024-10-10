package teamup.backend.city.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teamup.backend.city.dto.CityDto;
import teamup.backend.city.service.CityService;
import teamup.backend.location.dto.LocationDto;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<List<CityDto>> findAllCities(@RequestParam String city, @RequestParam String language) {
        return ResponseEntity.ok(cityService.getAllCities(city, language));
    }

    @GetMapping("/{id}/locations")
    public ResponseEntity<List<LocationDto>> findAllLocations(@PathVariable UUID id) {
        return ResponseEntity.ok(cityService.getLocations(id));
    }
}
