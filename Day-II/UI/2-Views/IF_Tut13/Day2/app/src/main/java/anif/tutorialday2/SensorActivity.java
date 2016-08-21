package anif.tutorialday2;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SensorActivity extends AppCompatActivity {
    private SensorManager mSensorMgr;
    private TextView mSensorText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        mSensorMgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        final List<Sensor> deviceSensors = mSensorMgr.getSensorList(Sensor.TYPE_ALL);

        //Create TextView at runtime
        //mSensorText = new TextView(this);
        //setContentView(mSensorText);

        //Create TextView by layout
        mSensorText =(TextView) findViewById(R.id.textView5);
        for(Sensor sensor:deviceSensors)
            mSensorText.append(sensor.getName().toString() + "\n");
    }
}
