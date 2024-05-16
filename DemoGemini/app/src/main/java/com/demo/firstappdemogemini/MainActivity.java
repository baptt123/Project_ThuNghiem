package com.demo.firstappdemogemini;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.ai.client.generativeai.GenerativeModel;
import com.google.ai.client.generativeai.java.GenerativeModelFutures;

public class MainActivity extends AppCompatActivity {
    private final String MODEL_NAME = "gemini-pro";
    private final String API_KEY = "AIzaSyA1xkhUwSnCT61yH63dPzo2LOCr7cl1bgE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectGeminiAPI();
    }

    public void connectGeminiAPI() {
        // Use a model that's applicable for your use case (see "Implement basic use cases" below)
        GenerativeModel gm = new GenerativeModel(/* modelName */MODEL_NAME,
// Access your API key as a Build Configuration variable (see "Set up your API key" above)
                /* apiKey */ API_KEY);

// Use the GenerativeModelFutures Java compatibility layer which offers
// support for ListenableFuture and Publisher APIs
        GenerativeModelFutures model = GenerativeModelFutures.from(gm);
        Toast.makeText(this, "Ket noi Gemini Thanh Cong", Toast.LENGTH_SHORT).show();
    }
}