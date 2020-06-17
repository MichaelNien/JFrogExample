package tw.com.michael.nien.jfrog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import tw.com.michael.nien.jfroglibrary.AppCode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg = findViewById(R.id.appmsg);

        AppCode appCode = new AppCode();

        msg.setText(appCode.getAppCodeMsg());

    }
}