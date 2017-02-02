package com.example.android.androidinteractionviews.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.android.androidinteractionviews.R;

/**
 * Created by CMD on 2/1/17.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_container);

        //Shows action bar navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getFragment();

    }
    /** this function change the views**/

    public void getFragment(){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentInsertComplement fragmentInsertComplement = new FragmentInsertComplement();
        fragmentTransaction.add(R.id.fragment_container, fragmentInsertComplement);
        fragmentTransaction.commit();

    }

    /** Return to the home options **/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
