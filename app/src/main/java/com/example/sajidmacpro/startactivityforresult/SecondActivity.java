package com.example.sajidmacpro.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sajidMacPro on 3/2/16.
 */
public class SecondActivity extends AppCompatActivity {
    EditText edtText1;
    Button btnSendResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtText1=(EditText)findViewById(R.id.edtText1);
        btnSendResult=(Button)findViewById(R.id.btnSendResult);
        btnSendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("message",edtText1.getText().toString());
                setResult(2,intent);
                finish();
            }
        });


    }
}
