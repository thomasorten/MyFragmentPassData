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

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.first_fragment, container, false);

        Button knapp1 = (Button) rootView.findViewById(R.id.button3);

        knapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.minMetode(1, "Hei fra first fragment");
            }
        });

        return rootView;
    }
}
