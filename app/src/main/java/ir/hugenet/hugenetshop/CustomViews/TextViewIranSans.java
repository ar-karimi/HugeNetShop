package ir.hugenet.hugenetshop.CustomViews;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewIranSans extends android.support.v7.widget.AppCompatTextView {


    public TextViewIranSans(Context context) {
        super(context);
    }

    public TextViewIranSans(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface IranSans = Typeface.createFromAsset(context.getAssets(), "IRANSansMobileFonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(IranSans);

    }
}
