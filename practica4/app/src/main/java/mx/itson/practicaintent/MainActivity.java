package mx.itson.practicaintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.btnAceptar)).setOnClickListener(this);
    }

    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this, "Su mensaje ha sido enviado", Toast.LENGTH_SHORT).show();

    }


    public void onClick(final View v){
        switch (v.getId()){
            case R.id.btnAceptar:{

                String Correo = ((EditText)findViewById(R.id.txtCorreo)).getText().toString();
                String Asunto = ((EditText)findViewById(R.id.txtAsunto)).getText().toString();
                String Mensaje = ((EditText)findViewById(R.id.txtMensaje)).getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{Correo});
                intent.putExtra(Intent.EXTRA_SUBJECT, Asunto);
                intent.putExtra(Intent.EXTRA_TEXT, Mensaje);


                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }

                break;
        }




    }


}
