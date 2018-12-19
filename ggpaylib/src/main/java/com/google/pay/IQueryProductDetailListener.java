package com.google.pay;

public interface IQueryProductDetailListener {

    void querySuccess(long price, String currency,String other);

    void queryFailed(String msg);

    void queryIdNoExist();

}
