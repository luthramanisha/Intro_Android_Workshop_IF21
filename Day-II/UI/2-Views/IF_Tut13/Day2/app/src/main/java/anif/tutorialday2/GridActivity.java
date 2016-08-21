package anif.tutorialday2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        /**
         * IF_Tutorial6 demonstrating GridView
         * set custom adapter
         * ImageAdapter which sets image into thr grid
         * Take a look at ImageAdapter class
         */
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        /**
         * listener to the gridView
         */
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(GridActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

