package za.co.greenly.greenly.View;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.greenly.greenly.R;

public class Scanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        stimulateSomeWork();
    }
    private void stimulateSomeWork() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Scanner.this, QRScanning.class));
                finish();
            }
        }, 3000);
    }
}
