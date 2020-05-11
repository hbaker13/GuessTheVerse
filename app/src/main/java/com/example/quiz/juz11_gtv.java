package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz11_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz11_gtv);

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

                tv1.setText("إفَإِن تَوَلَّوْا۟ فَقُلْ حَسْبِىَ اللَّـهُ لَآ إِلٰهَ إِلَّا هُوَ ۖ عَلَيْهِ تَوَكَّلْتُ ۖ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمِ");
                a.setText("Yunus : 29");
                b.setText("At-Taubah : 129");
                c.setText("Hud : 3");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("وَأَنْ أَقِمْ وَجْهَكَ لِلدِّينِ حَنِيفًا وَلَا تَكُونَنَّ مِنَ الْمُشْرِكِينَ");
                a.setText("Hud : 4");
                b.setText("At-Taubah : 123");
                c.setText("Yunus : 105");

                if (b.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("B was the right answer, At-Taubah : 129");
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
                    tv2.setText("C was the right answer, Yunus : 105");
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
//                tv1.setText("إِنَّ اللَّـهَ لَا يَظْلِمُ النَّاسَ شَيْـًٔا وَلٰكِنَّ النَّاسَ أَنفُسَهُمْ يَظْلِمُونَ");
//                a.setText("Yunus : 44");
//                b.setText("At-Taubah : 120");
//                c.setText("At-Taubah : 110");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("C was the right answer, Yunus : 105");
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
//                tv1.setText("يَحْلِفُونَ لَكُمْ لِتَرْضَوْا۟ عَنْهُمْ ۖ فَإِن تَرْضَوْا۟ عَنْهُمْ فَإِنَّ اللَّـهَ لَا يَرْضَىٰ عَنِ الْقَوْمِ الْفٰسِقِينَ");
//                a.setText("At-Taubah : 100");
//                b.setText("Yunus : 27");
//                c.setText("At-Taubah : 96");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Yunus : 44");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("وَءَاخَرُونَ اعْتَرَفُوا۟ بِذُنُوبِهِمْ خَلَطُوا۟ عَمَلًا صٰلِحًا وَءَاخَرَ سَيِّئًا عَسَى اللَّـهُ أَن يَتُوبَ عَلَيْهِمْ ۚ إِنَّ اللَّـهَ غَفُورٌ رَّحِيمٌ");
//                a.setText("At-Taubah : 99");
//                b.setText("At-Taubah : 102");
//                c.setText("Hud : 3");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("C was the right answer, At-Taubah : 95");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
//
