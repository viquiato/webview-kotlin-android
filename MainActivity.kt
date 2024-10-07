package com.vkt.prote

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.webkit.SafeBrowsingResponseCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CRIANDO VARIÁVEL WEBVIEW
        val webview = findViewById<WebView>(R.id.webview)

        //Carregar URL
        webview.loadUrl("https://os.protechmak.com")

        //Cliente Chrome
        webview.webViewClient = WebViewClient()

        //Suporte a JavaScript
        webview.settings.javaScriptEnabled = true


        //Suporte a Zoom
        webview.settings.setSupportZoom(true)

    }

}





