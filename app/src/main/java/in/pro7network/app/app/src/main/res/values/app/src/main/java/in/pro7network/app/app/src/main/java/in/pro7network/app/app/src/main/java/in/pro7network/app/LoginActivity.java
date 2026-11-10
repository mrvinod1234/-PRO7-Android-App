package in.pro7network.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 40, 25, 25);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("PRO 7 NETWORK LOGIN");
        title.setTextSize(24);
        title.setTextColor(Color.BLUE);
        layout.addView(title);

        EditText mobile = new EditText(this);
        mobile.setHint("Enter Mobile Number");
        mobile.setInputType(3);
        layout.addView(mobile);

        EditText password = new EditText(this);
        password.setHint("Enter Password");
        password.setInputType(129);
        layout.addView(password);

        Button customer = new Button(this);
        customer.setText("Customer Login");
        layout.addView(customer);

        Button admin = new Button(this);
        admin.setText("Admin Login");
        layout.addView(admin);

        setContentView(layout);
    }
}
