package com.example.stevetran.pantryraider.Pantry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.stevetran.pantryraider.R;

/**
 * Created by Abel on 11/15/2017.
 */

public class PantryFragment extends Fragment implements View.OnClickListener{
    Button savedRecipeButton;
    View view;
    final String TITLE = "Pantry";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pantry, container, false);
        //set up buttons
        savedRecipeButton = (Button) view.findViewById(R.id.savedRecipeButton);
        savedRecipeButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.savedRecipeButton:
                ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.container);
                viewPager.setCurrentItem(1);
                break;
        }
    }
}

