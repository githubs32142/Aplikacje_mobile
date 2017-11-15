package com.example.android.apk001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LDSActivity extends AppCompatActivity {
    Button btncnt2,btnmincnt,btnSet,button9;
    EditText cntET2,setET3;
    int sum,cnt;
    TextView viwe00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lds);
        btncnt2=(Button)findViewById(R.id.btnaddcnt);
        btnmincnt=(Button)findViewById(R.id.btnmincnt);
        btnSet=(Button)findViewById(R.id.btnSet);
        button9=(Button)findViewById(R.id.button9);
        cntET2=(EditText)findViewById(R.id.cntET2);
        setET3=(EditText)findViewById(R.id.setET3);
        viwe00=(TextView)findViewById(R.id.viwe00);
        btncnt2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           cnt=Integer.parseInt(cntET2.getText().toString());
                                           sum=Integer.parseInt(viwe00.getText().toString());
                                           sum+=cnt;
                                           viwe00.setText(String.valueOf(sum));
                                       }
                                   }
        );
        btnmincnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt=Integer.parseInt(cntET2.getText().toString());
                sum=Integer.parseInt(viwe00.getText().toString());
                if(sum>0){
                    sum-=cnt;
                    viwe00.setText(String.valueOf(sum));
                }

            }
        });
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt=Integer.parseInt(setET3.getText().toString());
                viwe00.setText(String.valueOf(cnt));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viwe00.setText("0");
                cntET2.setText("1");
                setET3.setText("0");
            }
        });
    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("keyName", String.valueOf(sum));
        setResult(RESULT_OK, intent);
        finish();
    }

}
