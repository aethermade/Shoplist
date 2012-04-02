package com.aethermade.shoplist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.content.ContentProvider;


public class ShopListProvider extends ContentProvider {
	
	private static final String file = "shoplist.db";
	private static final int version = 0;
	private static String DB_PATH = "/data/data/com.aethermade.shoplist/databases/";
	private static String DB_NAME = "Shoplist.db";
	
	class SLDatabaseHelper extends SQLiteOpenHelper {
		
		public SLDatabaseHelper(Context context, String name, CursorFactory factory, int version) {
			super(context, file, null, version);
			
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			SQLiteDatabase database = SQLiteDatabase.openDatabase(DB_PATH + DB_NAME, null, SQLiteDatabase.CREATE_IF_NECESSARY);
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			

		}

	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}	

}