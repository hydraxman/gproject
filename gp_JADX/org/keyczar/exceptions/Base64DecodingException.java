package org.keyczar.exceptions;

public class Base64DecodingException extends KeyczarException {
    public Base64DecodingException(String str) {
        super(str);
    }
}
