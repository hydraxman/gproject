package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

public final class com.google.android.finsky.cv.a.cy extends com.google.protobuf.nano.b
{

    public int a;
    public String[] b;
    public String c;

    cy() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.protobuf.nano.l.j;
        this.c = "";
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
            case 18:
  5:            goto 66;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 55:        v0 = this.b.length;
 27:    v2 = new String[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 45:        v2[v0] = p0.f();
 47:        p0.a();
 50:        v0 = v0 + 1;
        }
 52:    goto 57;
 61:    v2[v0] = p0.f();
 63:    this.b = v2;
 65:    goto 1;
 70:    this.c = p0.f();
 76:    this.a = this.a | 1;
 78:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.a(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a & 1)
            p0.a(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = 0;
        v3 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v1 = 0;
            v2 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0) {
                    v2 = v2 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.b[v0]);
                }
                v0 = v0 + 1;
            }
            v0 = v3 + v1 + v2 * 1;
        }
        else
            v0 = v3;
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.cy))
                v0 = 0;
            else if (!com.google.protobuf.nano.h.a(this.b, ((com.google.android.finsky.cv.a.cy)p0).b))
                v0 = 0;
            else if ((this.a & 1) != (((com.google.android.finsky.cv.a.cy)p0).a & 1))
                v0 = 0;
            else if (!this.c.equals(((com.google.android.finsky.cv.a.cy)p0).c))
                v0 = 0;
            else if (this.aO == 0 || this.aO.b()) {
                if (((com.google.android.finsky.cv.a.cy)p0).aO != 0 && !((com.google.android.finsky.cv.a.cy)p0).aO.b())
                    v0 = 0;
            }
            else
                v0 = this.aO.equals(((com.google.android.finsky.cv.a.cy)p0).aO);
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + (((this.getClass().getName().hashCode() + 527) * 31 + com.google.protobuf.nano.h.a(this.b)) * 31 + this.c.hashCode()) * 31;
    }

}
