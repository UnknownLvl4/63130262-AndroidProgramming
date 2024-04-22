package duy.hn.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape>recyclerViewDatas;
    RecyclerView recyclerViewLandscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas=getDataForRecyclerView();
        //4
        recyclerViewLandscape=findViewById(R.id.recyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear= new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter=new LandScapeAdapter(this, recyclerViewDatas);
        //7
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu=new ArrayList<LandScape>();
        LandScape landScape1=new LandScape("dog", "Chú Chó");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("Panda","Gấu Trúc"));
        dsDuLieu.add(new LandScape("Zebra","Ngựa vằn"));
        return dsDuLieu;
    }
}