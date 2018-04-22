package com.example.mylibrary.channellist.view;

import com.example.mylibrary.channellist.model.ChannelModel;

import java.util.ArrayList;

public interface ChannelView {
    void sendChannelList(ArrayList<ChannelModel> channelModels);
}
