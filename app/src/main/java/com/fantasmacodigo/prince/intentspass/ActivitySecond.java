package com.fantasmacodigo.prince.intentspass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
      TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=findViewById(R.id.text_random);

        final Bundle extra=getIntent().getExtras();
        final int random=(int)(Math.random()*10000);
        if(extra==null)
        {
        }
        else {
            int val = extra.getInt("randomval", 0);
            text.setText(String.valueOf(val));
          }
          Button btn_click=findViewById(R.id.btn_to_A);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivitySecond.this,MainActivity.class);
                   intent.putExtra("randomval",random);
                startActivity(intent);
                finish();
            }
        });
    }
}
