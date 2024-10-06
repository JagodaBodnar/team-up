package teamup.backend.sport.controller;

import teamup.backend.sport.dtos.SportDto;
import teamup.backend.sport.model.SportCode;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class MockedSportController {
    public static List<SportDto> createMockedListOfSports(){
        List<SportDto> lisOfSports = new ArrayList<SportDto>();
        lisOfSports.add(new SportDto(UUID.fromString("a59ccc25-787b-4de4-9ad3-e1b281859aab"),
                SportCode.VOLLEYBALL,
                "volleyball.svg"));
        lisOfSports.add(new SportDto(UUID.fromString("3ee314f0-daa2-4d1d-8305-212b33ef7cd0"),
                SportCode.BASKETBALL,
                "basketball.svg"));
        lisOfSports.add(new SportDto(UUID.fromString("d785cabf-cb1b-4fd7-9a7d-88610f16b2fd"),
                SportCode.HOCKEY,
                "hockey.svg"));
        return lisOfSports;
    }
}
