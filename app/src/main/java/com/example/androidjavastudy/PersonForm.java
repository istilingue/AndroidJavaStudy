package com.example.androidjavastudy;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidjavastudy.databinding.FragmentFirstBinding;
import com.example.androidjavastudy.databinding.FragmentPersonFormBinding;


public class PersonForm extends Fragment {

  FragmentPersonFormBinding binding;
    public PersonForm() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPersonFormBinding.inflate(inflater, container, false);
        return inflater.inflate(R.layout.fragment_person_form, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button.setOnClickListener(view1-> {});
    }
}