package finkevolution.com.fuud;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    private Controller cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        cont = new Controller(this);
    }


    public void setFragment(Fragment fragment, boolean backstack) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //  ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_out_right);
        ft.replace(R.id.mainLayout, fragment, "MainFrag");
        if (backstack) {
            ft.addToBackStack(null);
        }
        ft.commit();
    }

}
