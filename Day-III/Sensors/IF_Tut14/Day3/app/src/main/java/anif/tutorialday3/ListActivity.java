package anif.tutorialday3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/***
 * Created by manishaluthra
 * IF_Tutorial creating a list of elements using base ArrayAdapter
 */
public class ListActivity extends android.app.ListActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private List<String> sensors = new ArrayList<String>();
    static final String[] PARTICIPANTS = new String[] { "abc" ,
    "def" ,
    "ghi",
    "jkl",
    "mno",
    "pqr",
    "stu",
    "vwx",
    "yza",
    "bcd",
    "efg",
    "hij"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
        IF_Tutorial14 for sensors
         **/
        
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor: deviceSensors) {
            sensors.add(sensor.getName());
        }
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list, sensors));
        //setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list, PARTICIPANTS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
