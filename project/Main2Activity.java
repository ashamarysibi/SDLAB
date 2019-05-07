package com.example.android.e_contact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2;

    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.ts1);
        t2=(TextView)findViewById(R.id.ts2);
        b1=(Button)findViewById(R.id.call);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				String url=t2.getText.toString();
                
                Intent in=new Intent(Intent.ACTION_DIAL, Uri.parse("url"));
                startActivity(in);
            }
        });

        String t=getIntent().getStringExtra("name");
        String ss=getIntent().getStringExtra("des");


        t1.setText(t);

        t2.setText(ss);


    }
}
