package com.winraguini.tipcalculator;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText etBillAmount;
	TextView tvTipAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvTipAmount = (TextView)findViewById(R.id.tvTipAmount);		
		etBillAmount = (EditText)findViewById(R.id.etBillAmount);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void calculate10PercentTip(View v) {
		if (etBillAmount.getText().length() > 0) {
			double billAmt= Double.parseDouble(etBillAmount.getText().toString());				
			tvTipAmount.setText(tipForAmtString(.1, billAmt));
		}
	}
	
	public void calculate15PercentTip(View v) {
		if (etBillAmount.getText().length() > 0) {
			double billAmt= Double.parseDouble(etBillAmount.getText().toString());				
			tvTipAmount.setText(tipForAmtString(.15, billAmt));
		}
	}
	
	public void calculate20PercentTip(View v) {
		if (etBillAmount.getText().length() > 0) {
			double billAmt= Double.parseDouble(etBillAmount.getText().toString());				
			tvTipAmount.setText(tipForAmtString(.2, billAmt));
		}
	}
	
	public String tipForAmtString(double tipPercentage, double amount) {
		double tipAmt = amount * tipPercentage;		
		return String.format(Locale.getDefault(), "$ %.2f", tipAmt);
	}

}
