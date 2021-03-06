package net.orbitalchainsaw.andro.yshare;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void startSearchEventActivity(View v){
		startActivity(new Intent(this, SearchResultsActivity.class));
		
	}
		
	public void startSearchPeopleActivity(View v){
		startActivity(new Intent(this, SearchResultsActivity.class));
	}
	
	public void startHistoryActivity(View v){
		startActivity(new Intent(this, SearchResultsActivity.class));
	}
	
	public void startSettingsActivity(View v){
		startActivity(new Intent(this, SearchResultsActivity.class));
	}

}
