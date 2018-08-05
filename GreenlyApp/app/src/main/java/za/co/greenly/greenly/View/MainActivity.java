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
import android.widget.ImageButton;

import za.co.greenly.greenly.R;

public class MainActivity extends AppCompatActivity {

    ImageButton metal;
    ImageButton glass;
    ImageButton paper;
    ImageButton plastic;
    ImageButton carton;
    ImageButton batteries;

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
                }
                return true;
            }
        });

        setupImageButtons();
    }

    public void setupImageButtons() {
        metal = findViewById(R.id.imagebuttonMetal);
        glass = findViewById(R.id.imagebuttonGlass);
        paper = findViewById(R.id.imagebuttonPaper);
        plastic = findViewById(R.id.imagebuttonPlastic);
        carton = findViewById(R.id.imagebuttonCartons);
        batteries = findViewById(R.id.imagebuttonBatteries);

        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("metal");
            }
        });

        glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("glass");
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("paper");
            }
        });

        plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("plastic");
            }
        });

        batteries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("batteries");
            }
        });

        carton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaterialInfo("carton");
            }
        });
    }

    public void openMaterialInfo(String mid) {
        Intent intent = new Intent(this, FragmentActivity.class);
        intent.putExtra("MaterialID", mid);
        startActivity(intent);
    }


}
