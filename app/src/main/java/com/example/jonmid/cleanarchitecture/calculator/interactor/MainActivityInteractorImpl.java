package com.example.jonmid.cleanarchitecture.calculator.interactor;

import com.example.jonmid.cleanarchitecture.calculator.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter mainActivityPresenter;

    public MainActivityInteractorImpl(MainActivityPresenter mainActivityPresenter) {
        this.mainActivityPresenter = mainActivityPresenter;
    }

    @Override
    public void sumar(String num1, String num2) {
        Integer result = Integer.valueOf(num1) + Integer.valueOf(num2);
        mainActivityPresenter.showResult(String.valueOf(result));
    }
}
