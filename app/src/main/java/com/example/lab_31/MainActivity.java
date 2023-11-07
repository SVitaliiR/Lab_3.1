package com.example.lab_31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView ResultDisplay, SolutionDisplay;
    MaterialButton ClearButton, LBracketButton, RBracketButton;
    MaterialButton DivideButton, MultiplyButton, MinusButton, PlusButton, EqualButton;
    MaterialButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    MaterialButton AllClearButton, DotButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ResultDisplay = findViewById(R.id.SolutionDisplay);
        SolutionDisplay= findViewById(R.id.SolutionDisplay);

        assignId(ClearButton, R.id.ClearButton);
        assignId(LBracketButton, R.id.LBracketButton);
        assignId(RBracketButton, R.id.RBracketButton);
        assignId(DivideButton, R.id.DivideButton);
        assignId(MultiplyButton, R.id.MultiplyButton);
        assignId(MinusButton, R.id.MinusButton);
        assignId(PlusButton, R.id.PlusButton);
        assignId(EqualButton, R.id.EqualButton);
        assignId(Button0, R.id.Button0);
        assignId(Button1, R.id.Button1);
        assignId(Button2, R.id.Button2);
        assignId(Button3, R.id.Button3);
        assignId(Button4, R.id.Button4);
        assignId(Button5, R.id.Button5);
        assignId(Button6, R.id.Button6);
        assignId(Button7, R.id.Button7);
        assignId(Button8, R.id.Button8);
        assignId(Button9, R.id.Button9);
        assignId(AllClearButton, R.id.AllClearButton);
        assignId(DotButton, R.id.DotButton);
    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}