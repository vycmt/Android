package se0965.vtth.com.android.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

import se0965.vtth.com.android.R;
import se0965.vtth.com.android.activity.SearchResultActivity;

/**
 * Created by SONY on 5/28/2016.
 */
public class TabSearch extends Fragment {

    public static final String TEXT_SEARCH_EXTRA = "TEXTSEARCH";
    EditText searchet1, searchet2, searchet3, searchet4, searchet5;
    ImageView btnSearch;
    int count = 2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        return v;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Tìm edit text theo id
        searchet1 = (EditText) view.findViewById(R.id.search_1_et);
        searchet2 = (EditText) view.findViewById(R.id.search_2_et);
        searchet3 = (EditText) view.findViewById(R.id.search_3_et);
        searchet4 = (EditText) view.findViewById(R.id.search_4_et);
        searchet5 = (EditText) view.findViewById(R.id.search_5_et);
        btnSearch = (ImageView) view.findViewById(R.id.search_btn);

        // Tìm floatingaction theo id
        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.search_fab);
        count = 2;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (count) {
                    case 2:
                        count++;
                        searchet2.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        count++;
                        searchet3.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        count++;
                        searchet4.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        count++;
                        searchet5.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }
            }
        });
        hideKeyboard();
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSearch = "";

                String tmp = searchet1.getText().toString().trim();
                if (!tmp.equals("")){
                    textSearch += tmp;
                }

                tmp = searchet2.getText().toString().trim();
                if (!tmp.equals("")){
                    textSearch += textSearch + "-" + tmp;
                }

                tmp = searchet3.getText().toString().trim();
                if (!tmp.equals("")){
                    textSearch += textSearch + "-" + tmp;
                }

                tmp = searchet4.getText().toString().trim();
                if (!tmp.equals("")){
                    textSearch += textSearch + "-" + tmp;
                }

                tmp = searchet5.getText().toString().trim();
                if (!tmp.equals("")){
                    textSearch += textSearch + "-" + tmp;
                }

                if (!textSearch.equals("")){
                    Intent intent = new Intent(getActivity(), SearchResultActivity.class);
                    // Tương tự như khi truyền parameter trong Java
                    intent.putExtra(TEXT_SEARCH_EXTRA, textSearch);
                    startActivity(intent);
                    getActivity().overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_left);
                }
                else{
                    // show message
                    Snackbar.make(view,"Nhập từ khóa để tìm kiếm", Snackbar.LENGTH_LONG).setAction("Action",null).show();
                }
            }
        });

    }

    private void hideKeyboard(){
        searchet1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    hideSoftkeyboeard(v);
                }
            }
        });

        searchet2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    hideSoftkeyboeard(v);
                }
            }
        });

        searchet3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    hideSoftkeyboeard(v);
                }
            }
        });

        searchet4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    hideSoftkeyboeard(v);
                }
            }
        });

        searchet5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    hideSoftkeyboeard(v);
                }
            }
        });
    }

    private void hideSoftkeyboeard(View view){
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}
