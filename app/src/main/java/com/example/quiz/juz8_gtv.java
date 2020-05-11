package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz8_gtv extends AppCompatActivity {


    TextView tv1, tv2, tv3, tv4, no;
    RadioButton a, b, c;
    Button bt,bt2;
    RadioGroup rg;
    int q, s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz8_gtv);

        tv1 = (TextView) findViewById(R.id.ques);
        tv2 = (TextView) findViewById(R.id.response);
        tv3 = (TextView) findViewById(R.id.score);
        tv4 = (TextView) findViewById(R.id.sttart);
        no = (TextView) findViewById(R.id.nomor);
        rg = (RadioGroup) findViewById(R.id.optionGroup);
        a = (RadioButton) findViewById(R.id.option1);
        b = (RadioButton) findViewById(R.id.option2);
        c = (RadioButton) findViewById(R.id.option3);
        bt = (Button) findViewById(R.id.next);
        bt2=(Button)findViewById(R.id.lvl);
        q = 0;
        s = 0;
    }

    public void quiz(View v) {
        switch (q) {
            case 0: {
                bt2.setVisibility(View.INVISIBLE);
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                bt.setText("Check and Continue");
                s = 0;

                tv1.setText("اَلَّذِيْنَ اٰمَنُوْا وَلَمْ يَلْبِسُوْٓا اِيْمَانَهُمْ بِظُلْمٍ اُولٰۤىِٕكَ لَهُمُ الْاَمْنُ وَهُمْ مُّهْتَدُوْنَ ");
                a.setText("Al-An'am : 100");
                b.setText("Al-An'am : 151");
                c.setText("Al-A'raf : 84");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("قَالَ فِيْهَا تَحْيَوْنَ وَفِيْهَا تَمُوْتُوْنَ وَمِنْهَا تُخْرَجُوْنََ");
                a.setText("Al-An'am : 113");
                b.setText("Al-A'raf : 25");
                c.setText("Al-A'raf : 37");

                if (c.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("C was the right answer, Al-A'raf : 84");
                }
                q = 2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                no.setText("2");
                break;
            }

            case 2: {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                if (b.isChecked()) {
                    s = s + 10;
                    tv2.setText("Correct");
                } else {
                    tv2.setText("B was the right answer, Al-A'raf : 25");
                }
                tv3.setText("Your score is " + s);
                bt.setText("Restart");
                bt2.setText("Back");
                bt2.setVisibility(View.VISIBLE);
                q = 0;
                break;
            }

        }

    }

    public void level(View view){
        Intent g = new Intent(this, table.class);
        startActivity(g);
    }
}


//            case 2: {
//                tv1.setText("قُلْ اِنَّ صَلَاتِيْ وَنُسُكِيْ وَمَحْيَايَ وَمَمَاتِيْ لِلّٰهِ رَبِّ الْعٰلَمِيْنَۙ ");
//                a.setText("Al-An'am : 162");
//                b.setText("Al-A'raf : 19");
//                c.setText("Al-An'am : 165");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("B was the right answer, Al-A'raf : 25");
//                }
//                q = 3;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("3");
//                break;
//            }
//            case 3: {
//
//                tv1.setText("قَالَ عِيْسَى ابْنُ مَرْيَمَ اللهم رَبَّنَآ اَنْزِلْ عَلَيْنَا مَاۤىِٕدَةً مِّنَ السَّمَاۤءِ تَكُوْنُ لَنَا عِيْدًا لِّاَوَّلِنَا وَاٰخِرِنَا وَاٰيَةً مِّنْكَ وَارْزُقْنَا وَاَنْتَ خَيْرُ الرّٰزِقِيْنَ");
//                a.setText("Al-An'am : 104");
//                b.setText("Al-A'raf : 71");
//                c.setText("Al-A'raf : 52");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Al-An'Am : 162");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("وَتَمَّتْ كَلِمَتُ رَبِّكَ صِدْقًا وَّعَدْلًاۗ لَا مُبَدِّلَ لِكَلِمٰتِهٖ ۚوَهُوَ السَّمِيْعُ الْعَلِيْمُ");
//                a.setText("Al-An'am : 115");
//                b.setText("Al-An'am : 111");
//                c.setText("Al-A'raf : 12");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("C was the right answer, Al-A'raf : 52");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
//
