package com.example.android.e_contact;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

class single_row {
    String name;

    String desc;
    int image;

    public single_row(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

}
class myadapter extends BaseAdapter{
    ArrayList<single_row> list;
    Context context;
    public myadapter(Context c) {

        this.context=c;
        list=new ArrayList<single_row>();
        String[] title={"POLICE","AMBULANCE","FIRE FORCE","CHILD LINE","WOMEN HELPLINE","Gas Leakage"};
        String[] description={"","","","","",""};
        int[] images={R.drawable.image1,R.drawable.image,R.drawable.image4,R.drawable.child,R.drawable.women};
        for(int i=0;i<5;i++){
            single_row s=new single_row(title[i],description[i],images[i]);
            list.add(s);
        }


    }

    @Override
    public int getCount() {
        return list.size();
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
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.main2file,parent,false);
        TextView titles=(TextView)row.findViewById(R.id.tst1);
        TextView descrip=(TextView)row.findViewById(R.id.tst2);
        ImageView imag=(ImageView)row.findViewById(R.id.img1);
        single_row singlerow=list.get(position);
        titles.setText(singlerow.name);
        descrip.setText(singlerow.desc);
        imag.setImageResource(singlerow.image);
        return row;

    }


}

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] title={"POLICE","AMBULANCE","FIRE FORCE","CHILD LINE","WOMEN HELPLINE"};
    String[] description={"100","102","101","1098","1091"};
    //int[] images={R.drawable.image1,R.drawable.image,R.drawable.image4,R.drawable.child,R.drawable.women};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.list1);

        lv.setAdapter(new myadapter(this));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView arg0, View arg1,
                                    int position, long arg3) {

                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                String s=title[position].toString();
                String r=description[position].toString();
                in.putExtra("name",s);
                in.putExtra("des",r);
				

                startActivity(in);
            }
        });
    }
}





