package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class table extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        listView = (ListView) findViewById(R.id.lisvyu);
        listView.setOnItemClickListener(this);
        getJSON();
    }

    private void showJuz() {
        JSONObject jsonObject = null;
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(konek.TAG_JSON_ARRAY);

            for (int i = 0; i < result.length(); i++) {
                JSONObject jo = result.getJSONObject(i);

                String urutan = jo.getString(konek.TAG_URUTAN);
                String surah = jo.getString(konek.TAG_SURAH);

                HashMap<String, String> juzz = new HashMap<>();
                juzz.put(konek.TAG_URUTAN, urutan);
                juzz.put(konek.TAG_SURAH, surah);
                list.add(juzz);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                table.this, list, R.layout.activity_judul,
                new String[]{konek.TAG_URUTAN, konek.TAG_SURAH},
                new int[]{R.id.noo, R.id.surahh});

        listView.setAdapter(adapter);
    }

    private void getJSON() {
        class GetJSON extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(table.this, "Loading", "Please Wait", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                showJuz();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(konek.URL_BACA);
                return s;
            }
        }

        GetJSON gj = new GetJSON();
        gj.execute();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {

            case 0:
                Intent intent = new Intent(this, juz1_gtv.class);
                HashMap map = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan = map.get(konek.TAG_URUTAN).toString();
                intent.putExtra(konek.urut4n, emp_urutan);
                startActivity(intent);
                break;

            case 1:
                Intent intent1 = new Intent(this, juz2_gtv.class);
                HashMap map1 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan1 = map1.get(konek.TAG_URUTAN).toString();
                intent1.putExtra(konek.urut4n, emp_urutan1);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2 = new Intent(this, juz3_gtv.class);
                HashMap map2 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan2 = map2.get(konek.TAG_URUTAN).toString();
                intent2.putExtra(konek.urut4n, emp_urutan2);
                startActivity(intent2);
                break;

            case 3:
                Intent intent3 = new Intent(this, juz4_gtv.class);
                HashMap map3 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan3 = map3.get(konek.TAG_URUTAN).toString();
                intent3.putExtra(konek.urut4n, emp_urutan3);
                startActivity(intent3);
                break;

            case 4:
                Intent intent4 = new Intent(this, juz5_gtv.class);
                HashMap map4 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan4 = map4.get(konek.TAG_URUTAN).toString();
                intent4.putExtra(konek.urut4n, emp_urutan4);
                startActivity(intent4);
                break;

            case 5:
                Intent intent5 = new Intent(this, juz6_gtv.class);
                HashMap map5 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan5 = map5.get(konek.TAG_URUTAN).toString();
                intent5.putExtra(konek.urut4n, emp_urutan5);
                startActivity(intent5);
                break;

            case 6:
                Intent intent6 = new Intent(this, juz7_gtv.class);
                HashMap map6 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan6 = map6.get(konek.TAG_URUTAN).toString();
                intent6.putExtra(konek.urut4n, emp_urutan6);
                startActivity(intent6);
                break;

            case 7:
                Intent intent7 = new Intent(this, juz8_gtv.class);
                HashMap map7 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan7 = map7.get(konek.TAG_URUTAN).toString();
                intent7.putExtra(konek.urut4n, emp_urutan7);
                startActivity(intent7);
                break;

            case 8:
                Intent intent8 = new Intent(this, juz9_gtv.class);
                HashMap map8 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan8 = map8.get(konek.TAG_URUTAN).toString();
                intent8.putExtra(konek.urut4n, emp_urutan8);
                startActivity(intent8);
                break;

            case 9:
                Intent intent9 = new Intent(this, juz10_gtv.class);
                HashMap map9 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan9 = map9.get(konek.TAG_URUTAN).toString();
                intent9.putExtra(konek.urut4n, emp_urutan9);
                startActivity(intent9);
                break;

            case 10:
                Intent intent10 = new Intent(this, juz11_gtv.class);
                HashMap map10 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan10 = map10.get(konek.TAG_URUTAN).toString();
                intent10.putExtra(konek.urut4n, emp_urutan10);
                startActivity(intent10);
                break;

            case 11:
                Intent intent11 = new Intent(this, juz12_gtv.class);
                HashMap map11 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan11 = map11.get(konek.TAG_URUTAN).toString();
                intent11.putExtra(konek.urut4n, emp_urutan11);
                startActivity(intent11);
                break;

            case 12:
                Intent intent12 = new Intent(this, juz13_gtv.class);
                HashMap map12 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan12 = map12.get(konek.TAG_URUTAN).toString();
                intent12.putExtra(konek.urut4n, emp_urutan12);
                startActivity(intent12);
                break;

            case 13:
                Intent intent13 = new Intent(this, juz14_gtv.class);
                HashMap map13 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan13 = map13.get(konek.TAG_URUTAN).toString();
                intent13.putExtra(konek.urut4n, emp_urutan13);
                startActivity(intent13);
                break;

            case 14:
                Intent intent14 = new Intent(this, juz15_gtv.class);
                HashMap map14 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan14 = map14.get(konek.TAG_URUTAN).toString();
                intent14.putExtra(konek.urut4n, emp_urutan14);
                startActivity(intent14);
                break;

            case 15:
                Intent intent15 = new Intent(this, juz16_gtv.class);
                HashMap map15 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan15 = map15.get(konek.TAG_URUTAN).toString();
                intent15.putExtra(konek.urut4n, emp_urutan15);
                startActivity(intent15);
                break;

            case 16:
                Intent intent16 = new Intent(this, juz17_gtv.class);
                HashMap map16 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan16 = map16.get(konek.TAG_URUTAN).toString();
                intent16.putExtra(konek.urut4n, emp_urutan16);
                startActivity(intent16);
                break;

            case 17:
                Intent intent17 = new Intent(this, juz18_gtv.class);
                HashMap map17 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan17 = map17.get(konek.TAG_URUTAN).toString();
                intent17.putExtra(konek.urut4n, emp_urutan17);
                startActivity(intent17);
                break;

            case 18:
                Intent intent18 = new Intent(this, juz19_gtv.class);
                HashMap map18 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan18 = map18.get(konek.TAG_URUTAN).toString();
                intent18.putExtra(konek.urut4n, emp_urutan18);
                startActivity(intent18);
                break;

            case 19:
                Intent intent19 = new Intent(this, juz20_gtv.class);
                HashMap map19 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan19 = map19.get(konek.TAG_URUTAN).toString();
                intent19.putExtra(konek.urut4n, emp_urutan19);
                startActivity(intent19);
                break;

            case 20:
                Intent intent20 = new Intent(this, juz21_gtv.class);
                HashMap map20 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan20 = map20.get(konek.TAG_URUTAN).toString();
                intent20.putExtra(konek.urut4n, emp_urutan20);
                startActivity(intent20);
                break;

            case 21:
                Intent intent21 = new Intent(this, juz22_gtv.class);
                HashMap map21 = (HashMap) parent .getItemAtPosition(position);
                String emp_urutan21 = map21.get(konek.TAG_URUTAN).toString();
                intent21.putExtra(konek.urut4n, emp_urutan21);
                startActivity(intent21);
                break;

            case 22:
                Intent intent22 = new Intent(this, juz23_gtv.class);
                HashMap map22 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan22 = map22.get(konek.TAG_URUTAN).toString();
                intent22.putExtra(konek.urut4n, emp_urutan22);
                startActivity(intent22);
                break;

            case 23:
                Intent intent23 = new Intent(this, juz24_gtv.class);
                HashMap map23 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan23 = map23.get(konek.TAG_URUTAN).toString();
                intent23.putExtra(konek.urut4n, emp_urutan23);
                startActivity(intent23);
                break;

            case 24:
                Intent intent24 = new Intent(this, juz25_gtv.class);
                HashMap map24 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan24 = map24.get(konek.TAG_URUTAN).toString();
                intent24.putExtra(konek.urut4n, emp_urutan24);
                startActivity(intent24);
                break;

            case 25:
                Intent intent25 = new Intent(this, juz26_gtv.class);
                HashMap map25 = (HashMap) parent.getItemAtPosition(position);
                String emp_urutan25 = map25.get(konek.TAG_URUTAN).toString();
                intent25.putExtra(konek.urut4n, emp_urutan25);
                startActivity(intent25);
                break;

            case 26:
//                Intent intent26 = new Intent(this, juz27_gtv.class);
//                HashMap map26 = (HashMap) parent.getItemAtPosition(position);
//                String emp_urutan26 = map26.get(konek.TAG_URUTAN).toString();
//                intent26.putExtra(konek.urut4n, emp_urutan26);
//                startActivity(intent26);
//                break;
//
//            case 27:
//                Intent intent27 = new Intent(this, juz28_gtv.class);
//                HashMap map27 = (HashMap) parent.getItemAtPosition(position);
//                String emp_urutan27 = map27.get(konek.TAG_URUTAN).toString();
//                intent27.putExtra(konek.urut4n, emp_urutan27);
//                startActivity(intent27);
//                break;
//
//            case 28:
//                Intent intent28 = new Intent(this, juz29_gtv.class);
//                HashMap map28 = (HashMap) parent.getItemAtPosition(position);
//                String emp_urutan28 = map28.get(konek.TAG_URUTAN).toString();
//                intent28.putExtra(konek.urut4n, emp_urutan28);
//                startActivity(intent28);
//                break;
//
//            case 29:
//                Intent intent29 = new Intent(this, juz30_gtv.class);
//                HashMap map29 = (HashMap) parent.getItemAtPosition(position);
//                String emp_urutan29 = map29.get(konek.TAG_URUTAN).toString();
//                intent29.putExtra(konek.urut4n, emp_urutan29);
//                startActivity(intent29);
//                break;

        }
    }
}