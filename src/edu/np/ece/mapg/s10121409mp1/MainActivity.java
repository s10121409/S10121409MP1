package edu.np.ece.mapg.s10121409mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	EditText etNum;
	Button Guess;
	
	
	int myNumber = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNum = (EditText) this.findViewById(R.id.etNumber);
        Guess = (Button) this.findViewById(R.id.btGuess);
        
        Guess.setOnClickListener(
        		new OnClickListener() {

					@Override
					public void onClick(View v) {

						String str = etNum.getText().toString();
						int num = Integer.parseInt(str);
						
						if(num==myNumber)
						{String str1 = "Bingo! Correct number";
						 Toast.makeText(MainActivity.this, str1, Toast.LENGTH_SHORT).show();
						}
						else
						{String str2 = "Try Again!";
						 Toast.makeText(MainActivity.this, str2, Toast.LENGTH_SHORT).show();}
					}}
       );
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
