package com.google.android.finsky.uninstall.v2a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.aj;

final /* synthetic */ class C4618k implements C0657w {
    public final C4613f f23784a;

    C4618k(C4613f c4613f) {
        this.f23784a = c4613f;
    }

    public final void mo1062a(VolleyError volleyError) {
        C4613f c4613f = this.f23784a;
        C2474c c2474c = new C2474c(164);
        aj.m13208a(c2474c, volleyError, false);
        c4613f.f23774q.m13371a(c2474c.f13342a, null);
        c4613f.m21537a(volleyError);
    }
}
