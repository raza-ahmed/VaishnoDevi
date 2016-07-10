package in.myatra.vaishnodevi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void transportSec(View view){

        Toast.makeText(getApplicationContext(), "Transport Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void costSec(View view){

        Toast.makeText(getApplicationContext(), "Cost Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void accommodationSec(View view){

        Toast.makeText(getApplicationContext(), "Accommodation Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void mapSec(View view){

        Toast.makeText(getApplicationContext(), "Map Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void weatherSec(View view){

        Toast.makeText(getApplicationContext(), "Weather Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void checklistSec(View view){

        Toast.makeText(getApplicationContext(), "Checklist Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void storySec(View view){

        Toast.makeText(getApplicationContext(), "Story Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void nearbySec(View view){

        Toast.makeText(getApplicationContext(), "Nearby Section Clicked!", Toast.LENGTH_SHORT).show();
    }


    public void storeSec(View view){

        Toast.makeText(getApplicationContext(), "Store Section Clicked!", Toast.LENGTH_SHORT).show();
    }




}
