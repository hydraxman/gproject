package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ke extends C0758b {
    public static volatile ke[] f12861a;
    public int f12862b;
    public int f12863c;
    public String f12864d;
    public eu f12865e;
    public ai f12866f;
    public hv f12867g;
    public fa f12868h;
    public hf f12869i;

    public static ke[] bG_() {
        if (f12861a == null) {
            synchronized (h.b) {
                if (f12861a == null) {
                    f12861a = new ke[0];
                }
            }
        }
        return f12861a;
    }

    public ke() {
        this.f12862b = 0;
        this.f12863c = 0;
        this.f12864d = "";
        this.f12865e = null;
        this.f12866f = null;
        this.f12867g = null;
        this.f12868h = null;
        this.f12869i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        if ((this.f12862b & 1) != (keVar.f12862b & 1)) {
            return false;
        }
        if (this.f12863c != keVar.f12863c) {
            return false;
        }
        if ((this.f12862b & 2) != (keVar.f12862b & 2)) {
            return false;
        }
        if (!this.f12864d.equals(keVar.f12864d)) {
            return false;
        }
        if (this.f12865e == null) {
            if (keVar.f12865e != null) {
                return false;
            }
        } else if (!this.f12865e.equals(keVar.f12865e)) {
            return false;
        }
        if (this.f12866f == null) {
            if (keVar.f12866f != null) {
                return false;
            }
        } else if (!this.f12866f.equals(keVar.f12866f)) {
            return false;
        }
        if (this.f12867g == null) {
            if (keVar.f12867g != null) {
                return false;
            }
        } else if (!this.f12867g.equals(keVar.f12867g)) {
            return false;
        }
        if (this.f12868h == null) {
            if (keVar.f12868h != null) {
                return false;
            }
        } else if (!this.f12868h.equals(keVar.f12868h)) {
            return false;
        }
        if (this.f12869i == null) {
            if (keVar.f12869i != null) {
                return false;
            }
        } else if (!this.f12869i.equals(keVar.f12869i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(keVar.aO);
        }
        if (keVar.aO == null || keVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12863c) * 31) + this.f12864d.hashCode();
        eu euVar = this.f12865e;
        hashCode = (euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31);
        ai aiVar = this.f12866f;
        hashCode = (aiVar == null ? 0 : aiVar.hashCode()) + (hashCode * 31);
        hv hvVar = this.f12867g;
        hashCode = (hvVar == null ? 0 : hvVar.hashCode()) + (hashCode * 31);
        fa faVar = this.f12868h;
        hashCode = (faVar == null ? 0 : faVar.hashCode()) + (hashCode * 31);
        hf hfVar = this.f12869i;
        hashCode = ((hfVar == null ? 0 : hfVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12862b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12863c);
        }
        if ((this.f12862b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12864d);
        }
        if (this.f12865e != null) {
            codedOutputByteBufferNano.b(3, this.f12865e);
        }
        if (this.f12866f != null) {
            codedOutputByteBufferNano.b(4, this.f12866f);
        }
        if (this.f12867g != null) {
            codedOutputByteBufferNano.b(5, this.f12867g);
        }
        if (this.f12868h != null) {
            codedOutputByteBufferNano.b(6, this.f12868h);
        }
        if (this.f12869i != null) {
            codedOutputByteBufferNano.b(7, this.f12869i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12862b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12863c);
        }
        if ((this.f12862b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12864d);
        }
        if (this.f12865e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12865e);
        }
        if (this.f12866f != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12866f);
        }
        if (this.f12867g != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12867g);
        }
        if (this.f12868h != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12868h);
        }
        if (this.f12869i != null) {
            return b + CodedOutputByteBufferNano.d(7, this.f12869i);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.ke m12939b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0069;
            case 42: goto L_0x007a;
            case 50: goto L_0x008c;
            case 58: goto L_0x009e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f12862b;
        r1 = r1 | 1;
        r6.f12862b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Type";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f12863c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12862b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12862b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f12864d = r0;
        r0 = r6.f12862b;
        r0 = r0 | 2;
        r6.f12862b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f12865e;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.cv.a.eu;
        r0.<init>();
        r6.f12865e = r0;
    L_0x0063:
        r0 = r6.f12865e;
        r7.a(r0);
        goto L_0x0000;
    L_0x0069:
        r0 = r6.f12866f;
        if (r0 != 0) goto L_0x0074;
    L_0x006d:
        r0 = new com.google.android.finsky.cv.a.ai;
        r0.<init>();
        r6.f12866f = r0;
    L_0x0074:
        r0 = r6.f12866f;
        r7.a(r0);
        goto L_0x0000;
    L_0x007a:
        r0 = r6.f12867g;
        if (r0 != 0) goto L_0x0085;
    L_0x007e:
        r0 = new com.google.android.finsky.cv.a.hv;
        r0.<init>();
        r6.f12867g = r0;
    L_0x0085:
        r0 = r6.f12867g;
        r7.a(r0);
        goto L_0x0000;
    L_0x008c:
        r0 = r6.f12868h;
        if (r0 != 0) goto L_0x0097;
    L_0x0090:
        r0 = new com.google.android.finsky.cv.a.fa;
        r0.<init>();
        r6.f12868h = r0;
    L_0x0097:
        r0 = r6.f12868h;
        r7.a(r0);
        goto L_0x0000;
    L_0x009e:
        r0 = r6.f12869i;
        if (r0 != 0) goto L_0x00a9;
    L_0x00a2:
        r0 = new com.google.android.finsky.cv.a.hf;
        r0.<init>();
        r6.f12869i = r0;
    L_0x00a9:
        r0 = r6.f12869i;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.ke.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.ke");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12939b(aVar);
    }
}
