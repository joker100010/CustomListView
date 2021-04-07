package com.example.customlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int images[] = {R.drawable.my, R.drawable.download, R.drawable.elme};
    String names[] = {"Hasnain", "Hostel", "ELme"};
    String Description[] = {"Good student", "Good hotel", "Good Student"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView List = (ListView) findViewById(R.id.Listview);

        CustomerAdapter ca = new CustomerAdapter();
        List.setAdapter(ca);
    }

    class CustomerAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
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
            convertView = getLayoutInflater().inflate(R.layout.bssealayout, null);
            ImageView img = convertView.findViewById(R.id.imageView);
            TextView txt = convertView.findViewById(R.id.textView);
            TextView txt2 = convertView.findViewById(R.id.textView2);

            img.setImageResource(images[position]);
            txt.setText(names[position]);
            txt2.setText(Description[position]);

            return convertView;

        }
    }
}
