package it21525.dit.hua.gr.thirdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userId = findViewById(R.id.user_id);
        final Button button = findViewById(R.id.show);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = userId.getText().toString();

                Intent i = new Intent();
                i.putExtra("user", id);
                i.setClassName("it21525.dit.hua.gr.thirdapp", "it21525.dit.hua.gr.thirdapp.MapsActivity");
                startActivity(i);
            }
        });
    }
}
