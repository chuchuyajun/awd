package course.labs.activitylab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by marc on 10.04.2015.
 */
public class ActivityThree extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_three);


        Button launchActivityThreeButton = (Button) findViewById(R.id.buttonThree);
        launchActivityThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this,ActivityTwo.class);
                startActivity(intent);
            }
        });

    }
}
