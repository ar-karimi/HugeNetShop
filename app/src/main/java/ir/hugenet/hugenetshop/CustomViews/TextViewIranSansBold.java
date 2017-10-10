package ir.hugenet.hugenetshop.CustomViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewIranSansBold extends android.support.v7.widget.AppCompatTextView {


    public TextViewIranSansBold(Context context) {
        super(context);
    }

    public TextViewIranSansBold(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface IranSans = Typeface.createFromAsset(context.getAssets(), "IRANSansMobileFonts/IRANSansMobile(FaNum)_Bold.ttf");
        this.setTypeface(IranSans);
    }
}
