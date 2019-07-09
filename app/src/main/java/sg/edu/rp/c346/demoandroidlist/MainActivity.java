package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<AndroidVersion> movieList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie) ;

        movieList = new ArrayList<>();
        movieList.add(new AndroidVersion("Pie","9.0"));
        movieList.add(new AndroidVersion("Oreo","8.0 - 8.1"));
        movieList.add(new AndroidVersion("Nougat","7.0 - 7.1"));
        movieList.add(new AndroidVersion("Marhsmallow","6.0 -6.0.1"));
        movieList.add(new AndroidVersion("Lollipop","5.0 - 5.1.1"));
        movieList.add(new AndroidVersion("KitKat","4.4 - 4.4.4"));
        movieList.add(new AndroidVersion("Jelly Bean","4.1 - 4.3.1"));


        adapter = new CustomAdapter(this, R.layout.row ,movieList);

        lvMovie.setAdapter(adapter);
    }
}
