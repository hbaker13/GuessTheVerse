package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz10_gtv extends AppCompatActivity {


    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz10_gtv);

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

                tv1.setText("يٰٓأَيُّهَا النَّبِىُّ جٰهِدِ الْكُفَّارَ وَالْمُنٰفِقِينَ وَاغْلُظْ عَلَيْهِمْ ۚ وَمَأْوَىٰهُمْ جَهَنَّمُ ۖ وَبِئْسَ الْمَصِيرُ ﴿التوبة");
                a.setText("Al-Anfal : 71");
                b.setText("Al-Anfal : 49");
                c.setText("At-Taubah : 73");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("وَلَا يَحْسَبَنَّ الَّذِينَ كَفَرُوا۟ سَبَقُوٓا۟ ۚ إِنَّهُمْ لَا يُعْجِزُونَ ﴿الأنفال");
                a.setText("Al-Anfal : 61");
                b.setText("Al-Anfal : 59");
                c.setText("At-Taubah : 19");

                if (c.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("C was the right answer, At-Taubah : 73");
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
                    tv2.setText("B was the right answer, Al-Anfal : 59");
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
//                a.setText("At-Taubah : 67");
//                b.setText("Al-Anfal : 69");
//                c.setText("At-Taubah : 35");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("B was the right answer, Al-Anfal : 59");
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
//                tv1.setText("ثُمَّ يَتُوبُ اللَّـهُ مِنۢ بَعْدِ ذٰلِكَ عَلَىٰ مَن يَشَآءُ ۗ وَاللَّـهُ غَفُورٌ رَّحِيمٌ ﴿التوبة");
//                a.setText("Al-Anfal : 75");
//                b.setText("At-Taubah : 27");
//                c.setText("Al-Anfal : 52");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, At-Taubah : 67");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("وَإِمَّا تَخَافَنَّ مِن قَوْمٍ خِيَانَةً فَانۢبِذْ إِلَيْهِمْ عَلَىٰ سَوَآءٍ ۚ إِنَّ اللَّـهَ لَا يُحِبُّ الْخَآئِنِينَ ﴿الأنفال");
//                a.setText("At-Taubah : 1");
//                b.setText("Al-Anfal : 60");
//                c.setText("Al-Anfal : 58");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("B was the right answer, At-Taubah : 27");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }

