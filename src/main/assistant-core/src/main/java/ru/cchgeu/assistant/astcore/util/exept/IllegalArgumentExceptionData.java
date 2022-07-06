package ru.cchgeu.assistant.astcore.util.exept;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.cchgeu.assistant.astcore.util.Guard;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Класс <code>IllegalArgumentExceptionData</code> содержит данные об исключении <code>IllegalArgumentException</code>
 */
public class IllegalArgumentExceptionData {
    private final String error;
    private final String message;

    @JsonCreator
    public IllegalArgumentExceptionData(
            @Nonnull @JsonProperty("error") String error,
            @Nullable @JsonProperty("message") String message) {
        Guard.notEmpty(error, "Error must not be empty");
        this.error = error;
        this.message = message;
    }

    @Nonnull
    public String getError() {
        return error;
    }

    @Nullable
    public String getMessage() {
        return message;
    }
}
