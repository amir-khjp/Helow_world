package com.todolist.itlab.sutechcamp2;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class SignOut extends AppCompatActivity implements TextWatcher {

    EditText editText;

    Spinner days;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_out);
        days = (Spinner) findViewById(R.id.days);
        editText.addTextChangedListener(this);
        ArrayAdapter<Task> tasks;
        ArrayAdapter adutor= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,tasks);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        Log.d("",s.toString());
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
