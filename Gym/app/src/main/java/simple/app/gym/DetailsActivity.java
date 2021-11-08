package simple.app.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        int id = getIntent().getIntExtra("ID", -1);
        int position = getIntent().getIntExtra("Position", 0);
        ImageView imageView = findViewById(R.id.detailsImage);
        switch (id) {
            case 0:
                switch (position) {
                    case 0:
                        Glide.with(DetailsActivity.this).load(R.drawable.leg1).into(imageView);
                        break;
                    case 1:
                        Glide.with(DetailsActivity.this).load(R.drawable.leg2).into(imageView);
                        break;
                    case 2:
                        Glide.with(DetailsActivity.this).load(R.drawable.leg3).into(imageView);
                        break;
                    case 3:
                        Glide.with(DetailsActivity.this).load(R.drawable.leg4).into(imageView);
                        break;
                    case 4:
                        Glide.with(DetailsActivity.this).load(R.drawable.leg5).into(imageView);
                        break;
                }
                break;
            case 1:
                switch (position) {
                    case 0:
                        Glide.with(DetailsActivity.this).load(R.drawable.chest1).into(imageView);
                        break;
                    case 1:
                        Glide.with(DetailsActivity.this).load(R.drawable.chest2).into(imageView);
                        break;
                    case 2:
                        Glide.with(DetailsActivity.this).load(R.drawable.chest3).into(imageView);
                        break;
                    case 3:
                        Glide.with(DetailsActivity.this).load(R.drawable.chest4).into(imageView);
                        break;
                    case 4:
                        Glide.with(DetailsActivity.this).load(R.drawable.chest5).into(imageView);
                        break;
                }
                break;
            case 2:
                switch (position) {
                    case 0:
                        Glide.with(DetailsActivity.this).load(R.drawable.back1).into(imageView);
                        break;
                    case 1:
                        Glide.with(DetailsActivity.this).load(R.drawable.back2).into(imageView);
                        break;
                    case 2:
                        Glide.with(DetailsActivity.this).load(R.drawable.back3).into(imageView);
                        break;
                    case 3:
                        Glide.with(DetailsActivity.this).load(R.drawable.back4).into(imageView);
                        break;
                    case 4:
                        Glide.with(DetailsActivity.this).load(R.drawable.back5).into(imageView);
                        break;
                }
                break;
            case 3:
                switch (position) {
                    case 0:
                        Glide.with(DetailsActivity.this).load(R.drawable.bi1).into(imageView);
                        break;
                    case 1:
                        Glide.with(DetailsActivity.this).load(R.drawable.bi2).into(imageView);
                        break;
                    case 2:
                        Glide.with(DetailsActivity.this).load(R.drawable.bi3).into(imageView);
                        break;
                    case 3:
                        Glide.with(DetailsActivity.this).load(R.drawable.bi4).into(imageView);
                        break;
                    case 4:
                        Glide.with(DetailsActivity.this).load(R.drawable.bi5).into(imageView);
                        break;
                }
                break;
        }

        Button back = findViewById(R.id.back_Button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}