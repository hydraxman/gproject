package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.ca extends com.google.protobuf.nano.b
{

    public int a;
    public ax[] b;
    public long c;
    public String d;

    ca() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.android.finsky.cv.a.ax.aG_();
        this.c = 0;
        this.d = "";
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 16:
  5:            goto 78;
            case 26:
  5:            goto 91;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.b.length;
 27:    v2 = new ax[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.android.finsky.cv.a.ax();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.android.finsky.cv.a.ax();
 72:    p0.a(v2[v0]);
 75:    this.b = v2;
 77:    goto 1;
 82:    this.c = p0.j();
 88:    this.a = this.a | 1;
 90:    goto 1;
 95:    this.d = p0.f();
101:    this.a = this.a | 2;
103:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            p0.b(2, this.c);
        if (this.a & 2)
            p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v1 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            v1 = v1 + CodedOutputByteBufferNano.f(2, this.c);
        if (this.a & 2)
            v1 = v1 + CodedOutputByteBufferNano.b(3, this.d);
        return v1;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ca))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.b, ((com.google.android.finsky.cv.a.ca)p0).b))
                v0 = 0;
            else if ((this.a & 1) != (((com.google.android.finsky.cv.a.ca)p0).a & 1))
                v0 = 0;
            else if (this.c != ((com.google.android.finsky.cv.a.ca)p0).c)
                v0 = 0;
            else if ((this.a & 2) != (((com.google.android.finsky.cv.a.ca)p0).a & 2))
                v0 = 0;
            else if (!this.d.equals(((com.google.android.finsky.cv.a.ca)p0).d))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.ca)p0).aO != 0 && !((com.google.android.finsky.cv.a.ca)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.ca)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31 + (int)(this.c ^ this.c >>> 32)) * 31 + this.d.hashCode()) * 31;
    }

}
