package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz5_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz5_gtv);

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

                tv1.setText("فَاٰتٰىهُمُ اللّٰهُ ثَوَابَ الدُّنْيَا وَحُسْنَ ثَوَابِ الْاٰخِرَةِ ۗ وَاللّٰهُ يُحِبُّ الْمُحْسِنِيْنَ ");
                a.setText("An-Nisa : 37");
                b.setText("An-Nisa : 93");
                c.setText("An-Nisa : 138");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("الَّذِيْنَ يَبْخَلُوْنَ وَيَأْمُرُوْنَ النَّاسَ بِالْبُخْلِ وَيَكْتُمُوْنَ مَآ اٰتٰىهُمُ اللّٰهُ مِنْ فَضْلِهٖۗ وَاَعْتَدْنَا لِلْكٰفِرِيْنَ عَذَابًا مُّهِيْنًاۚ");
                a.setText("An-Nisa : 147");
                b.setText("An-Nisa : 37");
                c.setText("An-Nisa : 131");

                if (a.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("A was the right answer, An-Nisa : 143");
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
                    tv2.setText("B was the right answer, An-Nisa : 37");
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
//                tv1.setText("اُولٰۤىِٕكَ الَّذِيْنَ يَعْلَمُ اللّٰهُ مَا فِيْ قُلُوْبِهِمْ فَاَعْرِضْ عَنْهُمْ وَعِظْهُمْ وَقُلْ لَّهُمْ فِيْٓ اَنْفُسِهِمْ قَوْلًا ۢ بَلِيْغًا");
//                a.setText("An-Nisa : 129");
//                b.setText("An-Nisa : 128");
//                c.setText("An-Nisa : 63");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("B was the right answer, An-Nisa : 37");
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
//                tv1.setText("اِنَّ اللّٰهَ لَا يَظْلِمُ مِثْقَالَ ذَرَّةٍ ۚوَاِنْ تَكُ حَسَنَةً يُّضٰعِفْهَا وَيُؤْتِ مِنْ لَّدُنْهُ اَجْرًا عَظِيْمًا");
//                a.setText("An-Nisa : 40");
//                b.setText("An-Nisa : 127");
//                c.setText("An-Nisa : 90");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("C was the right answer, An-Nisa : 63");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("اِنْ تَجْتَنِبُوْا كَبَاۤىِٕرَ مَا تُنْهَوْنَ عَنْهُ نُكَفِّرْ عَنْكُمْ سَيِّاٰتِكُمْ وَنُدْخِلْكُمْ مُّدْخَلًا كَرِيْمًا");
//                a.setText("An-Nisa : 105");
//                b.setText("An-Nisa : 31");
//                c.setText("An-Nisa : 84");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, An-Nisa : 40");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
//
