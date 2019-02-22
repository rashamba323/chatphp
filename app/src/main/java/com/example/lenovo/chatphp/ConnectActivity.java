package com.example.lenovo.chatphp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class ConnectActivity extends AppCompatActivity {



    Button connectButton;
    //EditText serverAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        connectButton = (Button) findViewById(R.id.button_connect_server);
        //serverAdress = (EditText) findViewById(R.id.ed_server_adress);
        final Intent intent = new Intent(this, MainActivity.class);





        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(intent);
            }
        });
    }

    public void setServerAdress(String adress){
    //    String adress = "192.168.100.2";
     //  String server_name = "http://"+ adress +"/";

    }
}
