package supinternet.junkfoodd;

import android.media.Image;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.File;
import java.net.URI;

public class MainActivity extends AppCompatActivity {
    ImageView imageviewsalt;
    ImageView imageviewsugar;
    ImageView logoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageviewsalt = (ImageView) findViewById(R.id.imageView);
        imageviewsugar = (ImageView) findViewById(R.id.imageView2);
        logoview = (ImageView) findViewById(R.id.logos_view);

        Glide
                .with(this)
                .load(R.drawable.salt_home)
                .centerCrop()
                .into(imageviewsalt);

        Glide
                .with(this)
                .load(R.drawable.sugar_home)
                .centerCrop()
                .into(imageviewsugar);

        Glide
                .with(this)
                .load(R.mipmap.ic_launcher_sny)
                .fitCenter()
                .into(logoview);

        imageviewsalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Salt");
            }
        });

        imageviewsugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("sugar");
            }
        });
    }
}
