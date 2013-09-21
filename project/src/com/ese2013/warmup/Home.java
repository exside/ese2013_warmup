package com.ese2013.warmup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Home extends Activity {

	public final static String EXTRA_MESSAGE = "com.ese2013.warmup.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	/** Called when the user clicks the submit button */
	public void sendText(View view) {
	    Intent intent = new Intent(this, DisplayText.class);
	    EditText textfield = (EditText) findViewById(R.id.form_textfield_text);
	    String text = textfield.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, text);
	    startActivity(intent);
	}

}
