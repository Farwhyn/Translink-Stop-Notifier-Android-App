package fourasians.translinkstopnote;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BusStops extends AppCompatActivity {

    //private int bus = 99;
    private Set<Integer> buses = new HashSet<>();

    private List<String> testBusStops = new ArrayList<>();
    Button b;
    ScrollView scrollview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scrollview = new ScrollView(this);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(LinearLayout.VERTICAL);
        scrollview.addView(linearlayout);

        //his function, returns Set
        // buses = his set
        buses.add(1);
        buses.add(2);
        buses.add(3);
        buses.add(99);

        testBusStops.add("Commercial");
        testBusStops.add("Clark");
        testBusStops.add("Fraser");
        testBusStops.add("Main");
        testBusStops.add("Cambie");
        testBusStops.add("Heather");
        testBusStops.add("Granville");
        testBusStops.add("Arbutus");
        testBusStops.add("MacDonald");
        testBusStops.add("Alma");
        testBusStops.add("Sasumat");
        testBusStops.add("Allison");
        testBusStops.add("UBC");

        int input = MainActivity.inputText;
        if (buses.contains(input)) {
            for(int i = 0; i<testBusStops.size();i++)
            {
                LinearLayout linear1 = new LinearLayout(this);
                linear1.setOrientation(LinearLayout.HORIZONTAL);
                linearlayout.addView(linear1);
                b = new Button(this);
                b.setText(testBusStops.get(i));
                b.setId(i);
                b.setTextSize(20);
                //b.setPadding(20, 20, 20, 20);
                b.setTypeface(Typeface.SERIF, Typeface.BOLD_ITALIC);
                b.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                b.setHeight(300);
                b.setWidth(500);

                linear1.addView(b);

                b.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Toast.makeText(getApplicationContext(), "User entered " + v.getId(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
            this.setContentView(scrollview);

        } else {
            Intent i = new Intent(BusStops.this, MainActivity.class);
            startActivity(i);

        }



    }

}