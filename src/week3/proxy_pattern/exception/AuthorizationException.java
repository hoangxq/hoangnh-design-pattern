package week3.proxy_pattern.exception;

public class AuthorizationException extends Throwable {
    private String message;

    public AuthorizationException(String message) {
        this.message = message;
    }
}
