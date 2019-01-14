package com.shaadi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.shaadi.R;
import com.shaadi.models.User;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 11-01-2019
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.CountryViewHolder> {
    private List<User> mUsers;
    private Context mContext;

    public UserAdapter(Context context, List<User> users ) {
        this.mContext = context;
        this.mUsers = users;
   }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_user, viewGroup, false);

        return new CountryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder countryViewHolder, int position) {
        final User user = mUsers.get(position);
        String age = String.valueOf(user.getDob().getAge());

        String street = user.getLocation().getStreet();
        String city = user.getLocation().getCity();
        String state = user.getLocation().getState();

        countryViewHolder.countryTitle.setText(age + "Years, " + street + " " +city + state);

        String fName = null, lname;
        if(user.getName().getFirst() != null) {
            fName = user.getName().getFirst();
            fName = capatalizedWord(fName);
        }

        String lName = user.getName().getLast() != null ? user.getName().getFirst() : "";

        countryViewHolder.userName.setText(fName + " " + lName);

        Picasso.with(mContext).load(user.getPicture().getLarge())
                .into(countryViewHolder.countryIcon);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        public ImageView countryIcon;
        public TextView countryTitle;
        public TextView userName;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            countryIcon = itemView.findViewById(R.id.user_profile_pic);
            countryTitle = itemView.findViewById(R.id.user_intro);
            userName = itemView.findViewById(R.id.user_name);
        }
    }

    public String capatalizedWord(String word) {
        if(word == null || word.length() < 1)
            return null;
        else {
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
    }
}
