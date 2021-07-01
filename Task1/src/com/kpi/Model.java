package com.kpi;

public class Model {

    // fields

    private String _firstPart;
    private String _secondPart;

    // constructors

    public Model() {
        _firstPart = "empty";
        _secondPart = "empty";
    }

    public Model(String firstPart, String secondPart) {
        _firstPart = firstPart;
        _secondPart = secondPart;
    }

    // getters & setters

    public String getFirstPart() {
        return _firstPart;
    }

    public void setFirstPart(String firstPart) {
        _firstPart = firstPart;
    }

    public String getSecondPart() {
        return _secondPart;
    }

    public void setSecondPart(String secondPart) {
        _secondPart = secondPart;
    }

    // other methods

    public String concat() {
        return _firstPart + ", " + _secondPart;
    }

    // override to string

    @Override
    public String toString() {
        return concat();
    }
}
