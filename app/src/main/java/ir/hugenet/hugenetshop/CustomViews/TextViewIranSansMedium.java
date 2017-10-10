package ir.hugenet.hugenetshop.CustomViews;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewIranSansMedium extends android.support.v7.widget.AppCompatTextView {


    public TextViewIranSansMedium(Context context) {
        super(context);
    }

    public TextViewIranSansMedium(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface IranSans = Typeface.createFromAsset(context.getAssets(), "IRANSansMobileFonts/IRANSansMobile(FaNum)_Medium.ttf");
        this.setTypeface(IranSans);

    }
}
