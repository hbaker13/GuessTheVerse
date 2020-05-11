package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz13_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz13_gtv);

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

                tv1.setText("عٰلِمُ الْغَيْبِ وَالشَّهٰدَةِ الْكَبِيرُ الْمُتَعَالِ");
                a.setText("Ar-Ra'd : 9");
                b.setText("Ar-Ra'd : 22");
                c.setText("Ar-Ra'd : 29");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("وَسَكَنتُمْ فِى مَسٰكِنِ الَّذِينَ ظَلَمُوٓا۟ أَنفُسَهُمْ وَتَبَيَّنَ لَكُمْ كَيْفَ فَعَلْنَا بِهِمْ وَضَرَبْنَا لَكُمُ الْأَمْثَالَ ﴿ابراهيم");
                a.setText("Yusuf : 100");
                b.setText("Ibrahim : 45");
                c.setText("Ibrahim : 46");

                if (a.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("A was the right answer, Ar-Ra'd : 9");
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
                    tv2.setText("B was the right answer, Ibrahim : 45");
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
//                tv1.setText("قَالُوا۟ جَزٰٓؤُهُۥ مَن وُجِدَ فِى رَحْلِهِۦ فَهُوَ جَزٰٓؤُهُۥ ۚ كَذٰلِكَ نَجْزِى الظّٰلِمِينَ");
//                a.setText("Ibrahim : 12");
//                b.setText("Yusuf : 75");
//                c.setText("Yusuf : 52");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//
//                } else {
//                    tv2.setText("B was the right answer, Ibrahim : 45");
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
//                tv1.setText("وَكَذٰلِكَ مَكَّنَّا لِيُوسُفَ فِى الْأَرْضِ يَتَبَوَّأُ مِنْهَا حَيْثُ يَشَآءُ ۚ نُصِيبُ بِرَحْمَتِنَا مَن نَّشَآءُ ۖ وَلَا نُضِيعُ أَجْرَ الْمُحْسِنِينَ ﴿يوسفََ");
//                a.setText("Ar-Ra'd : 10");
//                b.setText("Yusuf : 56");
//                c.setText("Ibrahim : 50");
//                if (a.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("A was the right answer, Yusuf : 75");
//                }
//                q = 4;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("4");
//                break;
//            }
//            case 4: {
//                tv1.setText("قَالَ اجْعَلْنِى عَلَىٰ خَزَآئِنِ الْأَرْضِ ۖ إِنِّى حَفِيظٌ عَلِيمٌ");
//                a.setText("Yusuf : 55");
//                b.setText("Ibrahim : 10");
//                c.setText("Ibrahim : 51");
//                if (b.isChecked()) {
//                    s = s + 10;
//                    tv2.setText("Correct");
//                } else {
//                    tv2.setText("B was the right answer, Yusuf : 56");
//                }
//                q = 5;
//                a.setChecked(false);
//                b.setChecked(false);
//                c.setChecked(false);
//                no.setText("5");
//                break;
//            }
//
