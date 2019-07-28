package com.suyoggaikwad;

import javax.jws.WebService;

@WebService
public class AddService {

    public int add2Nos(int num1, int num2) {
        return num1 + num2;
    }
}
