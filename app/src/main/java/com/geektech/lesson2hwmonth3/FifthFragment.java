package com.geektech.lesson2hwmonth3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.lesson2hwmonth3.databinding.FragmentFifthBinding;
import com.geektech.lesson2hwmonth3.databinding.FragmentFourthBinding;

public class FifthFragment extends Fragment {

    private FragmentFifthBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFifthBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null){
            String value = getArguments().getString("key.four");
            binding.tvData.setText(value);
        }
    }
}