package se0965.vtth.com.android.activity;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import se0965.vtth.com.android.R;
import se0965.vtth.com.android.fragment.TabBookmark;
import se0965.vtth.com.android.manager.FoodManager;
import se0965.vtth.com.android.model.Food;

public class BookmarkFoodDetailActivity extends AppCompatActivity {

    private FoodManager manager;
    private Food food;
    private static final String HTML_STYLE = "<style>img{display: inline;height: auto;max-width: 100%;}</style>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        checkSupportAndroidVersion();
        setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        manager = new FoodManager(this);
        Intent intent = getIntent();
        food = (Food) intent.getSerializableExtra(TabBookmark.DATA_EXCHANGE_OBJECT);


        //load view
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        TextView tvtitle = (TextView) findViewById(R.id.food_detail_title_tv);
        tvtitle.setText(food.getFoodName());
        tvtitle.setSelected(true);
        ImageView cover = (ImageView) findViewById(R.id.food_detail_cover_iv);
        Picasso.with(this).load(food.getImages()).placeholder(R.drawable.ic_loading)
                .error(R.drawable.ic_error)
                .into(cover);
        WebView wvMaterial = (WebView) findViewById(R.id.food_detail_material_wv);
        wvMaterial.loadDataWithBaseURL(null, HTML_STYLE + "<h2>Nguyên liệu</h2>" + food.getMaterialDetail(), "text/html", "UTF-8", null);

        WebView wvTuitorial = (WebView) findViewById(R.id.food_detail_tuitorial_wv);
        wvTuitorial.loadDataWithBaseURL(null, HTML_STYLE + "<h2>Hướng dẫn nấu</h2>" + food.getTutorial(), "text/html", "UTF-8", null);

        TextView tvSource = (TextView) findViewById(R.id.food_detail_source_tv);
        tvSource.setText("Nguồn: " + food.getSource());

        food.setMaterialDetail(food.getMaterialDetail());
        food.setTutorial(food.getTutorial());
        food.setSource(food.getSource());

        //disable foating button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        CoordinatorLayout.LayoutParams p = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
        p.setAnchorId(View.NO_ID);
        fab.setLayoutParams(p);
        fab.setVisibility(View.GONE);
    }

    private void checkSupportAndroidVersion() {
        int currentApiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentApiVersion >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
