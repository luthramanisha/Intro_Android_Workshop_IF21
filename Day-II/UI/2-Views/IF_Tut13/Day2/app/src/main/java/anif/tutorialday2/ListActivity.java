package anif.tutorialday2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/***
 * Created by manishaluthra
 * IF_Tutorial creating a list of elements using base ArrayAdapter
 */
public class ListActivity extends android.app.ListActivity {

    static final String[] PARTICIPANTS = new String[] { "Mariam Asaad" ,
    "Janny David" ,
    "Oksana Diuzhikova",
    "Cemre Köksaloğlu",
    "Ezelsu Şimşek",
    "Berra Yalcin",
    "Angela Schaefer",
    "Gizem Karsli"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // no more this
        // setContentView(R.layout.list_fruit);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list,PARTICIPANTS));

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

}
