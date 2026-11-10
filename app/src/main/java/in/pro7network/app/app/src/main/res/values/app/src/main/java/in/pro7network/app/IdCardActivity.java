package in.pro7network.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class IdCardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setPadding(25, 35, 25, 35);
        box.setGravity(Gravity.CENTER);
        box.setBackgroundColor(Color.WHITE);

        TextView company = new TextView(this);
        company.setText("PRO 7 NETWORK");
        company.setTextSize(25);
        company.setTextColor(Color.BLUE);
        company.setGravity(Gravity.CENTER);
        box.addView(company);

        TextView heading = new TextView(this);
        heading.setText("DIGITAL ID CARD");
        heading.setTextSize(20);
        heading.setTextColor(Color.BLACK);
        heading.setPadding(0, 20, 0, 20);
        box.addView(heading);

        TextView details = new TextView(this);
        details.setText(
            "Member Name: Your Name\n\n" +
            "Member ID: Not Assigned\n\n" +
            "Company: PRO 7 NETWORK\n\n" +
            "Status: Demo Card"
        );
        details.setTextSize(18);
        details.setTextColor(Color.DKGRAY);
        box.addView(details);

        setContentView(box);
    }
}
