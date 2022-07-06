package ru.cchgeu.assistant.astcore.util;

import com.google.common.base.Strings;
import ru.cchgeu.assistant.astcore.util.exept.IllegalOperationException;

import java.util.Collection;
import java.util.function.Supplier;

/**
 * Класс <code>Guard</code> выбрасывает исключения
 */
public abstract class Guard {
    /**
     * Выбрасывает исключение <code>IllegalArgumentException</code>, если объект равен null
     * @param object объект
     * @param message сообщение
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Выбрасывает исключение <code>IllegalArgumentException</code>, если строка пуста или равна null
     * @param text строка
     * @param message сообщение
     */
    public static void notEmpty(String text, String message) {
        if (Strings.isNullOrEmpty(text)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Выбрасывает исключение <code>IllegalArgumentException</code>, если коллекция пуста или равна null
     * @param collection коллекция
     * @param message сообщение
     */
    public static void notEmpty(Collection collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Выбрасывает исключение <code>IllegalArgumentException</code>, если массив пуст или равен null
     * @param objects массив
     * @param message сообщение
     */
    public static void notEmpty(Object[] objects, String message) {
        if (objects == null || objects.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Выбрасывает исключение <code>IllegalOperationException</code>
     * @param code код ошибки
     */
    public static void fail(String code) {
        that(false, code, () -> code);
    }

    /**
     * Выбрасывает исключение <code>IllegalOperationException</code>
     * @param code код ошибки
     * @param message сообщение
     */
    public static void fail(String code, String message) {
        that(false, code, () -> message);
    }

    /**
     * Выбрасывает исключение <code>IllegalOperationException</code>, если condition = false
     * @param condition состояние
     * @param code код ошибки
     */
    public static void that(boolean condition, String code) {
        that(condition, code, () -> code);
    }

    /**
     * Выбрасывает исключение <code>IllegalOperationException</code>, если condition = false
     * @param condition состояние
     * @param code код ошибки
     * @param message сообщение
     */
    public static void that(boolean condition, String code, String message) {
        that(condition, code, () -> message);
    }

    /**
     * Выбрасывает исключение <code>IllegalOperationException</code>, если condition = false
     * @param condition состояние
     * @param code код ошибки
     * @param messageSupplier сообщение в формате <code>Supplier</code>
     */
    public static void that(boolean condition, String code, Supplier<String> messageSupplier) {
        if (!condition) {
            throw new IllegalOperationException(code, messageSupplier.get());
        }
    }
}
