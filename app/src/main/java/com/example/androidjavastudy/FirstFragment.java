package com.example.androidjavastudy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidjavastudy.databinding.FragmentFirstBinding;

import java.security.PublicKey;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupListeners();
    }

    public void setupListeners(){
    binding.contar.setOnClickListener(view -> {
       int max=10;
       int min=0;
       int range = max-min+1;
       int number = (int) (Math.random() * range);

       binding.counter.setText(getString(R.string.number_of_choice,number));
       System.out.println("Seu numero é:" + number);
        });
   }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}