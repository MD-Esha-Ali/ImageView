package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button ButtonToastId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonToastId=(Button) findViewById(R.id.LoginButton);
        ButtonToastId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=getLayoutInflater();

                View coustomView = inflater.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.CustomToastId));
                Toast toast=new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(coustomView);
                toast.show();
            }
        });
    }
}