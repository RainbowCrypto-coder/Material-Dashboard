package com.example.dashboard_2;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFrag extends Fragment {

    private CardView cardTop, cardBottom, cardLeft, cardRight;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DashboardFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DashboardFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static DashboardFrag newInstance(String param1, String param2) {
        DashboardFrag fragment = new DashboardFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //card ini
        cardTop = v.findViewById(R.id.cardTop);
        cardRight = v.findViewById(R.id.cardRight);
        cardLeft = v.findViewById(R.id.cardLeft);
        cardBottom = v.findViewById(R.id.cardBottom);

        //ini Animation
        Animation animationTop = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_top_card);
        Animation animationRight = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_right_card);
        Animation animationLeft = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_left_card);
        Animation animationBottom = AnimationUtils.loadAnimation(getActivity(), R.anim.animation_bottom_card);

        //setup Animation
        cardTop.setAnimation(animationTop);
        cardRight.setAnimation(animationRight);
        cardLeft.setAnimation(animationLeft);
        cardBottom.setAnimation(animationBottom);

        // Inflate the layout for this fragment
        return v;
    }
}