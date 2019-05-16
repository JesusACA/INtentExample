package mx.itson.practicaintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Bundle b = getIntent().getExtras();
        String nombre = b.getString("nombre");

        Toast.makeText(this, nombre, Toast.LENGTH_LONG).show();
    }


}
