package anif.tutorialday2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {
    private String TAG = "CustomListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        populateParticipantsList();
    }

    public void populateParticipantsList() {
        Log.v(TAG, "participants populateParticipantsList called");
        //Step 1: Create an arraylist
        ArrayList<Participant> participants = Participant.getParticipants();

        //Step 2: Create an adapter to convert array to views
        CustomArrayAdapter myParticipantAdapter = new CustomArrayAdapter(this, participants);

        //Step 3: Attach adapter to listview
        ListView lV = (ListView) findViewById(R.id.lvParticipants);
        lV.setAdapter(myParticipantAdapter);

        lV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
