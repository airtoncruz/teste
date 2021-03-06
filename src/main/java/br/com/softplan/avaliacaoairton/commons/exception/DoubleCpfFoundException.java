package br.com.softplan.avaliacaoairton.commons.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Excption especifica para tratar registros nao encontrados no banco.
 *
 * @author airton.cruz
 * @since 1.0 (29/09/2020)
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DoubleCpfFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public DoubleCpfFoundException() {
        super("cpf.duplicado");
    }

    public DoubleCpfFoundException(String message){
        super(message);
    }

}
