package com.example.android.apk001;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class DaneActivity extends AppCompatActivity {
    TextView txtV1;
    Button btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dane);
        txtV1= (TextView)findViewById(R.id.tWynik);

        txtV1.setText(getIntent().getStringExtra("Imie"));
        btnEnd= (Button)findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
