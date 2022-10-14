package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView dontetlenszoveg;
    private ImageView gepvalasztas;
    private ImageView playervalasztas;
    private ImageView gephp1;
    private ImageView gephp2;
    private ImageView gephp3;
    private ImageView playerhp1;
    private ImageView playerhp2;
    private ImageView playerhp3;
    private ImageView valasztasko;
    private ImageView valasztaspapir;
    private ImageView valasztasollo;
    private Random rnd = new Random();
    private int playerValNum;
    private int gepValNum;
    private int dontetlenNum;
    private int gephpNum;
    private int playerhpNum;



private void init(){
    dontetlenszoveg = findViewById(R.id.dontetlenszoveg);
    gepvalasztas = findViewById(R.id.gepvalasztas);
    playervalasztas = findViewById(R.id.playervalasztas);
    gephp1 = findViewById(R.id.gephp1);
    gephp2 = findViewById(R.id.gephp2);
    gephp3 = findViewById(R.id.gephp3);
    playerhp1 = findViewById(R.id.playerhp1);
    playerhp2 = findViewById(R.id.playerhp2);
    playerhp3 = findViewById(R.id.playerhp3);
    valasztasko = findViewById(R.id.valasztasko);
    valasztaspapir = findViewById(R.id.valasztaspapir);
    valasztasollo = findViewById(R.id.valasztasollo);
    rnd = new Random();
    playerValNum = 0;
    gepValNum = 0;
    dontetlenNum = 0;
    gephpNum = 3;
    playerhpNum = 3;



}
private void koclick(){

    playervalasztas.setImageResource(R.drawable.rock);
    playerValNum = 0;
    gepValNum = rnd.nextInt(3);
    if(gepValNum == 0){
        gepvalasztas.setImageResource(R.drawable.rock);
        dontetlenNum++;
        dontetlenszoveg.setText(String.format("Döntetlenek száma : %d" , dontetlenNum));
    }
    if(gepValNum == 1){
        gepvalasztas.setImageResource(R.drawable.paper);
        playerhpNum--;
        if(playerhpNum == 2){
            playerhp1.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 1){
            playerhp2.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 0){
            playerhp3.setImageResource(R.drawable.heart1);
            //vesztettél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Vereség")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }

    }
    if(gepValNum == 2){
        gepvalasztas.setImageResource(R.drawable.scissors);
        gephpNum--;
        if(gephpNum == 2){
            gephp1.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 1){
            gephp2.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 0){
            gephp3.setImageResource(R.drawable.heart1);
            //nyertél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Győzelem")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }
    }

}

private void papirclick(){

    playervalasztas.setImageResource(R.drawable.paper);
    playerValNum = 1;
    gepValNum = rnd.nextInt(3);
    if(gepValNum == 0){
        gepvalasztas.setImageResource(R.drawable.rock);
        gephpNum--;
        if(gephpNum == 2){
            gephp1.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 1){
            gephp2.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 0){
            gephp3.setImageResource(R.drawable.heart1);
            //nyertél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Győzelem")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }
    }
    if(gepValNum == 1){
        gepvalasztas.setImageResource(R.drawable.paper);
        dontetlenNum++;
        dontetlenszoveg.setText(String.format("Döntetlenek száma : %d" , dontetlenNum));

    }
    if(gepValNum == 2){
        gepvalasztas.setImageResource(R.drawable.scissors);
        playerhpNum--;
        if(playerhpNum == 2){
            playerhp1.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 1){
            playerhp2.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 0){
            playerhp3.setImageResource(R.drawable.heart1);
            //vesztettél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Vereség")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }
    }

}

private void olloclick(){
    playervalasztas.setImageResource(R.drawable.scissors);
    playerValNum = 2;
    gepValNum = rnd.nextInt(3);
    if(gepValNum == 0){
        gepvalasztas.setImageResource(R.drawable.rock);
        playerhpNum--;
        if(playerhpNum == 2){
            playerhp1.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 1){
            playerhp2.setImageResource(R.drawable.heart1);
        }
        if(playerhpNum == 0){
            playerhp3.setImageResource(R.drawable.heart1);
            //vesztettél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Vereség")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }

    }
    if(gepValNum == 1){
        gepvalasztas.setImageResource(R.drawable.paper);
        gephpNum--;
        if(gephpNum == 2){
            gephp1.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 1){
            gephp2.setImageResource(R.drawable.heart1);
        }
        if(gephpNum == 0){
            gephp3.setImageResource(R.drawable.heart1);
            //nyertél
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Győzelem")
                    .setMessage("Szeretnél új játékot kezdeni?")
                    .setCancelable(false)

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            newgame();
                        }
                    })

                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .show();
        }
    }
    if(gepValNum == 2){
        gepvalasztas.setImageResource(R.drawable.scissors);
        dontetlenNum++;
        dontetlenszoveg.setText(String.format("Döntetlenek száma : %d" , dontetlenNum));
    }

}

private void newgame(){
    gephp1.setImageResource(R.drawable.heart2);
    gephp2.setImageResource(R.drawable.heart2);
    gephp3.setImageResource(R.drawable.heart2);

    playerhp1.setImageResource(R.drawable.heart2);
    playerhp1.setImageResource(R.drawable.heart2);
    playerhp1.setImageResource(R.drawable.heart2);

    dontetlenNum = 0;
    gephpNum = 3;
    playerhpNum = 3;

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        valasztasko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                koclick();
            }
        });
        valasztaspapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                papirclick();
            }
        });
        valasztasollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                olloclick();
            }
        });




    }
}