package teamup.backend.exceptions;

public record ApiError(int status, String reasonPhrase,  String message) {
}
