package com.uninassau.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View view) {

        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[] frases = {"As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o " +
                "efeito do banho, por isso recomenda-se diariamente.", "Toda ação humana, quer se " +
                "torne positiva ou negativa, precisa depender de motivação.", "É parte da cura o " +
                "desejo de ser curado.", "O que me preocupa não é o grito dos maus. É o silêncio " +
                "dos bons.", "Inspiração vem dos outros. Motivação vem de dentro de nós.","Há sempre" +
                " alguém de plantão para achar que o certo é errado.", "Não devemos nos orgulhar de " +
                "sermos melhores que os outros, mas sim melhores do que já fomos."};

        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);
    }

}