package helloworld.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by manishaluthra247 on 02/08/2016.
 */
public class ActivityTwo extends ActionBarActivity{
    TextView ActivityTwoText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        setText();
    }

    public void setText() {
        ActivityTwoText = (TextView) findViewById(R.id.textView);
        ActivityTwoText.setText(getString(R.string.activityTwoText));
    }
}
