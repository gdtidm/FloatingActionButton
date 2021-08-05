package apps.gdtidm.fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabSizeMini, fabSizeNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabSizeMini     =   findViewById(R.id.fabSizeMini);
        fabSizeNormal   =   findViewById(R.id.fabSizeNormal);

        fabSizeMini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show FAB Mini Size!", Toast.LENGTH_SHORT).show();
            }
        });

        fabSizeNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show FAB Normal Size!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}