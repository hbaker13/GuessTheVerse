package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz9_gtv extends AppCompatActivity {


    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz9_gtv);

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
        bt2=(Button)findViewById(R.id.lvl);
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

                tv1.setText("وَمَا كَانَ اللّٰهُ لِيُعَذِّبَهُمْ وَاَنْتَ فِيْهِمْۚ وَمَا كَانَ اللّٰهُ مُعَذِّبَهُمْ وَهُمْ يَسْتَغْفِرُوْنَ");
                a.setText("Al-A'raf : 93");
                b.setText("Al-A'raf : 151");
                c.setText("Al-Anfal : 33");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("قُلْ لِّلَّذِيْنَ كَفَرُوْٓا اِنْ يَّنْتَهُوْا يُغْفَرْ لَهُمْ مَّا قَدْ سَلَفَۚ وَاِنْ يَّعُوْدُوْا فَقَدْ مَضَتْ سُنَّتُ الْاَوَّلِيْنَََ");
                a.setText("Al-Anfal : 38");
                b.setText("Al-A'raf : 109");
                c.setText("Al-A'raf : 200");

                if (c.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("C was the right answer, Al-Anfal : 33");
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
                if (a.isChecked()) {
                    s = s + 10;
                    tv2.setText("Correct");
                } else {
                    tv2.setText("A was the right answer, Al-Anfal : 38");
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
//                tv1.setText("وَمَا كَانَ صَلَاتُهُمْ عِنْدَ الْبَيْتِ اِلَّا مُكَاۤءً وَّتَصْدِيَةًۗ فَذُوْقُوا الْعَذَابَ بِمَا كُنْتُمْ تَكْفُرُوْنَ");
//                a.setText("Al-Anfal : 12");
//                b.setText("Al-A'raf : 190");
//                c.setText("Al-Anfal : 35");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("A was the right answer, Al-Anfal : 38");
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
//                tv1.setText("لَاُقَطِّعَنَّ اَيْدِيَكُمْ وَاَرْجُلَكُمْ مِّنْ خِلَافٍ ثُمَّ لَاُصَلِّبَنَّكُمْ اَجْمَعِيْنََ");
//                a.setText("Al-A'raf : 104");
//                b.setText("Al-A'raf : 124");
//                c.setText("Al-A'raf : 52");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("C was the right answer, Al-Anfal : 35");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("فَاَخَذَتْهُمُ الرَّجْفَةُ فَاَصْبَحُوْا فِيْ دَارِهِمْ جٰثِمِيْنَۙ");
//                a.setText("Al-A'raf : 91");
//                b.setText("Al-Anfal : 32");
//                c.setText("Al-A'raf : 100");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("B was the right answer, Al-A'raf : 124");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
//
