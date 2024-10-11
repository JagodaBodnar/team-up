package teamup.backend.sport.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teamup.backend.sport.dtos.SportListDto;
import teamup.backend.sport.service.SportService;

@RestController
@RequestMapping("/api/sports")
@RequiredArgsConstructor
public class SportController {
    private final SportService sportService;

    @GetMapping
    public ResponseEntity<SportListDto> allSports(){
        return ResponseEntity.ok(new SportListDto(sportService.getAllSports()));
    }
}
