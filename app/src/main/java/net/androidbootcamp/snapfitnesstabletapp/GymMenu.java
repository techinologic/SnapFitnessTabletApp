package net.androidbootcamp.snapfitnesstabletapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GymMenu extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] fitnessGym = {"City Fitness", "Fitness Together", "Vida Fitness"};
        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_gym_menu,
                R.id.fitnessGym, fitnessGym));


    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(GymMenu.this, CityListActivity.class));
                break;
            case 1:
                startActivity(new Intent(GymMenu.this, CrunchListActivity.class));
                break;
            case 2:
                startActivity(new Intent(GymMenu.this, VidaListActivity.class));
                break;
        }
    }
}
