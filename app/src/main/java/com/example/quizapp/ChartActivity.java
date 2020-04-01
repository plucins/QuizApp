package com.example.quizapp;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class ChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        WebView webView = findViewById(R.id.web_view);
        String unencodedHtml = "<a href=\"https://www.statista.com/statistics/1043366/novel-coronavirus-2019ncov-cases-worldwide-by-country/\" rel=\"nofollow\"><img src=\"https://www.statista.com/graphic/1/1043366/novel-coronavirus-2019ncov-cases-worldwide-by-country.jpg\" alt=\"Statistic: Number of novel coronavirus (COVID-19) cases worldwide as of April 1, 2020, by country* | Statista\" style=\"width: 100%; height: auto !important; max-width:1000px;-ms-interpolation-mode: bicubic;\"/></a><br />Find more statistics at  <a href=\"https://www.statista.com\" rel=\"nofollow\">Statista</a>";


        String html = "<!doctype html>\n" +
                "\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "\n" +
                "  <title>The HTML5 Herald</title>\n" +
                "  <meta name=\"description\" content=\"The HTML5 Herald\">\n" +
                "  <meta name=\"author\" content=\"SitePoint\">\n" +
                "\n" +
                "  <link rel=\"stylesheet\" href=\"css/styles.css?v=1.0\">\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                unencodedHtml +
                "</body>\n" +
                "</html>";

        webView.loadData(html, "text/html; charset=utf-8", "UTF-8");

    }
}
