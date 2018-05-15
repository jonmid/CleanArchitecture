package com.example.jonmid.cleanarchitecture.calculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jonmid.cleanarchitecture.R;
import com.example.jonmid.cleanarchitecture.calculator.presenter.MainActivityPresenter;
import com.example.jonmid.cleanarchitecture.calculator.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private MainActivityPresenter mainActivityPresenter;
    private EditText editTextNum1;
    private EditText editTextNum2;
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityPresenter = new MainActivityPresenterImpl(this);

        editTextNum1 = (EditText) findViewById(R.id.id_edt_number1);
        editTextNum2 = (EditText) findViewById(R.id.id_edt_number2);
        textViewMsg = (TextView) findViewById(R.id.id_tv_message);
    }

    @Override
    public void showResult(String result) {
        textViewMsg.setText(result);
    }

    @Override
    public void showError(String error) {

    }

    public void onClickSuma(View view){
        mainActivityPresenter.sumar(editTextNum1.getText().toString(), editTextNum2.getText().toString());
    }
}
