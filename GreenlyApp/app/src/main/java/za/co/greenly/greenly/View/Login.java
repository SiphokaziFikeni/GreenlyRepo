package za.co.greenly.greenly.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import za.co.greenly.greenly.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //TODO: add authentication
    public void login(View view) {
        startActivity(new Intent(this, TermsAndConditionsActivity.class));
        finish();
    }
}
