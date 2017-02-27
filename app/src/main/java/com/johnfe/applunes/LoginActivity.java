package com.johnfe.applunes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText clave;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.txtUsuario);
        clave = (EditText) findViewById(R.id.txtClave);
        login = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(usuario.getText());
                System.out.println(clave.getText());
                if(usuario.getText().toString().equalsIgnoreCase("admin") && clave.getText().toString().equalsIgnoreCase("1234") ){

                    Toast.makeText(getApplicationContext(),"contraseña correcta",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"contraseña y/o usuario incorrectos",Toast.LENGTH_SHORT).show();

                }
            }
        });









    }
}
