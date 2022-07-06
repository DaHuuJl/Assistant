package ru.cchgeu.assistant.astcore.controller.handler;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.cchgeu.assistant.astcore.util.exept.IllegalArgumentExceptionData;
import ru.cchgeu.assistant.astcore.util.exept.IllegalOperationException;
import ru.cchgeu.assistant.astcore.util.exept.IllegalOperationExceptionData;

/**
 * Кастомный обработчик исключений
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);

    /**
     * Перехватывает исключения <code>IllegalOperationException</code>
     * @param ex исключение
     * @return код ошибки (409 - Conflict) и данные об ошибке
     */
    @ExceptionHandler(IllegalOperationException.class)
    public ResponseEntity<?> handle(IllegalOperationException ex) {
        logger.log(Level.ERROR, ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new IllegalOperationExceptionData(ex.getCode(), ex.getMessage()));
    }

    /**
     * Перехватывает исключения <code>IllegalArgumentException</code>
     * @param ex исключение
     * @return код ошибки (409 - Conflict) и данные об ошибке
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handle(IllegalArgumentException ex) {
        logger.log(Level.ERROR, ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new IllegalArgumentExceptionData(ex.getMessage(), ex.getMessage()));
    }
}
