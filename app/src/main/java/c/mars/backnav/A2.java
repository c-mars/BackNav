package c.mars.backnav;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.Optional;


public class A2 extends FragmentActivity {

    @OnClick(R.id.back)
    protected void back(){
        finish();
    }

    @OnClick(R.id.next)
    protected void next(){
        startActivity(new Intent(this, A3.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        ButterKnife.inject(this);
    }
}
