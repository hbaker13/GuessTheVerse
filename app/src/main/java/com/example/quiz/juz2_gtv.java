package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz2_gtv extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, no;
    RadioButton a, b, c;
    Button bt, bt2;
    RadioGroup rg;
    int q, s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz2_gtv);

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
        bt2 = (Button)findViewById(R.id.lvl);
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

                tv1.setText("اَلْحَقُّ مِنْ رَّبِّكَ فَلَا تَكُوْنَنَّ مِنَ الْمُمْتَرِيْنَ");
                a.setText("Al-Baqarah : 180");
                b.setText("Al-Baqarah : 150");
                c.setText("Al-Baqarah : 147");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("اِلَّا الَّذِيْنَ تَابُوْا وَاَصْلَحُوْا وَبَيَّنُوْا فَاُولٰۤىِٕكَ اَتُوْبُ عَلَيْهِمْ ۚ وَاَنَا التَّوَّابُ الرَّحِيْمُ");
                a.setText("Al-Baqarah : 155");
                b.setText("Al-Baqarah : 160");
                c.setText("Al-Baqarah : 170");

                if (c.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("C was the right answer, Al-Baqarah : 147");
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
                    tv2.setText("B was the right answer, Al-Baqarah : 160");
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
//                tv1.setText("اِذْ تَبَرَّاَ الَّذِيْنَ اتُّبِعُوْا مِنَ الَّذِيْنَ اتَّبَعُوْا وَرَاَوُا الْعَذَابَ وَتَقَطَّعَتْ بِهِمُ الْاَسْبَابُ");
//                a.setText("Al-Baqarah : 142");
//                b.setText("Al-Baqarah : 200");
//                c.setText("Al-Baqarah : 166");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("B was the right answer, Al-Baqarah : 160");
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
//                tv1.setText("فَاذْكُرُوْنِيْٓ اَذْكُرْكُمْ وَاشْكُرُوْا لِيْ وَلَا تَكْفُرُوْنِ");
//                a.setText("Al-Baqarah : 152");
//                b.setText("Al-Baqarah : 160");
//                c.setText("Al-Baqarah : 141");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("C was the right answer, Al-Baqarah : 166");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("وَمِنَ النَّاسِ مَنْ يَّشْرِيْ نَفْسَهُ ابْتِغَاۤءَ مَرْضَاتِ اللّٰهِ ۗوَاللّٰهُ رَءُوْفٌۢ بِالْعِبَادِ");
//                a.setText("Al-Baqarah : 200");
//                b.setText("Al-Baqarah : 207");
//                c.setText("Al-Baqarah : 166");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Al-Baqarah : 152");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
