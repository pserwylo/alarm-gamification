package com.example.alarm.gamify.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.example.alarm.gamify.R;

public class AlarmGamification extends Activity
{

	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		super.setContentView( R.layout.main );
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate( R.menu.main_menu, menu );
		return true;
	}

	protected void addAlarm( MenuItem item )
	{
		// TODO: Implement this...
	}

	protected void viewSettings( MenuItem item )
	{
		// TODO: Implement this...
	}

	protected void editAlarm( MenuItem item )
	{
		// TODO: Implement this...
	}

}