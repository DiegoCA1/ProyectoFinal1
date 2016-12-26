package com.example.diego.proyectofinal;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalleContacto extends AppCompatActivity {
    TextView tvtelefono;
    TextView tvemail;
    TextView NombreP;
    TextView fechan;
    TextView descrp;
    Button editardatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);


        Bundle parametros = getIntent().getExtras();//recibe los parametros
        final String nombre = parametros.getString(getResources().getString(R.string.ppnombre));
        String telefono = parametros.getString(getResources().getString(R.string.pptelefono));
        String email = parametros.getString(getResources().getString(R.string.ppemail));
        String Fechanacimiento = parametros.getString(getResources().getString(R.string.ppfechanacimiento));
        String descripcion = parametros.getString(getResources().getString(R.string.ppdescripcion));

        NombreP = (TextView) findViewById(R.id.nombrepersona);
        tvtelefono = (TextView) findViewById(R.id.telefono);
        tvemail = (TextView) findViewById(R.id.EmailF);
        fechan=(TextView)findViewById(R.id.fechanacimientoFF);
        tvtelefono=(TextView)findViewById(R.id.telefonoF);
        descrp=(TextView)findViewById(R.id.descripcionF);


        NombreP.setText(nombre);
      tvtelefono.setText(telefono);
        tvemail.setText(email);
        fechan.setText(Fechanacimiento);
        descrp.setText(descripcion);

        editardatos=(Button)findViewById(R.id.editardatos);
        editardatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* takeKeyEvents(K);
                Intent intent=new Intent(DetalleContacto.this,MainActivity.class);
                intent.putExtra(getResources().getString(R.string.pppnombre),nombre.toString());
                startActivity(intent);*/
                onBackPressed();
            }
        });



    }
}
