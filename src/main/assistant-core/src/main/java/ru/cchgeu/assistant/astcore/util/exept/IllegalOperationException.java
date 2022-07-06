package ru.cchgeu.assistant.astcore.util.exept;

import ru.cchgeu.assistant.astcore.util.Guard;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Исключение <code>IllegalOperationException</code> выбрасывается при попытке выполнить неправомерную операцию
 */
public class IllegalOperationException extends RuntimeException {
    private final String code;

    public IllegalOperationException() {
        this("IllegalOperation", "");
    }

    public IllegalOperationException(@Nonnull String code) {
        this(code, "", null /* cause */);
    }

    public IllegalOperationException(@Nonnull String code, @Nullable String message) {
        this(code, message, null /* cause */);
    }

    public IllegalOperationException(@Nonnull String code, @Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
        Guard.notEmpty(code, "Code must not be empty");
        this.code = code;
    }

    public IllegalOperationException(@Nonnull String code, @Nullable Throwable cause) {
        super(cause);
        Guard.notEmpty(code, "Code must not be empty");
        this.code = code;
    }

    @Nonnull
    public String getCode() {
        return code;
    }
}
