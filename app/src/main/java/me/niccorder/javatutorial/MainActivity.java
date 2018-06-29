package me.niccorder.javatutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int x;
    private Vehicle vehicle = new Vehicle();
    private Sedan sedan = new Sedan();

    public TextView tvBeep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBeep = findViewById(R.id.tvBeep);

        // Changes the text view in application to the honk sound!
        tvBeep.setText(vehicle.honkSound());

        // Logs the honk to log cat.
        vehicle.honk();

        // What will print out in logcat if I do:
        sedan.honk();
    }
}
