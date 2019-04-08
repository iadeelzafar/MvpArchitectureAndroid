package com.example.mvparchitectureandroid.presenter;

import com.example.mvparchitectureandroid.view.Client;


public class MainActivityPresenter {

    private Client client;
    private View view;

    public MainActivityPresenter(View view) {
        this.client = new Client();
        this.view = view;
    }

    public void updateFullName(String fullName){
        client.setFullName(fullName);
        view.updateUserInfoTextView(client.toString());

    }

    public void updateEmail(String email){
        client.setEmail(email);
        view.updateUserInfoTextView(client.toString());

    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
