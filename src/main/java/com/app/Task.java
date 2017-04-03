package com.app;

import java.sql.Timestamp;

/**
 * Created by sadmin on 03.04.17.
 */
public class Task {
    private int id;
    private String text;
    private Timestamp createDt;
    private Timestamp expireDt;
    private int statusId;


    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Timestamp getCreateDt() {
        return createDt;
    }

    public Timestamp getExpireDt() {
        return expireDt;
    }

    public int getStatusId() {
        return statusId;
    }
}
