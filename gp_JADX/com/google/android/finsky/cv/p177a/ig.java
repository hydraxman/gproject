package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ig extends C0758b {
    public am f12652a;

    public ig() {
        this.f12652a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        if (this.f12652a == null) {
            if (igVar.f12652a != null) {
                return false;
            }
        } else if (!this.f12652a.equals(igVar.f12652a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(igVar.aO);
        }
        if (igVar.aO == null || igVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        am amVar = this.f12652a;
        hashCode = ((amVar == null ? 0 : amVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12652a != null) {
            codedOutputByteBufferNano.b(1, this.f12652a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12652a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f12652a);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f12652a == null) {
                        this.f12652a = new am();
                    }
                    aVar.a(this.f12652a);
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
