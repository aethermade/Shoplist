package com.aethermade.shoplist;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class Shoplist extends Activity {
	
	final String tag = "com.aethermade.shoplist.Shoplist";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	Log.i(tag, "onCreate");
    	//this is where i am going to put ListView stuff to try    	
    	ListView listView = (ListView) findViewById(R.id.homelistview);
    	//Cursor c = 
    }
    
    public void onResume(){
    	super.onResume();
    	Log.i(tag, "onResume");
    }
    
    public void onPause(){
    	super.onPause();
    	Log.i(tag, "onPause");
    }
    
    public void onStop(){
    	super.onStop();
    	Log.i(tag, "onStop");
    }
    
    public void onDestroy(){
    	super.onDestroy();
    	Log.i(tag, "onDestroy");
    }
}