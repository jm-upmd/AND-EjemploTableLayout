package com.example.ejemplotablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Views del layout
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        final TextView textView = findViewById(R.id.textView);



        // Crea listener para los bototones.
        // Escribe en el TextView la letra de botón pulsado

        View.OnClickListener elListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(((TextView) view).getText());
            }
        };


        // Creamos listeners para los botones

        for(int fila = 0 ; fila < tableLayout.getChildCount(); fila++){
            TableRow rowLayout = (TableRow) tableLayout.getChildAt(fila);
            int numBotonesFila = rowLayout.getChildCount();
            for(int posBoton = 0; posBoton < numBotonesFila; posBoton++){
                Button boton = (Button) rowLayout.getChildAt(posBoton);
                boton.setOnClickListener(elListener);
            }
        }

    }
}
