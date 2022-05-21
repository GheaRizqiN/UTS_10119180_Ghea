package com.example.uts_10119180_ghea.main.daily.row;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import uts_10119180_ghea.R;

//3 May 2022, Ghea Rizqi Nabilla, IF5
public class UserRow extends RecyclerView.ViewHolder {

    private TextView usernameTV;

    public UserRow(View itemView) {
        super(itemView);
        usernameTV = itemView.findViewById(R.id.usernameTV);
    }

    public TextView getUsernameTV() {
        return usernameTV;
    }
}
