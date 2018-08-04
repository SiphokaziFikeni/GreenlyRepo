package za.co.greenly.greenly.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import za.co.greenly.greenly.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar settingsToolbar = (Toolbar) findViewById(R.id.settingsToolbar);
        setSupportActionBar(settingsToolbar);
        settingsToolbar.setVisibility(View.VISIBLE);
        getSupportActionBar().setTitle("Settings");
        settingsToolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
    }
}
