package za.co.greenly.greenly.View;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.greenly.greenly.R;

public class QRScanning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanning);
        stimulateSomeWork();
    }
    private void stimulateSomeWork() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.scan_successful);
        builder.setPositiveButton(R.string.scan_view_points, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent mainIntent = new Intent(getApplicationContext(), Rewards.class);
                startActivity(mainIntent);
                finish();
            }
        });
        builder.setNegativeButton(R.string.scan_done, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
