package com.gmail.espeniel69.mylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	SingerAdapter singerAdapter;
	EditText editText;
	EditText editText2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);

		ListView listView = (ListView) findViewById(R.id.listView);

		SingerAdapter adapter = new SingerAdapter();
		adapter.addItem(new SingerItem("소녀시대", "010-3154-2115", R.drawable.grils));
		adapter.addItem(new SingerItem("걸스데이", "010-1154-2115", R.drawable.girlsday));
		adapter.addItem(new SingerItem("여자친구", "010-2154-2115", R.drawable.girfriends));
		adapter.addItem(new SingerItem("티아라", "010-3154-2115", R.drawable.tiara));
		adapter.addItem(new SingerItem("애스터스쿨", "010-4154-2115", R.drawable.afterschool));
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
				SingerItem item = (SingerItem) adapter.getItem(i);
				Toast.makeText(getApplicationContext(), "선택 " + item.getName(), Toast.LENGTH_LONG).show();
			}
		});

		AppCompatButton button = (AppCompatButton) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String name = editText.getText().toString();
				String mobile = editText2.getText().toString();

				adapter.addItem(new SingerItem(name, mobile, R.drawable.afterschool));
				adapter.notifyDataSetChanged();
			}
		});
	}

	class SingerAdapter extends BaseAdapter {

		ArrayList<SingerItem> items = new ArrayList<SingerItem>();

		@Override
		public int getCount() {
			return items.size();
		}

		public void addItem(SingerItem item) {
			items.add(item);
		}

		@Override
		public Object getItem(int i) {
			return items.get(i);
		}

		@Override
		public long getItemId(int i) {
			return i;
		}

		@Override
		public View getView(int i, View convertView, ViewGroup viewGroup) {
			SingerItemView view = null;
			if (convertView == null) {
				view = new SingerItemView(getApplicationContext());
			} else {
				view = (SingerItemView) convertView;
			}

			SingerItem item = items.get(i);
			view.setName(item.getName());
			view.setMobile(item.getMobile());
			view.setImage(item.getResId());

			return view;
		}
	}
}