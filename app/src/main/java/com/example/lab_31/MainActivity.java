package com.example.lab_31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView resultDisplay, solutionDisplay;
    MaterialButton clearButton, lBracketButton, rBracketButton;
    MaterialButton divideButton, multiplyButton, minusButton, plusButton, equalButton;
    MaterialButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    MaterialButton allClearButton, dotButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultDisplay = findViewById(R.id.resultDisplay);
        solutionDisplay = findViewById(R.id.solutionDisplay);

        assignId(clearButton, R.id.clearButton);
        assignId(lBracketButton, R.id.lBracketButton);
        assignId(rBracketButton, R.id.rBracketButton);
        assignId(divideButton, R.id.divideButton);
        assignId(multiplyButton, R.id.multiplyButton);
        assignId(minusButton, R.id.minusButton);
        assignId(plusButton, R.id.plusButton);
        assignId(equalButton, R.id.equalButton);
        assignId(Button0, R.id.button0);
        assignId(Button1, R.id.button1);
        assignId(Button2, R.id.button2);
        assignId(Button3, R.id.button3);
        assignId(Button4, R.id.button4);
        assignId(Button5, R.id.button5);
        assignId(Button6, R.id.button6);
        assignId(Button7, R.id.button7);
        assignId(Button8, R.id.button8);
        assignId(Button9, R.id.button9);
        assignId(allClearButton, R.id.allClearButton);
        assignId(dotButton, R.id.dotButton);
    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataCalculation = solutionDisplay.getText().toString();

        if(buttonText.equals("AC")){
            solutionDisplay.setText("");
            resultDisplay.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            solutionDisplay.setText(resultDisplay.getText());
            return;
        }
        if(buttonText.equals("C")){
            dataCalculation = dataCalculation.substring(0, dataCalculation.length()-1);
        } else {
            dataCalculation = dataCalculation + buttonText;
        }

        solutionDisplay.setText(dataCalculation);
        String finalResult = getResult(dataCalculation);
        if(!finalResult.equals("Err")) {
            resultDisplay.setText(finalResult);
        }
    }

    String getResult(String data){
        try{
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult = context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
            return finalResult;
        } catch (Exception e) {
            return "Err";
        }

    }
}