package com.anas.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<person_data> arrPdata=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView vRV=findViewById(R.id.vRV);
        vRV.setHasFixedSize(true);
        vRV.setLayoutManager(new LinearLayoutManager(this));

        person_data p1=new person_data(R.drawable.studious, "David","3893434798");

        arrPdata.add(p1);
        arrPdata.add(new person_data(R.drawable.girl,"Ema","7984326784"));
        arrPdata.add(new person_data(R.drawable.girl,"Max","7984326784"));
        arrPdata.add(new person_data(R.drawable.blacksmith,"Erick","2354672356"));
        arrPdata.add(new person_data(R.drawable.designer,"Otis","7984326784"));
        arrPdata.add(new person_data(R.drawable.gamer,"Brian","3421265784"));
        arrPdata.add(new person_data(R.drawable.wizard,"Han","7984326784"));
        arrPdata.add(new person_data(R.drawable.joker,"Ben","5423688532"));
        arrPdata.add(new person_data(R.drawable.blacksmith,"Archer","7842568643"));
        arrPdata.add(new person_data(R.drawable.designer,"Justin","8876356466"));
        arrPdata.add(new person_data(R.drawable.gamer,"Will","2343657265"));
        arrPdata.add(new person_data(R.drawable.wizard,"Head","2676437545"));
        arrPdata.add(new person_data(R.drawable.joker,"Colin","0435685877"));
        arrPdata.add(new person_data(R.drawable.wizard,"Warner","7984326784"));
        arrPdata.add(new person_data(R.drawable.blacksmith,"Smith","3489854727"));
        arrPdata.add(new person_data(R.drawable.studious,"John","9873446557"));

        RecyclerPersonAdapter arrAdapterPerson=new RecyclerPersonAdapter(this,arrPdata);
        vRV.setAdapter(arrAdapterPerson);
    }
}