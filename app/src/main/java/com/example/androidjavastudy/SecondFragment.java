package com.example.androidjavastudy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.androidjavastudy.databinding.FragmentSecondBinding;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setDate();
        setAuthor();

        binding.buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        binding.buttonForward.setOnClickListener(view1 -> Navigation.findNavController(view1).navigate(R.id.action_SecondFragment_to_PersonForm));
    }

    public void setAuthor(){
        String[] authors = {"Lucas Stirling", "Nathalia Amorim", "Tacísio Neto", "Aline Marques", "João Santos", "Marcelo Gonçalves"};
        int picker =(int) (Math.random()*authors.length);
        String selectedAuthor = authors[picker];
        binding.author.setText(selectedAuthor);
    }

    public void setDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        binding.date.setText(formattedDate);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}