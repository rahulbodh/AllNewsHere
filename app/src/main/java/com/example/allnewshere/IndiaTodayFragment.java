package com.example.allnewshere;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class IndiaTodayFragment extends Fragment {



    public IndiaTodayFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_india_today, container, false);
        WebView webView = view.findViewById(R.id.webViewIndiaToday);

        // Enable JavaScript if required
        WebSettings webSettings = webView.getSettings();

        // Load the Url
        webView.loadUrl("https://www.indiatodayhindi.com/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}