package anif.tutorialday2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.print.PrintDocumentAdapter;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void onSend(View view) {
        alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Confirmation");
        alertDialog.setMessage("Send Email?");
        AlertDialog alertDialogNew = alertDialog.create();
        // Setting OK Button
        alertDialogNew.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(), "Email sent successfully", Toast.LENGTH_SHORT).show();

            }
        });

        // Setting Cancel Button
        alertDialogNew.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {

            // Write your code here to execute after dialog close
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Email send cancelled", Toast.LENGTH_SHORT).show();
            }
        });


        alertDialogNew.show();
    }

}

