package c.mars.backnav;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

// Using BaseActivity breaks ButterKnife - so we don't use BaseActivity
// Back will work properly if no BaseActivity is used

public class MainActivity extends FragmentActivity {

    @OnClick(R.id.next)
    protected void next(){
        startActivity(new Intent(this, A2.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

}
