package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class juz19_gtv extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,no;
    RadioButton a,b,c;
    Button bt,bt2;
    RadioGroup rg;
    int q,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz19_gtv);

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

                tv1.setText("إحَتَّىٰٓ إِذَآ أَتَوْا۟ عَلَىٰ وَادِ النَّمْلِ قَالَتْ نَمْلَةٌ يٰٓأَيُّهَا النَّمْلُ ادْخُلُوا۟ مَسٰكِنَكُمْ لَا يَحْطِمَنَّكُمْ سُلَيْمٰنُ وَجُنُودُهُۥ وَهُمْ لَا يَشْعُرُونَ");
                a.setText("An-Naml : 18");
                b.setText("Al-Furqan : 21");
                c.setText("Al-Furqan : 28");
                no.setText("1");
                tv4.setVisibility(View.INVISIBLE);
                q = 1;
                break;
            }
            case 1: {
                tv1.setText("أَصْحٰبُ الْجَنَّةِ يَوْمَئِذٍ خَيْرٌ مُّسْتَقَرًّا وَأَحْسَنُ مَقِيلً");
                a.setText("An-Naml : 24");
                b.setText("As-Syuara : 22");
                c.setText("Al-Furqan : 24");

                if (a.isChecked()) {
                    tv2.setText("Correct");
                    s = s + 10;
                } else {
                    tv2.setText("A was the right answer, An-Naml : 18");
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
                    tv2.setText("C was the right answer, Al-Furqan : 24");
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
