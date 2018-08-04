package za.co.greenly.greenly.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import za.co.greenly.greenly.R;

public class TermsAndConditionsActivity extends AppCompatActivity {

    CheckBox mCheckBox;
    Button mStartRecyclingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);

        mCheckBox = findViewById(R.id.terms_checkBox);
        mStartRecyclingButton = findViewById(R.id.terms_button);

        mCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox)view).isChecked()) {
                    mStartRecyclingButton.setEnabled(true);
                    mStartRecyclingButton.setBackground(getResources().getDrawable(R.drawable.default_button_rounded_corners, getTheme()));

                } else {
                    mStartRecyclingButton.setEnabled(false);
                    mStartRecyclingButton.setBackground(getResources().getDrawable(R.drawable.default_button_disabled_drawable, getTheme()));
                }
            }
        });
    }

    public void acceptTermsAndConditions(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
