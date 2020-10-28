package com.zoo.animal;
import com.zoo.exception.NegativeValueException;

public interface AniDo {
    public void doing();
    public void movable (int step) throws NegativeValueException;
}
