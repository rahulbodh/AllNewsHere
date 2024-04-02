package com.example.allnewshere;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class SkyNewsFragment extends Fragment {


    public SkyNewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_sky_news, container, false);
        WebView webView = view.findViewById(R.id.webViewSkyNews);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new WebViewController());

        return view;
    }
}