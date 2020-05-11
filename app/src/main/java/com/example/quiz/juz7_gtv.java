package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz7_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz7_gtv);

        tv1=(TextView)findViewById(R.id.ques);
        tv2=(TextView)findViewById(R.id.response);
        tv3=(TextView)findViewById(R.id.score);
        tv4=(TextView)findViewById(R.id.sttart);
        no=(TextView)findViewById(R.id.nomor);
        rg=(RadioGroup)findViewById(R.id.optionGroup);
        a=(RadioButton)findViewById(R.id.option1);
        b=(RadioButton)findViewById(R.id.option2);
        c=(RadioButton)findViewById(R.id.option3);
        bt=(Button)findViewById(R.id.next);
        bt2=(Button)findViewById(R.id.lvl) ;
        q=0;
        s=0;
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
                a.setText("Al-Maidah : 100");
                b.setText("Al-An'am : 82");
                c.setText("Al-Maidah : 110");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("لَيْسُوْا سَوَاۤءً ۗ مِنْ اَهْلِ الْكِتٰبِ اُمَّةٌ قَاۤىِٕمَةٌ يَّتْلُوْنَ اٰيٰتِ اللّٰهِ اٰنَاۤءَ الَّيْلِ وَهُمْ يَسْجُدُوْنَ");
                a.setText("Al-Maidah : 113");
                b.setText("Al-Maidah : 89");
                c.setText("Al-Maidah : 67");

                if (b.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("B was the right answer, Al-An'am : 82");
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
                if (c.isChecked()) {
                    s = s + 10;
                    tv2.setText("Correct");
                } else {
                    tv2.setText("C was the right answer, Al-Maidah : 67");
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
//                tv1.setText("وَاَطِيْعُوا اللّٰهَ وَاَطِيْعُوا الرَّسُوْلَ وَاحْذَرُوْا ۚفَاِنْ تَوَلَّيْتُمْ فَاعْلَمُوْٓا اَنَّمَا عَلٰى رَسُوْلِنَا الْبَلٰغُ الْمُبِيْنُ ");
//                a.setText("Al-Maidah : 92");
//                b.setText("Al-An'am : 22");
//                c.setText("Al-Maidah : 120");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("C was the right answer, Al-Maidah : 67");
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
//                a.setText("Al-An'am : 100");
//                b.setText("Al-Maidah : 114");
//                c.setText("Al-Maidah : 100");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Al-Maidah : 92");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("وَالَّذِيْنَ كَفَرُوْا وَكَذَّبُوْا بِاٰيٰتِنَآ اُولٰۤىِٕكَ اَصْحٰبُ الْجَحِيْمِ");
//                a.setText("Al-Maidah : 105");
//                b.setText("Al-An'am : 3");
//                c.setText("Al-Maidah : 86");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("B was the right answer, Al-Maidah : 114");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
