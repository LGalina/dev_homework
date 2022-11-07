package com.multithreading.homework;

public class Crystal {
private CrystalColorEnum colorEnum;

    public Crystal() {
    }

    public Crystal(CrystalColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public CrystalColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(CrystalColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    @Override
    public String toString() {
        return "Crystal{" +
                "colorEnum=" + colorEnum +
                '}';
    }
}
