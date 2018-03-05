package as.koding.myfragmentapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public String data;

    public void minMetode(int index, String data) {
        TextView view;
        if (index == 0) {
            view = findViewById(R.id.textView);
        } else {
            view = findViewById(R.id.textView2);
        }
        view.setText(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new FirstFragment())
                    .add(R.id.container, new SecondFragment())
                    .commit();
        }

//        Button knapp1 = findViewById(R.id.button);
//        Button knapp2 = findViewById(R.id.button2);
//
//        knapp1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().replace(R.id.container, new FirstFragment()).commit();
//            }
//        });
//
//        knapp2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getFragmentManager().beginTransaction().replace(R.id.container, new SecondFragment()).commit();
//            }
//        });

    }
}
