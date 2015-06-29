package com.android_montreal.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.android_montreal.databindingdemo.model.Person;
import com.android_montreal.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    Person person ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        person = new Person("Etienne","Caron", 94.5f, 41);
        binding.setPerson(person);

    }

    public void onButtonClick(View view) {
        person.setAge(person.getAge() + 1);
    }

}
