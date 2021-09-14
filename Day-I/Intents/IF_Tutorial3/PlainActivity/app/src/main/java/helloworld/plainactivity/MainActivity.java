package helloworld.plainactivity;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText mName, mAddress, mPhone, mSchool;
    private RadioButton yes,no;
    private boolean mAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    Button sbt = (Button) findViewById(R.id.button);

        mName = (EditText) findViewById(R.id.editText);
        mAddress = (EditText) findViewById(R.id.editText2);
        mPhone = (EditText) findViewById(R.id.editText3);
        mSchool = (EditText) findViewById(R.id.editText4);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Log.v(TAG, "Name:"+  mName.getText().toString());
                Log.v(TAG, "Address:"+ mAddress.getText().toString() );
                Log.v(TAG, "Phone:"+ mPhone.getText().toString());
                Log.v(TAG, "School:"+ mSchool.getText().toString() );
                Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
                infoIntent.putExtra("Name", mName.getText().toString());
                infoIntent.putExtra("Address", mAddress.getText().toString());
                infoIntent.putExtra("Phone", mPhone.getText().toString());
                infoIntent.putExtra("School",mSchool.getText().toString());
                infoIntent.putExtra("UserLikeAndroid", mAndroid);
                startActivity(infoIntent);
            }
        });
    }
    /*    sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Name:"+  mName.getText().toString());
                Log.v(TAG, "Address:"+ mAddress.getText().toString() );
                Log.v(TAG, "Phone:"+ mPhone.getText().toString());
                Log.v(TAG, "School:"+ mSchool.getText().toString() );
                Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
                infoIntent.putExtra("Name", mName.getText().toString());
                infoIntent.putExtra("Address", mAddress.getText().toString() );
                infoIntent.putExtra("Phone", mPhone.getText().toString());
                infoIntent.putExtra("School",mSchool.getText().toString() );
                infoIntent.putExtra("UserLikeAndroid", mAndroid);
                startActivity(infoIntent);
            }
        });

    }*/

    /**
     * Called when user press submit button
     */
    public void submit(View view) {
         Log.v(TAG, "Name:"+  mName.getText().toString());
         Log.v(TAG, "Address:"+ mAddress.getText().toString() );
         Log.v(TAG, "Phone:"+ mPhone.getText().toString());
         Log.v(TAG, "School:"+ mSchool.getText().toString() );
         Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
         infoIntent.putExtra("Name", mName.getText().toString());
         infoIntent.putExtra("Address", mAddress.getText().toString() );
         infoIntent.putExtra("Phone", mPhone.getText().toString());
         infoIntent.putExtra("School",mSchool.getText().toString() );
         infoIntent.putExtra("UserLikeAndroid", mAndroid);
         startActivity(infoIntent);
    }

    public void onRadioButtonClicked(View view) {
        boolean check = ((RadioButton) view).isChecked();
        yes = (RadioButton) findViewById(R.id.yes);
        no = (RadioButton) findViewById(R.id.no);

        //Check which button is clicked
        switch(view.getId()) {
            case R.id.yes:
                if (check)
                    mAndroid = true;
                    no.setChecked(false);
                break;
            case R.id.no:
                if (check)
                    mAndroid = false;
                    yes.setChecked(false);
                break;
            default:
                mAndroid = true; // :)
        }

    }



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
