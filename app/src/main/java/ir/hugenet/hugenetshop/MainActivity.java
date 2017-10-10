package ir.hugenet.hugenetshop;

import android.graphics.Typeface;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ss.bottomnavigation.BottomNavigation;
import com.ss.bottomnavigation.events.OnSelectedItemChangeListener;

public class MainActivity extends AppCompatActivity {

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        BottomNavigation bottomNavigation = (BottomNavigation) findViewById(R.id.bottom_navigation);
        Typeface IranSans = Typeface.createFromAsset(this.getAssets(), "IRANSansMobileFonts/IRANSansMobile(FaNum).ttf");
        bottomNavigation.setTypeface(IranSans);

        bottomNavigation.setOnSelectedItemChangeListener(new OnSelectedItemChangeListener() {
            @Override
            public void onSelectedItemChanged(int itemId) {
                switch (itemId) {
                    case R.id.tab_item_home:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_containers, new Home_Fragment());
                        break;
                    case R.id.tab_item_category:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_containers, new Category_Fragment());
                        break;
                    case R.id.tab_item_profile:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_containers, new Profile_Fragment());
                        break;
                    case R.id.tab_item_more:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_fragment_containers, new More_Fragment());
                        break;
                }
                transaction.commit();
            }
        });


    }
}
