package alice.domnom.rippagebalancedbros.discourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import com.twilio.video.quickstart;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void describeIssue(View view) {
        Intent intent = new Intent(this, DisplayIssue.class);
        startActivity(intent);
    }
}
