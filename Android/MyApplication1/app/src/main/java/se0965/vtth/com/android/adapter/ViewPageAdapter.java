package se0965.vtth.com.android.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import se0965.vtth.com.android.R;
import se0965.vtth.com.android.fragment.TabBookmark;
import se0965.vtth.com.android.fragment.TabSearch;

/**
 * Created by SONY on 5/28/2016.
 */
public class ViewPageAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int numOfTabs;
    int icons[] = {R.drawable.ic_home, R.drawable.ic_heart};
    Context context;

    public ViewPageAdapter(FragmentManager fm, CharSequence[] titles, int numOfTabs, Context context) {
        super(fm);
        this.titles = titles;
        this.numOfTabs = numOfTabs;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            TabSearch tabSearch = new TabSearch();
            return tabSearch;
        } else {
            // New Tab Bookmark here
            TabBookmark tabBookmark = new TabBookmark();
            return tabBookmark;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Drawable drawable = context.getResources().getDrawable(icons[position]);
        drawable.setBounds(0, 0, 72, 72);
        ImageSpan imageSpan = new ImageSpan(drawable);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(imageSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //return titles[position];
        return spannableString;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
