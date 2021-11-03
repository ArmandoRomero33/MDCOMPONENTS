package com.alain.cursos.mdcomponents;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alain.cursos.mdcomponents.utils.Component;
import com.alain.cursos.mdcomponents.utils.Constants;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {

    public static final String TAG = "Button";

    private static Component mInstance;
    Unbinder nUnbinder;


    public ButtonFragment() {
        // Required empty public constructor
    }

    public static Component getmInstance(){
        mInstance = new Component();
        mInstance.setName(TAG);
        mInstance.setPhotoRes(R.drawable.img_button);
        mInstance.setType(Constants.SCROLL);
        return mInstance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        nUnbinder = ButterKnife.bind(this, view);
        return view;
    }

    @OnClick (R.id.btnknable)
    public void onVievClicked() (
            Toast.makeText(getActivity(), R.String.status_enable, Toast.LKNGTHlong).show();
    )

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        nUnbinder.unbind();
    }
}
