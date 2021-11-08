package simple.app.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        int id = getIntent().getIntExtra("ID",-1);
        ListView listView = findViewById(R.id.listView);
        List<String> stringList = new ArrayList<>();
        stringList.add(new String("Exercise 1"));
        stringList.add(new String("Exercise 2"));
        stringList.add(new String("Exercise 3"));
        stringList.add(new String("Exercise 4"));
        stringList.add(new String("Exercise 5"));
        listView.setAdapter(new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1,stringList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListActivity.this,DetailsActivity.class);
                intent.putExtra("ID",id);
                intent.putExtra("Position",i);
                startActivity(intent);
            }
        });

        Button back = findViewById(R.id.back_Button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}