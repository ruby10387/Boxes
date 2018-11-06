package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edlength;
    private EditText edwidth;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edlength = findViewById(R.id.ed_length);
        edwidth = findViewById(R.id.ed_width);
        edheight = findViewById(R.id.ed_height);
    }

    public void check (View view){
        String l = edlength.getText().toString();
        String w = edwidth.getText().toString();
        String h = edheight.getText().toString();
        float length = Float.parseFloat(l);
        float width = Float.parseFloat(w);
        float height = Float.parseFloat(h);
//        if (length <= 23 && width <= 14 && height <= 13){
//            Intent intent = new Intent(this,ResultActivity.class);
//            startActivity(intent);
//        }else{
//            Intent intent = new Intent(this,Result2Activity.class);
//            startActivity(intent);
//        }
      Intent intent = new Intent(this,BoxActivity.class);
      intent.putExtra("length",length);
      intent.putExtra("width",width);
      intent.putExtra("height",height);
      startActivity(intent);
    }
}
