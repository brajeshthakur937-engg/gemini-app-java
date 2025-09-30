package com.example.geminiapp;

public class GeminiService {
    private final String apiKey;

    public GeminiService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String askGemini(String prompt) {
        // This is a placeholder for real Gemini API call
        return "This is a simulated response for: " + prompt;
    }
}
