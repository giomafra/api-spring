package br.com.giomafra.exception;

import java.util.Date;

//record --> serve para criar objetos q vão apenas armazenar dados
public record ExceptionResponse(Date timestamp, String message, String details) {

}
