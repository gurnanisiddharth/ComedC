package com.example.comedc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment {

    HomeFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView sos = root.findViewById(R.id.imageView);
        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "8506050842";
                String dial="tel:"+number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        });
        Button opd = root.findViewById(R.id.opd);
        opd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                OpdFragment opdFragment = new OpdFragment();
                fragmentTransaction.replace(R.id.frag, opdFragment, null);
                fragmentTransaction.commit();
            }
        });
        Button dialysis = root.findViewById(R.id.dialysis);
        dialysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DialysisFragment dialysisFragment = new DialysisFragment();
                fragmentTransaction.replace(R.id.frag, dialysisFragment, null);
                fragmentTransaction.commit();
            }
        });
        Button cathlabs = root.findViewById(R.id.cathlabs);
        cathlabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CathLabsFragment cathLabsFragment = new CathLabsFragment();
                fragmentTransaction.replace(R.id.frag, cathLabsFragment, null);
                fragmentTransaction.commit();
            }
        });
        Button labs = root.findViewById(R.id.labs);
        labs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                LabsFragment labsFragment = new LabsFragment();
                fragmentTransaction.replace(R.id.frag, labsFragment, null);
                fragmentTransaction.commit();
            }
        });
        Button scan = root.findViewById(R.id.scan);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ScanFragment scanFragment = new ScanFragment();
                fragmentTransaction.replace(R.id.frag, scanFragment, null);
                fragmentTransaction.commit();
            }
        });
        Button dietician = root.findViewById(R.id.dietician);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DieticianFragment dieticianFragment = new DieticianFragment();
                fragmentTransaction.replace(R.id.frag, dieticianFragment, null);
                fragmentTransaction.commit();
            }
        });
        return root;
    }
}