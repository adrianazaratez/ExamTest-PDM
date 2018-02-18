package com.example.adriana.examtest;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup colorGroup;
    Button small;
    Button medium;
    Button large;
    Button xlarge;
    Button addCart;
    RadioButton gris,rosa,negro,cafe;
    boolean pulsadoS,pulsadoM,pulsadoL,pulsadoXL,pulsadoGris,pulsadoRosa,pulsadoNegro,pulsadoCafe,cartPulsado;
    int likes = 0;
    private static final String PULSADOs = "pulsados";
    private static final String PULSADOm = "pulsadom";
    private static final String PULSADOl = "pulsadol";
    private static final String PULSADOxl = "pulsadoxl";
    private static final String PULSADOg = "pulsadog";
    private static final String PULSADOr = "pulsador";
    private static final String PULSADOn = "pulsadon";
    private static final String PULSADOc = "pulsadoc";
    private static final String BUTTON_TEXT = "pulsadoc";
    private static final String LIKES = "likes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        small = findViewById(R.id.activity_main_buttonS);
        medium = findViewById(R.id.activity_main_buttonM);
        large = findViewById(R.id.activity_main_buttonL);
        xlarge = findViewById(R.id.activity_main_buttonXL);
        addCart = findViewById(R.id.activity_main_addtocart);

        gris = findViewById(R.id.gris);
        rosa = findViewById(R.id.rosa);
        cafe = findViewById(R.id.cafe);
        negro = findViewById(R.id.negro);

        cafe.setChecked(true);

        restaurarCampos(savedInstanceState);

        if (pulsadoS) {
            small.setTextColor(getResources().getColor(R.color.colorWhite));
            small.setBackground(getDrawable(R.drawable.button_selected));
        } else if (pulsadoM) {
            medium.setTextColor(getResources().getColor(R.color.colorWhite));
            medium.setBackground(getDrawable(R.drawable.button_selected));
        } else if (pulsadoL) {
            large.setTextColor(getResources().getColor(R.color.colorWhite));
            large.setBackground(getDrawable(R.drawable.button_selected));
        } else if (pulsadoXL) {
            xlarge.setTextColor(getResources().getColor(R.color.colorWhite));
            xlarge.setBackground(getDrawable(R.drawable.button_selected));
        } else {

        }

        if (pulsadoGris) {
            gris.setChecked(true);
        } else if (pulsadoRosa) {
           rosa.setChecked(true);
        } else if (pulsadoNegro) {
         negro.setChecked(true);
        } else if (pulsadoCafe) {
            cafe.setChecked(true);
        } else {

        }

        if(cartPulsado){
            addCart.setText(getResources().getString(R.string.toast_added));
        }


        colorGroup = findViewById(R.id.activity_main_colorButtons);
    }

    public void onClickAdd(View v) {
        cartPulsado = true;
        if(addCart.getText().equals(getResources().getString(R.string.toast_added))){
            Toast.makeText(this, getResources().getString(R.string.already_added), Toast.LENGTH_LONG).show();
        }
        addCart.setText(getResources().getString(R.string.toast_added));
        Snackbar.make(v, getResources().getString(R.string.toast_added), Snackbar.LENGTH_LONG)
                .setActionTextColor(getResources().getColor(R.color.colorGray))
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addCart.setText(getResources().getString(R.string.button_cart));
                        cartPulsado = false;
                    }
                }).show();
    }

    public void onClickLike(View v) {
        likes++;
        String likess = String.valueOf(likes);
        Toast.makeText(this, likess + " " + getResources().getText(R.string.toastLikes), Toast.LENGTH_LONG).show();
    }

    public void buttonSizeClicked(View v) {
        if (v.getId() == small.getId()) {
            small.setTextColor(getResources().getColor(R.color.colorWhite));
            small.setBackground(getDrawable(R.drawable.button_selected));
            medium.setTextColor(getResources().getColor(R.color.colorPrimary));
            medium.setBackground(getDrawable(R.drawable.button_style));
            large.setTextColor(getResources().getColor(R.color.colorPrimary));
            large.setBackground(getDrawable(R.drawable.button_style));
            xlarge.setTextColor(getResources().getColor(R.color.colorPrimary));
            xlarge.setBackground(getDrawable(R.drawable.button_style));
            pulsadoS = true;
            pulsadoM = false;
            pulsadoL = false;
            pulsadoXL = false;
        } else if (v.getId() == medium.getId()) {
            medium.setTextColor(getResources().getColor(R.color.colorWhite));
            medium.setBackground(getDrawable(R.drawable.button_selected));
            small.setTextColor(getResources().getColor(R.color.colorPrimary));
            small.setBackground(getDrawable(R.drawable.button_style));
            large.setTextColor(getResources().getColor(R.color.colorPrimary));
            large.setBackground(getDrawable(R.drawable.button_style));
            xlarge.setTextColor(getResources().getColor(R.color.colorPrimary));
            xlarge.setBackground(getDrawable(R.drawable.button_style));
            pulsadoS = false;
            pulsadoM = true;
            pulsadoL = false;
            pulsadoXL = false;
        } else if (v.getId() == large.getId()) {
            large.setTextColor(getResources().getColor(R.color.colorWhite));
            large.setBackground(getDrawable(R.drawable.button_selected));
            small.setTextColor(getResources().getColor(R.color.colorPrimary));
            small.setBackground(getDrawable(R.drawable.button_style));
            medium.setTextColor(getResources().getColor(R.color.colorPrimary));
            medium.setBackground(getDrawable(R.drawable.button_style));
            xlarge.setTextColor(getResources().getColor(R.color.colorPrimary));
            xlarge.setBackground(getDrawable(R.drawable.button_style));
            pulsadoS = false;
            pulsadoM = false;
            pulsadoL = true;
            pulsadoXL = false;
        } else {
            xlarge.setTextColor(getResources().getColor(R.color.colorWhite));
            xlarge.setBackground(getDrawable(R.drawable.button_selected));
            small.setTextColor(getResources().getColor(R.color.colorPrimary));
            small.setBackground(getDrawable(R.drawable.button_style));
            medium.setTextColor(getResources().getColor(R.color.colorPrimary));
            medium.setBackground(getDrawable(R.drawable.button_style));
            large.setTextColor(getResources().getColor(R.color.colorPrimary));
            large.setBackground(getDrawable(R.drawable.button_style));
            pulsadoS = false;
            pulsadoM = false;
            pulsadoL = false;
            pulsadoXL = true;
        }

    }

    private void restaurarCampos(Bundle savedInstanceState){

        // Si hay algo en el bundle, es que se ha guardado algo y lo recuperaremos
        if (savedInstanceState != null) {
            if (savedInstanceState.getBoolean(PULSADOs, false)){
                this.pulsadoS = savedInstanceState.getBoolean(PULSADOs);
            }else if (savedInstanceState.getBoolean(PULSADOm, false)){
                this.pulsadoM = savedInstanceState.getBoolean(PULSADOm);
            }else if (savedInstanceState.getBoolean(PULSADOl, false)){
                this.pulsadoL = savedInstanceState.getBoolean(PULSADOl);
            }else if (savedInstanceState.getBoolean(PULSADOxl, false)){
                this.pulsadoXL = savedInstanceState.getBoolean(PULSADOxl);
            }

            if(savedInstanceState.getBoolean(PULSADOg, false)){
                this.pulsadoGris = savedInstanceState.getBoolean(PULSADOg);
            }else if (savedInstanceState.getBoolean(PULSADOr, false)){
                this.pulsadoRosa = savedInstanceState.getBoolean(PULSADOr);
            }else if (savedInstanceState.getBoolean(PULSADOn, false)){
                this.pulsadoNegro = savedInstanceState.getBoolean(PULSADOn);
            }else if (savedInstanceState.getBoolean(PULSADOc, false)){
                this.pulsadoCafe = savedInstanceState.getBoolean(PULSADOc);
            }

            if(savedInstanceState.getInt(LIKES)!= 0){
                this.likes = savedInstanceState.getInt(LIKES);
            }

            if (savedInstanceState.getBoolean(BUTTON_TEXT, false)){
                this.cartPulsado = savedInstanceState.getBoolean(BUTTON_TEXT);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (pulsadoS){
            outState.putBoolean(PULSADOs, pulsadoS);
        }else if(pulsadoM){
            outState.putBoolean(PULSADOm, pulsadoM);
        }else if(pulsadoL){
            outState.putBoolean(PULSADOl, pulsadoL);
        }else if(pulsadoXL){
            outState.putBoolean(PULSADOxl, pulsadoXL);
        }else{

        }

        if (pulsadoGris){
            outState.putBoolean(PULSADOg, pulsadoGris);
        }else if(pulsadoRosa){
            outState.putBoolean(PULSADOr, pulsadoRosa);
        }else if(pulsadoNegro){
            outState.putBoolean(PULSADOn, pulsadoNegro);
        }else if(pulsadoCafe){
            outState.putBoolean(PULSADOc, pulsadoCafe);
        }else{

        }

        outState.putInt(LIKES, likes);

        if(cartPulsado) {
            outState.putBoolean(BUTTON_TEXT, cartPulsado);
        }
    }
}
