package com.squareup.okhttp;

public enum ao {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public final String f39333e;

    private ao(String str) {
        this.f39333e = str;
    }

    public static ao m36667a(String str) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    obj = 1;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    obj = null;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    obj = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return TLS_1_2;
            case 1:
                return TLS_1_1;
            case 2:
                return TLS_1_0;
            case 3:
                return SSL_3_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }
}
