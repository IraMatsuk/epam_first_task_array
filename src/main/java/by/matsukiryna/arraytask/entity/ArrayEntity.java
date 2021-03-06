package by.matsukiryna.arraytask.entity;

import by.matsukiryna.arraytask.exception.ArrayException;

import java.util.Arrays;

public class ArrayEntity {
    private int[] arrayEntity;

    public ArrayEntity() {
    }

    public ArrayEntity(int...arrayEntity) throws ArrayException {
        this.arrayEntity = arrayEntity;
    }

    public int[] getArrayEntity() {
        return Arrays.copyOf(arrayEntity, arrayEntity.length);
    }

    public void setArrayEntity(int[] arrayEntity) {
        this.arrayEntity = Arrays.copyOf(arrayEntity, arrayEntity.length);
    }

    public int getLength() {
        return arrayEntity.length;
    }

    public int getElementByIndex(int index) throws ArrayException {
        if (index < 0 || index > arrayEntity.length) {
            throw new ArrayException("Index: " + index + " is out of range.");
        }
        return arrayEntity[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayEntity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        ArrayEntity inputObject = (ArrayEntity) o;
        if (getLength() != inputObject.getLength()) {
            return false;
        }
        for (int i = 0; i < inputObject.getLength(); i++) {
            try {
                if (getElementByIndex(i) != inputObject.getElementByIndex(i)) {
                    return false;
                }
            } catch (ArrayException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayEntity);
    }
}
