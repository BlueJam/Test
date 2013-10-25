package uk.co.bimrose.android.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity implements
		AdapterView.OnItemClickListener {
	private TextView selection;
	private static final String[] items = { "lorem", "ipsum", "dolor", "sit",
			"amet", "consectetuer", "adipiscing", "elit", "morbi", "vel",
			"ligula", "vitae", "arcu", "aliquet", "mollis", "etiam", "vel",
			"erat", "placerat", "ante", "porttitor", "sodales", "pellentesque",
			"augue", "purus", "Bim", "Mon", "Mia", "Kurg", "Gramps", "Gran" };

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);
		selection = (TextView) findViewById(R.id.selection);
		GridView g = (GridView) findViewById(R.id.grid);
		g.setAdapter(new ArrayAdapter<String>(this, R.layout.cell, items));
		g.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		selection.setText(items[position]);
	}
}