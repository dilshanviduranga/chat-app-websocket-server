package com.example.onlinechatapp.client;

import com.example.onlinechatapp.Message;
import java.util.ArrayList;

public interface MessageListener {
    void onMessageReceive(Message message);
    void onActiveUsersUpdated(ArrayList<String> users);
}
