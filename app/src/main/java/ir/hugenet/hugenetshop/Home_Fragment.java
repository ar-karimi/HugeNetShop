package ir.hugenet.hugenetshop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;


public class Home_Fragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

/*
        view.findViewById(R.id.sub_m_daneshjooii1_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.qut.ac.ir/fa/studentsdepartment/disciplinary_committee"));
                startActivity(browserIntent);
            }
        });
*/

        BannerSlider bannerSlider = view.findViewById(R.id.banner_slider);
        List<Banner> banners = new ArrayList<>();
        banners.add(new DrawableBanner(R.drawable.pic1));
        banners.add(new DrawableBanner(R.drawable.pic2));
        banners.add(new DrawableBanner(R.drawable.pic0));
        bannerSlider.setBanners(banners);

        CountdownView countdownView = view.findViewById(R.id.countdownView);
        countdownView.start(9955500); // Millisecond

        return view;
    }

    public static Home_Fragment newInstance() {

        Bundle args = new Bundle();

        Home_Fragment fragment = new Home_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
}
