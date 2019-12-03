package id.com.miqdad.ilmuwanmuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android  .support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    IlmuwanAdapter ilmuwanAdapter;
    RecyclerView rvMain;
    ArrayList<ModelIlmuwan> arrayList;
    int count = 0;


    String[] idIlmuwan = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10"
    };


    String[] namaIlmuan = {
            "Al Khawarizmi",
            "Al Zahrawi",
            "Ibnu al-Baithar",
            "Ibnu al-Nafis",
            "Ibnu Haitham",
            "Ibnu Khaldun",
            "Ibnu Sina",
            "Jabir Ibn- Hayyan",
            "Thbit ibn Qurra",
            "Umar Khayyam"
    };






    int[]gambarIlmuan = {
            R.drawable.alkhawarizmi,
            R.drawable.alzahrawi,
            R.drawable.ibnualbhaitar,
            R.drawable.ibnualnafis,
            R.drawable.ibnuhaitman,
            R.drawable.ibnukhaldun,
            R.drawable.ibnusina,
            R.drawable.jabilibnhayyan,
            R.drawable.thbitibnqurra,
            R.drawable.umarkhayyam,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<>();
        ilmuwanAdapter = new IlmuwanAdapter(arrayList);
        setData();

        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.setAdapter(ilmuwanAdapter);






    }
    private void setData (){
        int count = 0;
        for (String id : idIlmuwan ){
            arrayList.add(new ModelIlmuwan(id, namaIlmuan[count], gambarIlmuan[count]));
            count++;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(MainActivity.this,AbputActivity.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }



}
