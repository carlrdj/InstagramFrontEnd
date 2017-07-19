package com.rdj.carl.instagram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rdj.carl.instagram.view.ContainerActivity;
import com.rdj.carl.instagram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goToLogin(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
    public void goToPage(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz"));
        startActivity(intent);
    }
}
