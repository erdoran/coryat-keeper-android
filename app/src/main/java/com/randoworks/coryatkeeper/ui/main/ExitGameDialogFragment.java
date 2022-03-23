package com.randoworks.coryatkeeper.ui.main;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.randoworks.coryatkeeper.R;

import java.util.Objects;

public class ExitGameDialogFragment extends DialogFragment {

    FragmentManager fragmentManager;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle("Exit Game?");
        builder.setMessage("Current game data will not be saved").setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                requireActivity().getViewModelStore().clear();

                fragmentManager = getParentFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment.class, null)
                        .setReorderingAllowed(true)
                        .commit();

                Toast.makeText(getContext(), "Button pressed", Toast.LENGTH_SHORT).show();

            }
        })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}