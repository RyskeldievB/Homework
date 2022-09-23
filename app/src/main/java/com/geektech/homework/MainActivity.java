package com.geektech.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView zabyl = findViewById(R.id.zabyl);
        TextView regis = findViewById(R.id.regis);
        TextView pText = findViewById(R.id.p_text);
        TextView text = findViewById(R.id.text);
        TextView vhod = findViewById(R.id.vhod);
        TextView najmy = findViewById(R.id.najmy);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bottom);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable ) {
                if (email.getText().toString().equals("")){
                    button.setBackgroundColor(Color.GRAY);
                }else {
                    button.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                    zabyl.setVisibility(View.GONE);
                    regis.setVisibility(View.GONE);
                    pText.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    najmy.setVisibility(View.GONE);
                }else{
                    Toast.makeText(MainActivity.this, "Вы ввели не првильный Gmail или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}