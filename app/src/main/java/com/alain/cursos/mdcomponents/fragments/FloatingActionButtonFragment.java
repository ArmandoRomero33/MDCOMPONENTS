package com.alain.cursos.mdcomponents.fragments;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alain.cursos.mdcomponents.R;
import com.alain.cursos.mdcomponents.utils.Component;
import com.alain.cursos.mdcomponents.utils.Constants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class FloatingActionButtonFragment extends Fragment {
    public static final String TAG = "Floating Action Button";

    private static Component mInstance;
    Unbinder mUnbinder;
    @BindView(R.id.fabDefault);
    FloatingActionButton fabDefault;
    @BindView(R.id.fabLegacy)
    FloatingActionButton fabLegacy;
    @BindView(R.id.containerMain)
    ConstraintLayout constraintLayout;
    @BindView(R.id.tvLegacy)
    TextView tvLegacy;


    public ButtonFragment() {
        // Required empty public constructor
    }

    public static Component getmInstance(){
        mInstance = new Component();
        mInstance.setName(TAG);
        mInstance.setPhotoRes(R.drawable.img_fab_default);
        mInstance.setType(Constants.STATIC);
        return mInstance;
    }

    }


    public View FloatingActionButtonFragment() {
        // Required empty public constructor


    @Override
    public View onCreateView(LayoutInflater Inflater inflater;
        inflater, ViewGroupcontainer,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_floating_action_button, ontainer, false);
        mUnbinder = ButterKnife.bind(this, view);

        fabDefault.setOnClickListener(view1 -> Toast.makeText(getActivity(), R.string.message_action_success,
                Toast.LENGTH_SHORT).show());
        fabLegacy.setOnClickListener(view1 ->
        {fabLegacy.setVisibility(View.GONE)
         tvLegacy.setVisibility(View.GONE);
        });

        return view;
    }
    @Override
    public void onDestroyView();
    super.onDestroyView();
    mUnbinder.unbind();
}