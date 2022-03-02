package udb.fp180271dsm.relativeandconstraintlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class constraint_layout_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout_login);
    }

    public void salir(View v)
    {
        finish();
    }
}