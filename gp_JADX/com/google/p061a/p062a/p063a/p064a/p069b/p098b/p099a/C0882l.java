package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.h.c.c.b.d.b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0882l extends C0758b {
    public int f5613a;
    public b f5614b;

    public final b m5509a() {
        if (this.f5613a == 0) {
            return this.f5614b;
        }
        return null;
    }

    public C0882l() {
        this.f5613a = -1;
        this.f5613a = -1;
        this.f5614b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5613a == 0) {
            codedOutputByteBufferNano.b(2, this.f5614b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5613a == 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f5614b);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f5614b == null) {
                        this.f5614b = new b();
                    }
                    aVar.a(this.f5614b);
                    this.f5613a = 0;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
