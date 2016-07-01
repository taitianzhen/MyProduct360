package my360.liushuxin.example.com.myproduct360;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_news_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_news_id = (TextView)findViewById(R.id.tv_news_id);
    }
    public void option(View view){
        Toast.makeText(this,"这是honinChen新添加的按钮功能",Toast.LENGTH_LONG);
    }
}
