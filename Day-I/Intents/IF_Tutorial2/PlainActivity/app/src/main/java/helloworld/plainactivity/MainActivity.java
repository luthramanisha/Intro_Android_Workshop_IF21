package helloworld.plainactivity;

import android.content.Intent;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText name, address, phone, school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sbt = (Button) findViewById(R.id.button);

        name = (EditText) findViewById(R.id.editText);
        address = (EditText) findViewById(R.id.editText2);
        phone = (EditText) findViewById(R.id.editText3);
        school = (EditText) findViewById(R.id.editText4);

        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Name:"+  name.getText().toString());
                Log.v(TAG, "Address:"+ address.getText().toString() );
                Log.v(TAG, "Phone:"+ phone.getText().toString());
                Log.v(TAG, "School:"+ school.getText().toString() );
                Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
                infoIntent.putExtra("Name", name.getText().toString());
                infoIntent.putExtra("Address", address.getText().toString() );
                infoIntent.putExtra("Phone", phone.getText().toString());
                infoIntent.putExtra("School",school.getText().toString() );
                startActivity(infoIntent);
            }
        });

    }

    /**
     * Called when user press submit button
     */
 /*   public void submit(View view) {
        Log.v(TAG, "Name:"+  name.getText().toString());
        Log.v(TAG, "Address:"+ address.getText().toString() );
        Log.v(TAG, "Phone:"+ phone.getText().toString());
        Log.v(TAG, "School:"+ school.getText().toString() );
        Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
        infoIntent.putExtra("Name", name.getText().toString());
        infoIntent.putExtra("Address", address.getText().toString() );
        infoIntent.putExtra("Phone", phone.getText().toString());
        infoIntent.putExtra("School",school.getText().toString() );
        startActivity(infoIntent);
    }*/
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
