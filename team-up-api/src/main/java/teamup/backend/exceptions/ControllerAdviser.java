package teamup.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdviser {
    @ExceptionHandler({CityNotFoundException.class})
    private ResponseEntity<ApiError> notFoundException (RuntimeException exception) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.getReasonPhrase(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }
}
