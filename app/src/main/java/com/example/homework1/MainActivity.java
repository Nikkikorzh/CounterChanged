package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private EditText input;
    private Button b1;
    private Button b2;
    private MainViewModel mainViewModel;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView); // Проинициализируем textView
        textView2 = findViewById(R.id.textView2);
        input = findViewById(R.id.input);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        textView2.setText(Integer.toString(mainViewModel.getClicks()));
        if (mainViewModel.checkZero() == true) {
            textView2.setText("empty");
        }

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.setClicks();
                textView2.setText(Integer.toString(mainViewModel.getClicks()));
            }
        });

        textView.setText(mainViewModel.getName());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = "Добро пожаловать, " + input.getText();
                textView.setText(newText);
                mainViewModel.setName(newText);
            }
        });

    }
}