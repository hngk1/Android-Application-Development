package android.example.a107590061_hw4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount = findViewById(R.id.textView);
        if (savedInstanceState != null){
            String i = savedInstanceState.getString("count_value");
            mCount.setText(i);
            count = Integer.parseInt(i);
        }
    }

    public void Count(View view) {
        count ++;
        mCount.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count_value", mCount.getText().toString());
    }

}
