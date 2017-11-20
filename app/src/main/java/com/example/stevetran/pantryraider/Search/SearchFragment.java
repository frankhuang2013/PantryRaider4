package com.example.stevetran.pantryraider.Search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.stevetran.pantryraider.R;

/**
 * Created by stevetran on 11/19/17.
 */

public class SearchFragment extends Fragment implements View.OnClickListener{

    //this view
    View view;

    //buttons
    Button searchButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);

        //set up buttons
        searchButton = (Button) view.findViewById(R.id.searchButton);
        searchButton.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.changePasswordButton:
//                Intent pwIntent = new Intent(getActivity(), ChangePasswordActivity.class);
//                startActivity(pwIntent);
//                break;
//            case R.id.setPreferencesButton:
//                Intent spIntent = new Intent(getActivity(), SetPreferencesActivity.class);
//                startActivity(spIntent);
//                break;
        }
    }
}
