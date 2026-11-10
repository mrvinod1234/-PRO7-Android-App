package in.pro7network.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class AdminActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 35, 25, 25);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("PRO 7 ADMIN PANEL");
        title.setTextSize(25);
        title.setTextColor(Color.BLUE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        String[] options = {
            "Manage Customers",
            "Manage Members",
            "Manage Products",
            "View ID Cards",
            "Company Information"
        };

        for (String option : options) {
            Button button = new Button(this);
            button.setText(option);
            layout.addView(button);
        }

        setContentView(layout);
    }
}
