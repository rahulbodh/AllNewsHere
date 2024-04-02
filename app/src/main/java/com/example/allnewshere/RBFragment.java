package com.example.allnewshere;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class RBFragment extends Fragment {


    public RBFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_r_b, container, false);

        WebView webView = view.findViewById(R.id.webViewRB);

        // Enable JavaScript if required
        WebSettings webSettings = webView.getSettings();

        // Load the Url
        webView.loadUrl("https://www.republicbharat.com/livetv/");
        webView.setWebViewClient(new WebViewController());
        return view;
    }
}