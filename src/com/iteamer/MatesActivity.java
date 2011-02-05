package com.iteamer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MatesActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mates);

		Gallery matesGallery = (Gallery) findViewById(R.id.mates_gallery);
		matesGallery.setAdapter(new MatesImageAdapter(this));

		matesGallery.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MatesActivity.this, "" + position,
						Toast.LENGTH_SHORT).show();
			}
		});

	}
}