package in.incognitech.androidlifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The activity is being created.
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " created", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " started", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " resumed", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " paused", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " stopped", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " restarted", Toast.LENGTH_LONG ).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Toast.makeText( this.getApplicationContext(), getResources().getText( R.string.app_name ) + " destroyed", Toast.LENGTH_LONG ).show();
    }

}
