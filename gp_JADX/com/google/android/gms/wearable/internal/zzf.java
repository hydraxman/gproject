package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzf extends zza {
    public static final Creator CREATOR = new bh();
    public final int f28675a;

    public zzf(int i) {
        this.f28675a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28675a);
        C5130b.m23853b(parcel, a);
    }
}
