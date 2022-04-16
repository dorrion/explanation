package org.techtown.pager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // 전달되는 파라미터를 menu로 바꿈. 이러면 menu xml 내용이 인플레이션돼서 나타남.
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
}