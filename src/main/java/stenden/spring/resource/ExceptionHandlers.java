package stenden.spring.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import stenden.spring.responses.ErrorResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * A class for handling exceptions
 */
@RestControllerAdvice
public class ExceptionHandlers {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(GreetingException.class)
    public ErrorResponse handleGreetingException(GreetingException exception, HttpServletRequest request) {
        return new ErrorResponse(String.format("I have the message '%s' for %s", exception.getMessage(), request.getRemoteAddr()));
    }

}
