package com.androidtracks.switchbuttonexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Switch mySwith;
	
	private TextView tvState;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mySwith = (Switch) findViewById(R.id.mySwitch);
		
		tvState = (TextView) findViewById(R.id.tvState);
		
		mySwith.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if (isChecked) {
					
					tvState.setText("The Switch is ON");
					
					Toast.makeText(getApplicationContext(), "The Switch is ON", Toast.LENGTH_SHORT).show();
					
                } else {
                	
                	tvState.setText("The Switch is OFF");
                	
                	Toast.makeText(getApplicationContext(), "The Switch is OFF", Toast.LENGTH_SHORT).show();
                }
				
			}
			
			
		});
		
	}
}
