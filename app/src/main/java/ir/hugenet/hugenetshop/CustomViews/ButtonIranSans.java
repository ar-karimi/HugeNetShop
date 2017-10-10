package ir.hugenet.hugenetshop.CustomViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class ButtonIranSans extends android.support.v7.widget.AppCompatButton {
    public ButtonIranSans(Context context) {
        super(context);
    }

    public ButtonIranSans(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface IranSans = Typeface.createFromAsset(context.getAssets(),"IRANSansMobileFonts/IRANSansMobile(FaNum)_Medium.ttf");
        this.setTypeface(IranSans);
    }
}
