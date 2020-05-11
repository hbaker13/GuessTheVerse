package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz3_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz3_gtv);

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

                tv1.setText("اَلشَّيْطٰنُ يَعِدُكُمُ الْفَقْرَ وَيَأْمُرُكُمْ بِالْفَحْشَاۤءِ ۚ وَاللّٰهُ يَعِدُكُمْ مَّغْفِرَةً مِّنْهُ وَفَضْلًا ۗ وَاللّٰهُ وَاسِعٌ عَلِيْمٌ ۖ ");
                a.setText("Al-Baqarah : 268");
                b.setText("Al-Baqarah : 286");
                c.setText("Ali Imran : 1");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("وَاِنْ كَانَ ذُوْ عُسْرَةٍ فَنَظِرَةٌ اِلٰى مَيْسَرَةٍ ۗ وَاَنْ تَصَدَّقُوْا خَيْرٌ لَّكُمْ اِنْ كُنْتُمْ تَعْلَمُوْنَ");
                a.setText("Al-Baqarah : 155");
                b.setText("Al-Baqarah : 160");
                c.setText("Al-Baqarah : 280");

                if (a.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("A was the right answer, Al-Baqarah : 268");
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
                    tv2.setText("C was the right answer, Al-Baqarah : 280");
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
//                tv1.setText("قَوْلٌ مَّعْرُوْفٌ وَّمَغْفِرَةٌ خَيْرٌ مِّنْ صَدَقَةٍ يَّتْبَعُهَآ اَذًى ۗ وَاللّٰهُ غَنِيٌّ حَلِيْمٌ");
//                a.setText("Al-Baqarah : 263");
//                b.setText("Al-Baqarah : 272");
//                c.setText("Al-Baqarah : 166");
//                if (c.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("C was the right answer, Al-Baqarah : 280");
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
//                tv1.setText("رَبَّنَآ اِنَّكَ جَامِعُ النَّاسِ لِيَوْمٍ لَّا رَيْبَ فِيْهِ ۗاِنَّ اللّٰهَ لَا يُخْلِفُ الْمِيْعَادَِ");
//                a.setText("Ali Imran : 21");
//                b.setText("Ali Imran : 9");
//                c.setText("Al-Baqarah : 141");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Al-Baqarah : 263");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("يٰٓاَيُّهَا الَّذِيْنَ اٰمَنُوْٓا اَنْفِقُوْا مِمَّا رَزَقْنٰكُمْ مِّنْ قَبْلِ اَنْ يَّأْتِيَ يَوْمٌ لَّا بَيْعٌ فِيْهِ وَلَا خُلَّةٌ وَّلَا شَفَاعَةٌ ۗوَالْكٰفِرُوْنَ هُمُ الظّٰلِمُوْنَ");
//                a.setText("Al-Baqarah : 254");
//                b.setText("Ali Imran : 3");
//                c.setText("Al-Baqarah : 270");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("B was the right answer, Ali Imran : 9");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
