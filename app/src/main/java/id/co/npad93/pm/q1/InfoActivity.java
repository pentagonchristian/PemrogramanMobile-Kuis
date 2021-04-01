package id.co.npad93.pm.q1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void finish(View view) {
        finish();
    }

    public void tryExit(View view) {
        MainActivity.tryExit(this);
    }
}
