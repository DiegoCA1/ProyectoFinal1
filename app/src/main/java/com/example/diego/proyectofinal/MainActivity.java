package com.example.diego.proyectofinal;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.icu.util.Calendar;

import android.icu.util.Calendar;
import java.util.ArrayList;


import static android.icu.util.Calendar.MONTH;
import static android.icu.util.Calendar.getInstance;

public class MainActivity extends AppCompatActivity {
   /* Button fecha;
    DatePicker dia;
    int a,m,d;*/
   private int año;
   private int mes;
   private int dia;
    private TextInputEditText nombre;
    private TextInputEditText telefono;
    private TextInputEditText email;
    private TextInputEditText descripcion;


    private String campofecha="";
    private Button botonfecha;
    private static final int TIPO_DIALOG=0;
    private static DatePickerDialog.OnDateSetListener oyenteselectorfecha;
    private Button siguiente;
persona personapp;



    String nombrecc;



    ArrayList<persona> p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // Calendar calendario=Calendar.getInstance();

       // DatePickerDialog dpd=new DatePickerDialog(this,mdpd,a,m,d);
        //dpd.show();

       /* dia=(DatePicker) findViewById(R.id.listdiafecha);
    fecha=(Button) findViewById(R.id.boton1);
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"El dia seleccionado es" +dia.getMonth() +"/" +dia.getDayOfMonth()+
                        "/"+dia.getYear(),Toast.LENGTH_LONG).show();
            }
        });
*/
        //TextInputEditText nombrec=(TextInputEditText)findViewById(R.id.nombrec);







      nombre=(TextInputEditText) findViewById(R.id.nombrec);
        telefono =(TextInputEditText) findViewById(R.id.telefono);
        email=(TextInputEditText) findViewById(R.id.email);
        descripcion=(TextInputEditText) findViewById(R.id.descp);



    // campofecha=(EditText)findViewById(R.id.campofecha);
        botonfecha=(Button)findViewById(R.id.boton1);
       //if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N)
       if(android.os.Build.VERSION.SDK_INT >= 24)
       {
            Calendar calendario= Calendar.getInstance();
            año=calendario.get(Calendar.YEAR);
            mes=calendario.get(Calendar.MONTH);
            dia=calendario.get(Calendar.DAY_OF_MONTH);
         //   mostrarfecha();
            oyenteselectorfecha=new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    año=year;
                    mes=month;
                    dia=dayOfMonth;
                    mostrarfecha();
               //     campofecha=""+año;
                    Snackbar.make(view,""+año, Snackbar.LENGTH_LONG).show();

                }

            };

       }



        //p=new ArrayList<persona>();
       // String nombrecc=nombre.getText().toString();
        /* nombrecc=nombre.getText().toString();
        String tel=telefono.getText().toString();
        String emaill=email.getText().toString();
        String desc=descripcion.getText().toString();
        String fecha=campofecha.toString();
        //p.add(new persona(nombrecc,tel,emaill,desc,fecha));
        personapp=new persona(nombrecc,tel,emaill,desc,fecha);
*/
     /*   ArrayList<String>nombresp=new ArrayList<>();

        for (persona pp:p   ) {
            nombresp.add(pp.getNombre());

        }
*/
        siguiente=(Button) findViewById(R.id.siguiente);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //p=new ArrayList<persona>();
                // String nombrecc=nombre.getText().toString();
                nombrecc=nombre.getText().toString();
                String tel=telefono.getText().toString();
                String emaill=email.getText().toString();
                String desc=descripcion.getText().toString();
                mostrarfecha();
                String fecha=campofecha.toString();

                //p.add(new persona(nombrecc,tel,emaill,desc,fecha));
                personapp=new persona(nombrecc,tel,emaill,fecha,desc);





                Intent intent=new Intent(MainActivity.this,DetalleContacto.class);
               intent.putExtra(getResources().getString(R.string.ppnombre),personapp.getNombre());
                intent.putExtra(getResources().getString(R.string.ppfechanacimiento),personapp.getFecha());
                intent.putExtra(getResources().getString(R.string.pptelefono),personapp.getTelefono());
                intent.putExtra(getResources().getString(R.string.ppemail),personapp.getEmail());
                intent.putExtra(getResources().getString(R.string.ppdescripcion),personapp.getDescripcion());
               // Snackbar.make(v, getResources().getString(nombrecc),Snackbar.LENGTH_LONG).show();
                startActivity(intent);





            }
        });




    }






    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id)
        {
            case 0:
                return new DatePickerDialog(this,oyenteselectorfecha,año,mes,dia);


        }
        return null;
    }
    public void mostrarcalendario(View control)
    {
        showDialog(TIPO_DIALOG);
        //Snackbar.make(control,""+año, Snackbar.LENGTH_LONG).show();

    }

    public void mostrarfecha()
    {
        campofecha=""+año+"/"+mes+"/"+dia;
       // campofecha.setText(año+"/"+mes+"/"+dia);
        //nombre.setText(año+"/"+mes+"/"+dia);


    }



}
