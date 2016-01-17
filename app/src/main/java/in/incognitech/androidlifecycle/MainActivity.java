package in.incognitech.androidlifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " created", Toast.LENGTH_LONG ).show();
        super.onCreate(savedInstanceState);
        // The activity is being created.
    }

    @Override
    protected void onStart() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " started", Toast.LENGTH_LONG ).show();
        super.onStart();
        // The activity is about to become visible.
    }

    @Override
    protected void onResume() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " resumed", Toast.LENGTH_LONG ).show();
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }

    @Override
    protected void onPause() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " paused", Toast.LENGTH_LONG ).show();
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }

    @Override
    protected void onStop() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " stopped", Toast.LENGTH_LONG ).show();
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onRestart() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " restarted", Toast.LENGTH_LONG ).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " destroyed", Toast.LENGTH_LONG ).show();
        super.onDestroy();
        // The activity is about to be destroyed.
    }

}
