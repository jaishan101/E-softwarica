package com.jaishan.esoftwarica;

import android.os.Bundle;

import com.jaishan.esoftwarica.model.Student;
import com.jaishan.esoftwarica.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        DashboardFragment.studentArrayList.add(new Student("Subash Gurung","24","Male","Balaju, KTM"));
        DashboardFragment.studentArrayList.add(new Student("Gita Tamang","20","Female","Manamaiju, KTM"));
        DashboardFragment.studentArrayList.add(new Student("Preetam Poudel","30","Male","Jarankhu, Pokhara"));
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
