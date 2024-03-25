package ntu.duyhn_63130262.cau2_appstopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextViewtimer;
    Button nutStart, nutPause, nutReset;
    int sec = 0;
    boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindControl();
    }

    void FindControl() {
        TextViewtimer = (TextView) findViewById(R.id.timer);
        nutStart = (Button) findViewById(R.id.btnStart);
        nutPause = (Button) findViewById(R.id.btnPause);
        nutReset = (Button) findViewById(R.id.btnReset);

        nutReset.setEnabled(true);
        nutStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeStart();
                nutReset.setEnabled(true);
            }
        });

        nutPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePause();
            }
        });

        nutReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!run) {
                    timeReset();
                    nutReset.setEnabled(false);
                }
            }
        });
    }
}