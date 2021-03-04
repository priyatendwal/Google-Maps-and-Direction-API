package com.project.googlemaps;

import android.app.Application;

import com.project.googlemaps.models.User;

public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
