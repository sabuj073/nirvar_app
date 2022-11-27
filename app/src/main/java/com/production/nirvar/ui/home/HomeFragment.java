package com.production.nirvar.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.production.nirvar.PrescriptionCategoryActivity;
import com.production.nirvar.PrescriptionHistory;
import com.production.nirvar.R;
import com.production.nirvar.ScanActivity;
import com.production.nirvar.SharemyprofileActivity;
import com.production.nirvar.UploadOptionActivity;
import com.production.nirvar.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    ImageButton scannow,history;
    ImageView shareprofile;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        scannow = root.findViewById(R.id.scammow);
        history = root.findViewById(R.id.history);
        shareprofile = root.findViewById(R.id.imageView4);
        scannow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UploadOptionActivity.class);
                startActivity(intent);
            }
        });

        shareprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SharemyprofileActivity.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PrescriptionHistory.class);
                startActivity(intent);
            }
        });


        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}