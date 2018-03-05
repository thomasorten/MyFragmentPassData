package as.koding.myfragmentapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by thomasorten on 20.02.2018.
 */

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.second_fragment, container, false);

        Button knapp2 = (Button) rootView.findViewById(R.id.button4);

        knapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.minMetode(0, "Hei fra second fragment");
            }
        });

        return rootView;
    }
}
