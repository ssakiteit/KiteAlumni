package com.example.kitealumni;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
public class facultyreg extends Activity {
	Button signup;
	String dept,gender;
    private Spinner spinner1;
    private Spinner spinner2;
    private static final String[] paths = {"Select department","IT", "CSE", "ECE","MECH","CIVIL"};
    //private static final String[] paths1 = {"Year of Passing","2013","2014", "2015","2016","2017"};
    private static final String[] paths1 = {"Gender","Male","Female"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factultyreg);
        signup=(Button)findViewById(R.id.button1);
        signup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(facultyreg.this, login.class);
		        startActivity(intent);	
			}
		});
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(facultyreg.this, android.R.layout.simple_spinner_item, paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gender = paths[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(facultyreg.this, android.R.layout.simple_spinner_item, paths1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                dept = paths1[position];
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        

	
	}
	


}