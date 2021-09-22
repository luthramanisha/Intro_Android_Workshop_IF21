package anif.tutorialday3;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.print.PrintDocumentAdapter;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.NotificationCompat;
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
    NotificationManager mNotificationManager;
    NotificationCompat.Builder mBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * IF_Tutorial5 demonstrating linear layout with weight attribute
         * play around with it.
         */
        setContentView(R.layout.activity_main);

        /**
         * IF_Tutorial9 demonstrating creating notification services
         * Displays "Email canceled" when you cancel sending Email
         * by pressing "cancel" button.
         */
        mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder =
                new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.drawable.common_ic_googleplayservices)
                        .setContentTitle("Cancelled")
                        .setContentText("Email is cancelled");
    }

    /**
     * IF_Tutorial7
     * Demonstrating creation of menus
     * @param menu
     * @return
     */

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

    /**
     * onClickListener for "Send" button
     * triggers alert dialog with ok and cancel buttons.
     * @param view
     */
    public void onSend(View view) {
        /**
         * IF_Tutorial8
         * demonstrating creation of alert dialogs
         */
        alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Confirmation");
        alertDialog.setMessage("Send Email?");
        AlertDialog alertDialogNew = alertDialog.create();
        // Setting OK Button
        alertDialogNew.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            /**
             * IF_Tutorial10 for toasts! very easy ain't it?
             * @param dialog
             * @param which
             */
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Email sent successfully", Toast.LENGTH_SHORT).show();
            }
        });

        // Setting Cancel Button
        alertDialogNew.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {

            // Write your code here to execute after dialog close
            public void onClick(DialogInterface dialog, int which) {
                /**
                 * IF_Tutorial9 displaying notification
                 */
                mNotificationManager.notify(1, mBuilder.build());
            }
        });


        alertDialogNew.show();
    }

}

