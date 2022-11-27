package com.production.nirvar.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.production.nirvar.GluecoseRateInputActivity;
import com.production.nirvar.MenstrualCalanderSelectFirstDateActivity;
import com.production.nirvar.R;
import com.production.nirvar.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    Button glucoserate,bloodpressure,medicinechart,menstrualcalander;

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        glucoserate = root.findViewById(R.id.glucoseratebtn);
        bloodpressure = root.findViewById(R.id.bloodpresurebtn);
        medicinechart = root.findViewById(R.id.medicinechartbtn);
        menstrualcalander = root.findViewById(R.id.menstrualcalanderbtn);

        glucoserate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GluecoseRateInputActivity.class);
                startActivity(intent);
            }
        });

        bloodpressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        medicinechart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        menstrualcalander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MenstrualCalanderSelectFirstDateActivity.class);
                startActivity(intent);
            }
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}