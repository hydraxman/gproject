package com.google.android.libraries.bind.card;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

public class CardListPadding extends BindingFrameLayout {
    public CardListPadding(Context context) {
        this(context, null, 0);
    }

    public CardListPadding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardListPadding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
