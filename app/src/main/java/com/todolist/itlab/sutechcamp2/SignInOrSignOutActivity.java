package com.todolist.itlab.sutechcamp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignInOrSignOutActivity extends AppCompatActivity implements View.OnClickListener{

     public Button signIn;
    public Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_or_sign_out);

        signIn  = (Button) findViewById(R.id.SignIn);
        signOut =(Button) findViewById(R.id.SignOut);

        signIn.setOnClickListener( this);
        signIn.setOnClickListener( this);

    }
    public  void onClick(View v) {
        switch (v.getId()) {
            case R.id.SignIn:
                Toast.makeText(SignInOrSignOutActivity.this, "SignInp is clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignInOrSignOutActivity.this,SignInActivity.class);
                intent.putExtra("key", "Now you can login here");
                //End of passing value
                startActivity(intent);
                break;

            case R.id.SignOut:
                Toast.makeText(SignInOrSignOutActivity.this, "SignIn is clicked", Toast.LENGTH_SHORT).show();

                Intent intent2 = new Intent(SignInOrSignOutActivity.this, SignInOrSignOutActivity.class);
                intent2.putExtra("key", "Now you can login here");
                //End of passing value
                startActivity(intent2);
                break;
        }
    }

    public boolean onLongClick(View v) {
        switch (v.getId()) {
            case R.id.SignIn:
                Toast.makeText(SignInOrSignOutActivity.this, "SignIp is Long clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.SignOut:
                Toast.makeText(SignInOrSignOutActivity.this, "SignOut is Long clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}

