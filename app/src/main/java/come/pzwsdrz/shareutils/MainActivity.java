package come.pzwsdrz.shareutils;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void share(View view){
        Toast.makeText(MainActivity.this,"222222",Toast.LENGTH_SHORT).show();

    }
}
