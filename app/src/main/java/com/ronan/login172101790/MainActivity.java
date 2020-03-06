package com.ronan.login172101790;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText idEditText;
    private EditText sandiEditText;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEditText = (EditText)findViewById(R.id.idEditText);
        sandiEditText = (EditText)findViewById(R.id.sandiEditText);
        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = idEditText.getText().toString();
                if(id.length() == 0){
                    Toast.makeText(getApplicationContext(),"ID belum diisi", Toast.LENGTH_LONG).show();
                    return;
                }

                String sandi = sandiEditText.getText().toString();
                if (sandi.length() == 0){
                    Toast.makeText(getApplicationContext(),"Sandi belum diisi", Toast.LENGTH_LONG).show();
                    return;
                }

                if (id.equals("andi")){
                    if (sandi.equals("123")){
                        Toast.makeText(getApplicationContext(), "Selamat datang, " + id + " !", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Sandi anda salah !", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "ID : " + id + " tidak ditemukan !", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
