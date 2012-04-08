package com.aethermade.shoplist;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
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
    	String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
    		"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
    		"Linux", "OS/2","herpies" };
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    			android.R.layout.simple_list_item_1, android.R.id.text1, values);
    	listView.setAdapter(adapter);
    	//The array list will be replaced with a cursor object to pull information from the database that is being set up from the content manager
    	//This is where the onClickListener goes so you can see the contents of the list that you are selecting
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