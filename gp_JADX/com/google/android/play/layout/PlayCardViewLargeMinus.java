package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;

public class PlayCardViewLargeMinus extends PlayCardViewMedium {
    public PlayCardViewLargeMinus(Context context) {
        this(context, null);
    }

    public PlayCardViewLargeMinus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 3;
    }
}
