package com.example.mylibrary.channellist.view;

import android.util.Log;

import com.example.mylibrary.channellist.model.ChannelModel;
import com.example.mylibrary.channellist.presenter.ChannelImplementor;
import com.example.mylibrary.channellist.presenter.ChannelPresenter;

import java.util.ArrayList;

public abstract class ChannelController implements ChannelView {


    ArrayList<ChannelModel> channelModels;

    public ChannelController() {
    }

    public void getChannelList(){
        ChannelPresenter channelPresenter = new ChannelImplementor(this);
        channelPresenter.getChannelList();
    }

    @Override
    public void sendChannelList(ArrayList<ChannelModel> channelModels) {
        Log.d("CheckingChannelList", channelModels.size() +"   yes done");
        allChannelList(channelModels);
    }

    protected abstract void allChannelList(ArrayList<ChannelModel> channelModels);
}
