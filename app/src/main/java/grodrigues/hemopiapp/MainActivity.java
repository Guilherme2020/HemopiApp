package grodrigues.hemopiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import grodrigues.hemopiapp.model.RegistroDoadores;

public class MainActivity extends AppCompatActivity {
    private EditText edNome;
    private EditText edSexo;
    private RegistroDoadores doador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onCreateContextMenu(){

    }
    @Override
    protected  void onResume(){
        super.onResume();
    }


    public void   novoDoador(View view){

    }
}
