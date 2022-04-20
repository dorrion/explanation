package com.example.explanation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {

    // 각각의 Fragment마다 Instance를 반환해 줄 메소드를 생성
    public static Fragment1 newinstance(){
        return new Fragment1();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, null);
        Button button_skip = (Button)view.findViewById(R.id.button_skip);

        button_skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //getActivity()로 MainActivity의 replaceFragment를 불러옴.
                ((MainActivity)getActivity()).replaceFragment(Fragment3.newinstance());
            }
        });

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_1, container, false);

        return view;
    }
}