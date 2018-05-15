package com.example.jonmid.cleanarchitecture.calculator.presenter;

public interface MainActivityPresenter {
    // los metodos que van a estarse llamando desde la vista hasta la interaccion
    void showResult(String result); //view
    void showError(String error); //view
    void sumar(String num1, String num2); //interactor
}
