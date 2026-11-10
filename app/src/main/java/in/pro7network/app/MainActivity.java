package in.pro7network.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;

    void addButton(String name) {
        Button b = new Button(this);
        b.setText(name);
        layout.addView(b);
        b.setOnClickListener(v ->
            Toast.makeText(this, name + " खुल रहा है", Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 35, 25, 25);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("PRO 7 NETWORK");
        title.setTextSize(28);
        title.setTextColor(Color.BLUE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("NETWORK MARKETING INDIA PVT LTD");
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        addButton("Customer Login");
        addButton("Admin Panel");
        addButton("Digital ID Card");
        addButton("Our Products");
        addButton("Company Information");
        addButton("Contact Us");

        setContentView(layout);
    }
}
