package dev.code.java;

/**
 * Created by shreeprakash on 12/21/15.
 */
public interface GenericInterface<T> {
    T apply(T arg1, T arg2);

    int verify(int arg1, T arg2);
}
