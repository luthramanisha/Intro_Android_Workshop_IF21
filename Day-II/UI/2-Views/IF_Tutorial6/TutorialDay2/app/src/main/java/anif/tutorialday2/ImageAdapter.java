package anif.tutorialday2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by manishaluthra247 on 14/08/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.avatar_1_raster, R.drawable.avatar_2_raster,
            R.drawable.avatar_3_raster, R.drawable.avatar_4_raster,
            R.drawable.avatar_5_raster, R.drawable.avatar_6_raster,
            R.drawable.avatar_7_raster, R.drawable.avatar_8_raster,
            R.drawable.avatar_9_raster, R.drawable.avatar_10_raster,
            R.drawable.avatar_11_raster, R.drawable.avatar_12_raster,

    };
}
