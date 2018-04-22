package com.example.mylibrary.channellist.presenter;

import android.content.Context;

import com.example.mylibrary.channellist.model.ChannelModel;
import com.example.mylibrary.channellist.view.ChannelView;

import java.util.ArrayList;

public class ChannelImplementor implements ChannelPresenter{

    ChannelView channelView;
    Context context;

    public ChannelImplementor(ChannelView channelView) {
        this.channelView = channelView;
        this.context = context;
    }


    @Override
    public void getChannelList() {
        ChannelModel channelModel = new ChannelModel("Nepali",1);
        ChannelModel channelModel1 = new ChannelModel("English",2);
        ChannelModel channelModel2 = new ChannelModel("Hindi",3);
        ArrayList<ChannelModel> channelModels = new ArrayList<>();
        channelModels.add(channelModel);
        channelModels.add(channelModel1);
        channelModels.add(channelModel2);
        channelView.sendChannelList(channelModels);
    }
}
