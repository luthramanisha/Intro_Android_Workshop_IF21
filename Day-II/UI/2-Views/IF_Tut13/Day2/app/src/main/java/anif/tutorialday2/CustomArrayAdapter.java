package anif.tutorialday2;

import android.content.Context;
import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manishaluthra247 on 18/08/2016.
 */
public class CustomArrayAdapter extends ArrayAdapter<Participant>{

    public CustomArrayAdapter(Context context, ArrayList<Participant> participants) {
        super(context, 0, participants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Participant par = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        // Populate the data into the template view using the data object
        tvName.setText(par.getmName());
        // Return the completed view to render on screen
        return convertView;

    }
}
