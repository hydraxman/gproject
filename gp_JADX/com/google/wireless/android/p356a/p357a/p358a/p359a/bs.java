package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bs extends b {
    public int f35837a;
    public int f35838b;
    public boolean f35839c;

    public bs() {
        this.f35837a = 0;
        this.f35838b = 0;
        this.f35839c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34225a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35837a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35838b);
        }
        if ((this.f35837a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35839c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34226b() {
        int b = super.b();
        if ((this.f35837a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35838b);
        }
        if ((this.f35837a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.bs m34223b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35837a;
        r1 = r1 | 1;
        r6.f35837a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum InlineEntryType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f35838b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35837a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35837a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33563e();
        r6.f35839c = r0;
        r0 = r6.f35837a;
        r0 = r0 | 2;
        r6.f35837a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.bs.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.bs");
    }

    public final /* synthetic */ i m34224a(C7213a c7213a) {
        return m34223b(c7213a);
    }
}
