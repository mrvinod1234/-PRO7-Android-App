package in.pro7network.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class ProductActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 30, 25, 30);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("PRO 7 NETWORK PRODUCTS");
        title.setTextSize(24);
        title.setTextColor(Color.BLUE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        String[] products = {
            "Shirts",
            "T-Shirts",
            "Pants",
            "Shoes",
            "Belts",
            "Other Products"
        };

        for (String product : products) {
            TextView item = new TextView(this);
            item.setText("• " + product);
            item.setTextSize(20);
            item.setTextColor(Color.BLACK);
            item.setPadding(15, 15, 15, 15);
            layout.addView(item);
        }

        setContentView(layout);
    }
}
