package com.allacsta.chatapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;

            case 1 :
                GroupChatFragment groupChatFragment = new GroupChatFragment();
                return groupChatFragment;

            case 2 :
                ContactFragment contactFragment = new ContactFragment();
                return contactFragment;

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0 :
                return "Chat";

            case 1 :
                return "Group";

            case 2 :
                return "Contact";

            default:
                return null;
        }

    }
}
