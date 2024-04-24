package com.example.cardviewchakeble;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    MaterialCardView cardTaj, cardUnivercity, cardLouts;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardTaj = findViewById(R.id.cardTajMahal);
        cardUnivercity = findViewById(R.id.cardStatueOfUnity);
        cardLouts = findViewById(R.id.cardLotusTemple);
        button = findViewById(R.id.btnWhatsSelected);

        // Implementing the long click listener for when pressed on card view
        cardTaj.setOnLongClickListener(view -> {
            // If the card view is checked, make it unchecked and vice-versa
            cardTaj.setChecked(!cardTaj.isChecked());
            return true;
        });

        // Implementing the long click listener for when pressed on card view
        cardUnivercity.setOnLongClickListener(view -> {
            cardUnivercity.setChecked(!cardUnivercity.isChecked());
            return true;
        });

        // Implementing the long click listener for when pressed on card view
        cardLouts.setOnLongClickListener(view -> {
            cardLouts.setChecked(!cardLouts.isChecked());
            return true;
        });

        button.setOnClickListener(view -> {
            // Getting the info about which card view has been selected
            String msg = "";
            if (cardTaj.isChecked()) {
                msg += "'Taj Mahal' ";
            }
            if (cardUnivercity.isChecked()) {
                msg += "'Statue Of Unity' ";
            }
            if (cardLouts.isChecked()) {
                msg += "'Lotus Temple' ";
            }
            // Snackbar is just like a toast message
            Snackbar.make(view, msg + "Selected", Snackbar.LENGTH_LONG).show();
        });
    }
}
