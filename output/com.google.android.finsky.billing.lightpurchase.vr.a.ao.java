package com.google.android.finsky.billing.lightpurchase.vr.a;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.ao implements Runnable
{

    public final String a;
    public final String b;
    public final String c;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.w d;

    ao(com.google.android.finsky.billing.lightpurchase.vr.a.w p0, String p1, String p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.d.b(this.a, this.b, this.c);
    }

}
