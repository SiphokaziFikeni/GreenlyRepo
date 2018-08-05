package za.co.greenly.greenly.View;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import za.co.greenly.greenly.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);
        mainToolbar.setVisibility(View.VISIBLE);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("GREENLY");
        }
        mainToolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()) {
                    case R.id.settings:
                        Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                        startActivity(settingsIntent);
                        break;
                    case R.id.scan:
                        Intent scanIntent = new Intent(MainActivity.this, Scanner.class);
                        startActivity(scanIntent);
                        break;
                }
                return true;
            }
        });
    }
}
