package com.example.testfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;

public class Fragment_2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable  ViewGroup container,  Bundle savedInstanceState) {
      return inflater.inflate(R.layout.fragment_2,container,false);
    }
}
