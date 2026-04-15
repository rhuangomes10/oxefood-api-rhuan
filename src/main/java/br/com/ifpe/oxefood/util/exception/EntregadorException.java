package br.com.ifpe.oxefood.util.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)

public class EntregadorException extends RuntimeException {
    
    public EntregadorException(String msg) {

	super(String.format(msg));
    }

}
