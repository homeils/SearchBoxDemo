package com.renoside.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.renoside.searchbox.OnRightIcoListener;
import com.renoside.searchbox.SearchBox;

public class MainActivity extends AppCompatActivity {

    private SearchBox searchBox;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBox = findViewById(R.id.search_box);
        button = findViewById(R.id.button);
        searchBox.setOnRightIcoListener(new OnRightIcoListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "你点击了右边的图标", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, searchBox.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
