package com.example.jonmid.cleanarchitecture.calculator.presenter;

import com.example.jonmid.cleanarchitecture.calculator.interactor.MainActivityInteractor;
import com.example.jonmid.cleanarchitecture.calculator.interactor.MainActivityInteractorImpl;
import com.example.jonmid.cleanarchitecture.calculator.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView mainActivityView;
    private MainActivityInteractor mainActivityInteractor;

    public MainActivityPresenterImpl(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
        mainActivityInteractor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void showResult(String result) {
        mainActivityView.showResult(result);
    }

    @Override
    public void showError(String error) {
        mainActivityView.showError(error);
    }

    @Override
    public void sumar(String num1, String num2) {
        mainActivityInteractor.sumar(num1, num2);
    }
}
