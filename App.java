package com.example.geminiapp;

public class App {
    public static void main(String[] args) {
        String apiKey = System.getenv("GEMINI_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("⚠️ Please set GEMINI_API_KEY environment variable!");
            return;
        }

        GeminiService service = new GeminiService(apiKey);

        String prompt = "Write a short motivational quote.";
        String response = service.askGemini(prompt);

        System.out.println("Prompt: " + prompt);
        System.out.println("Gemini Response: " + response);
    }
}
