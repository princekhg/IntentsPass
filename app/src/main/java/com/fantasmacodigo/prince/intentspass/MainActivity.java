package com.fantasmacodigo.prince.intentspass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    final int random=(int)(Math.random()*10000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text_random);
       final Bundle extra=getIntent().getExtras();
        if(extra == null)
        {
           text.setText(String.valueOf(random));
        }
         else
        {
            int val=extra.getInt("randomval");
            text.setText(String.valueOf(val));
        }



       Button btn_click=findViewById(R.id.btn_to_B);
       btn_click.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),ActivitySecond.class);
               i.putExtra("randomval",random);
               startActivity(i);
               finish();
           }
       });

    }
}
