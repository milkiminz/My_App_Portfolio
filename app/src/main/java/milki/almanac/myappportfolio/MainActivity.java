package milki.almanac.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void clickspotify(View view){
        Toast.makeText(MainActivity.this, "This button will launch SPOTIFY STREAMER!", Toast.LENGTH_SHORT).show();
    }
    public void clickscores(View view){
        Toast.makeText(MainActivity.this, "This button will launch SCORES APP!", Toast.LENGTH_SHORT).show();
    }
    public void clicklibrary(View view){
        Toast.makeText(MainActivity.this, "This button will launch LIBRARY APP!", Toast.LENGTH_SHORT).show();
    }
    public void clickbuilditbetter(View view){
        Toast.makeText(MainActivity.this, "This button will launch BUILD IT BIGGER!", Toast.LENGTH_SHORT).show();
    }
    public void clickbaconreader(View view){
        Toast.makeText(MainActivity.this, "This button will launch BACON READER!", Toast.LENGTH_SHORT).show();
    }
    public void clickcapstone(View view){
        Toast.makeText(MainActivity.this, "This button will launch CAPSTONE-MY OWN APP!", Toast.LENGTH_SHORT).show();
    }
}
