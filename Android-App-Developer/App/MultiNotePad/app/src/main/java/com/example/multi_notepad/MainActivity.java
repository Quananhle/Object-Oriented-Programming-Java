package com.example.multi_notepad;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditView myEdits;
    private EditText title;
    private EditText body;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Log.d(TAG, "onCreate: ");
//        title = findViewById(R.id.title);
////        body = findViewById(R.id.body);
//
//        myEdits = new EditView(this);
//        String str1 = getString(R.string.TITLE_KEY);
//        String str2 = myEdits.getValue(str1);
//        title.setText(str2);
//        body.setText(myEdits.getValue(getString(R.string.BODY_KEY)));
//    }
//    public void saveAll(View v) {
//        Log.d(TAG, "saveAll: ");
//        saveTitle(v);
//        saveBody(v);
//    }
//
//    private void saveTitle(View v) {
//        Log.d(TAG, "saveTitle");
//        String titleString = title.getText().toString();
//        myEdits.save(getString(R.string.TITLE_KEY), titleString);
//    }
//    private void saveBody(View v) {
//        Log.d(TAG, "saveBody");
//        String bodyString = body.getText().toString();
//        myEdits.save(getString(R.string.BODY_KEY), bodyString);
//    }
//    public void removeTitle(View v) {
//        Log.d(TAG, "removeTitle: ");
//        myEdits.removeValue(getString(R.string.TITLE_KEY));
//    }
//    public void removeBody(View v) {
//        Log.d(TAG, "removeBody: ");
//        myEdits.removeValue(getString(R.string.BODY_KEY));
//    }
//    public void clearAll(View v) {
//        Log.d(TAG, "clearAll: ");
//        myEdits.clearAll();
//        title.setText("");
//        body.setText("");
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}