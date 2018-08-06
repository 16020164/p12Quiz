package sg.edu.rp.c346.p12quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvChoose;
    Spinner spn1;
    WebView wvWebsite;

    ArrayList<String> alWeb;
    ArrayAdapter<String> aaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvChoose = findViewById(R.id.textViewChoose);
        spn1 = findViewById(R.id.spinner1);
        wvWebsite = findViewById(R.id.WebViewWebsite);

        alWeb = new ArrayList<>();
        aaWeb = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, alWeb);

        wvWebsite.setWebViewClient(new WebViewClient());

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                switch(i){
                    case 0:
                        alWeb.clear();
                        String url = "https://www.google.com";
                        wvWebsite.loadUrl(url);
                        break;

                    case 1:
                        alWeb.clear();
                        String url2 = "https://www.rp.edu.sg";
                        wvWebsite.loadUrl(url2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
