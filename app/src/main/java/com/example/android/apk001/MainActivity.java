package com.example.android.apk001;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bs1,bs2,bAkt1,btwa3;
    EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bs1=(Button)findViewById(R.id.bs1);
        bs2=(Button)findViewById(R.id.bs2);
        bAkt1=(Button)findViewById(R.id.bAktuwnosc2);
        btwa3=(Button)findViewById(R.id.btwa3);
        ed2= (EditText)findViewById(R.id.eImie);
        bAkt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,StrActivity.class);
                startActivity(int2);
            }
        });

        btwa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this,DaneActivity.class);
                int3.putExtra("Imie",ed2.getText().toString());
                startActivity(int3);
            }
        });

    }
    public void bs1Click(View v){
        Uri uri = Uri.parse("http://www.pwste.edu.pl");
        Intent int1= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(int1);
    }
    public void bs2Click(View v){
        Uri uri = Uri.parse("http://"+((EditText)findViewById(R.id.editText)).getText());
        Intent int1= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(int1);
    }
}
