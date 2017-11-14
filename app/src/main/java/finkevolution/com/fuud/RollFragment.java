package finkevolution.com.fuud;


import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RollFragment extends Fragment {
    private Button mondayBtn,tuesdayBtn,wednesdayBtn,thursdayBtn,fridayBtn,saturdayBtn,sundayBtn,
                    spinBtn,backBtn,doneBtn;
    private Button mondayLock,tuesdayLock,wednesdayLock,thursdayLock,fridayLock,saturdayLock,sundayLock;
    private TextView mondayDish,tuesdayDish,wednesdayDish,thursdayDish,fridayDish,saturdayDish,sundayDish,
                    mondayPort,tuesdayPort,wednesdayPort,thursdayPort,fridayPort,saturdayPort,sundayPort;
    private boolean monLock = false,tueLock = false,wedLock = false,thuLock = false,friLock = false,satLock = false,sunLock = false,
                    monAble = true,tueAble = true,wedAble = true,thuAble = true,friAble = true,satAble = true,sunAble = true;

    private Controller cont;

    public RollFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_roll, container, false);
        initiateViewComponents(v);
        initiateButtons();

        return v;
    }


    private void initiateViewComponents(View v){
        mondayBtn = (Button) v.findViewById(R.id.mondayButton);
        tuesdayBtn = (Button) v.findViewById(R.id.tuesdayButton);
        wednesdayBtn = (Button) v.findViewById(R.id.wednesdayButton);
        thursdayBtn = (Button) v.findViewById(R.id.thursdayButton);
        fridayBtn = (Button) v.findViewById(R.id.fridayButton);
        saturdayBtn = (Button) v.findViewById(R.id.saturdayButton);
        sundayBtn = (Button) v.findViewById(R.id.sundayButton);

        spinBtn = (Button) v.findViewById(R.id.spinButton);
        backBtn = (Button) v.findViewById(R.id.backButton);
        doneBtn = (Button) v.findViewById(R.id.finishButton);

        mondayLock = (Button) v.findViewById(R.id.mondayLock);
        tuesdayLock = (Button) v.findViewById(R.id.tuesdayLock);
        wednesdayLock = (Button) v.findViewById(R.id.wednesdayLock);
        thursdayLock = (Button) v.findViewById(R.id.thursdayLock);
        fridayLock = (Button) v.findViewById(R.id.fridayLock);
        saturdayLock = (Button) v.findViewById(R.id.saturdayLock);
        sundayLock = (Button) v.findViewById(R.id.sundayLock);

        mondayDish = (TextView) v.findViewById(R.id.mondayDish);
        tuesdayDish = (TextView) v.findViewById(R.id.tuesdayDish);
        wednesdayDish = (TextView) v.findViewById(R.id.wednesdayDish);
        thursdayDish = (TextView) v.findViewById(R.id.thursdayDish);
        fridayDish = (TextView) v.findViewById(R.id.fridayDish);
        saturdayDish = (TextView) v.findViewById(R.id.saturdayDish);
        sundayDish = (TextView) v.findViewById(R.id.sundayDish);

        mondayPort = (TextView) v.findViewById(R.id.mondayPortion);
        tuesdayPort = (TextView) v.findViewById(R.id.tuesdayPortion);
        wednesdayPort = (TextView) v.findViewById(R.id.wednesdayPortion);
        thursdayPort = (TextView) v.findViewById(R.id.thursdayPortion);
        fridayPort = (TextView) v.findViewById(R.id.fridayPortion);
        saturdayPort = (TextView) v.findViewById(R.id.saturdayPortion);
        sundayPort = (TextView) v.findViewById(R.id.sundayPortion);
    }

    private void initiateButtons(){
        mondayLock.setOnClickListener(new LockButtonListener("monday"));
        tuesdayLock.setOnClickListener(new LockButtonListener("tuesday"));
        wednesdayLock.setOnClickListener(new LockButtonListener("wednesday"));
        thursdayLock.setOnClickListener(new LockButtonListener("thursday"));
        fridayLock.setOnClickListener(new LockButtonListener("friday"));
        saturdayLock.setOnClickListener(new LockButtonListener("saturday"));
        sundayLock.setOnClickListener(new LockButtonListener("sunday"));

        mondayBtn.setOnClickListener(new DayButtonListener("monday"));
        tuesdayBtn.setOnClickListener(new DayButtonListener("tuesday"));
        wednesdayBtn.setOnClickListener(new DayButtonListener("wednesday"));
        thursdayBtn.setOnClickListener(new DayButtonListener("thursday"));
        fridayBtn.setOnClickListener(new DayButtonListener("friday"));
        saturdayBtn.setOnClickListener(new DayButtonListener("saturday"));
        sundayBtn.setOnClickListener(new DayButtonListener("sunday"));

        spinBtn.setOnClickListener(new SpinButtonListener());
    }

    public void changeDayDish(String day){

        switch(day){
            case "monday":
                mondayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "tuesday":
                tuesdayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "wednesday":
                wednesdayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "thursday":
                thursdayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "friday":
                fridayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "saturday":
                saturdayDish.setText(cont.getRandomDish().getDishName());
                break;

            case "sunday":
                sundayDish.setText(cont.getRandomDish().getDishName());
                break;

        }
    }

    public void changeDayPortion(String day, int portion){

        switch(day){
            case "monday":

                break;

            case "tuesday":

                break;

            case "wednesday":

                break;

            case "thursday":

                break;

            case "friday":

                break;

            case "saturday":

                break;

            case "sunday":

                break;

        }

    }

    public void lockDay(String day){

        switch(day){
            case "monday":

                if(monLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    mondayLock.setBackground(background);
                    mondayLock.setText("✘");
                    monLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    mondayLock.setBackground(background);
                    mondayLock.setText("✔");
                    monLock = true;
                }

                break;

            case "tuesday":

                if(tueLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    tuesdayLock.setBackground(background);
                    tuesdayLock.setText("✘");
                    tueLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    tuesdayLock.setBackground(background);
                    tuesdayLock.setText("✔");
                    tueLock = true;
                }

                break;

            case "wednesday":

                if(wedLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    wednesdayLock.setBackground(background);
                    wednesdayLock.setText("✘");
                    wedLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    wednesdayLock.setBackground(background);
                    wednesdayLock.setText("✔");
                    wedLock = true;
                }

                break;

            case "thursday":

                if(thuLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    thursdayLock.setBackground(background);
                    thursdayLock.setText("✘");
                    thuLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    thursdayLock.setBackground(background);
                    thursdayLock.setText("✔");
                    thuLock = true;
                }

                break;

            case "friday":

                if(friLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    fridayLock.setBackground(background);
                    fridayLock.setText("✘");
                    friLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    fridayLock.setBackground(background);
                    fridayLock.setText("✔");
                    friLock = true;
                }

                break;

            case "saturday":

                if(satLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    saturdayLock.setBackground(background);
                    saturdayLock.setText("✘");
                    satLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    saturdayLock.setBackground(background);
                    saturdayLock.setText("✔");
                    satLock = true;
                }

                break;

            case "sunday":

                if(sunLock == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    sundayLock.setBackground(background);
                    sundayLock.setText("✘");
                    sunLock = false;
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    sundayLock.setBackground(background);
                    sundayLock.setText("✔");
                    sunLock = true;
                }

                break;

        }
    }

    public void ableDay(String day){

        switch(day){
            case "monday":


                if(monAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    mondayBtn.setBackground(background);
                    monAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    mondayLock.setBackground(lockBack);
                    mondayLock.setText("✔");
                    mondayLock.setClickable(false);
                    monLock = true;
                    mondayDish.setText("----------");
                    mondayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    mondayBtn.setBackground(background);
                    monAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    mondayLock.setBackground(lockBack);
                    mondayLock.setText("✘");
                    mondayLock.setClickable(true);
                    monLock = false;
                }


                break;

            case "tuesday":

                if(tueAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    tuesdayBtn.setBackground(background);
                    tueAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    tuesdayLock.setBackground(lockBack);
                    tuesdayLock.setText("✔");
                    tuesdayLock.setClickable(false);
                    tueLock = true;
                    tuesdayDish.setText("----------");
                    tuesdayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    tuesdayBtn.setBackground(background);
                    tueAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    tuesdayLock.setBackground(lockBack);
                    tuesdayLock.setText("✘");
                    tuesdayLock.setClickable(true);
                    tueLock = false;
                }

                break;

            case "wednesday":

                if(wedAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    wednesdayBtn.setBackground(background);
                    wedAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    wednesdayLock.setBackground(lockBack);
                    wednesdayLock.setText("✔");
                    wednesdayLock.setClickable(false);
                    wedLock = true;
                    wednesdayDish.setText("----------");
                    wednesdayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    wednesdayBtn.setBackground(background);
                    wedAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    wednesdayLock.setBackground(lockBack);
                    wednesdayLock.setText("✘");
                    wednesdayLock.setClickable(true);
                    wedLock = false;
                }

                break;

            case "thursday":

                if(thuAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    thursdayBtn.setBackground(background);
                    thuAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    thursdayLock.setBackground(lockBack);
                    thursdayLock.setText("✔");
                    thursdayLock.setClickable(false);
                    thuLock = true;
                    thursdayDish.setText("----------");
                    thursdayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    thursdayBtn.setBackground(background);
                    thuAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    thursdayLock.setBackground(lockBack);
                    thursdayLock.setText("✘");
                    thursdayLock.setClickable(true);
                    thuLock = false;
                }

                break;

            case "friday":

                if(friAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    fridayBtn.setBackground(background);
                    friAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    fridayLock.setBackground(lockBack);
                    fridayLock.setText("✔");
                    fridayLock.setClickable(false);
                    friLock = true;
                    fridayDish.setText("----------");
                    fridayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    fridayBtn.setBackground(background);
                    friAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    fridayLock.setBackground(lockBack);
                    fridayLock.setText("✘");
                    fridayLock.setClickable(true);
                    friLock = false;
                }

                break;

            case "saturday":

                if(satAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    saturdayBtn.setBackground(background);
                    satAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    saturdayLock.setBackground(lockBack);
                    saturdayLock.setText("✔");
                    saturdayLock.setClickable(false);
                    satLock = true;
                    saturdayDish.setText("----------");
                    saturdayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    saturdayBtn.setBackground(background);
                    satAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    saturdayLock.setBackground(lockBack);
                    saturdayLock.setText("✘");
                    saturdayLock.setClickable(true);
                    satLock = false;
                }

                break;

            case "sunday":

                if(sunAble == true){
                    Drawable background = getResources().getDrawable( R.drawable.redborder );
                    sundayBtn.setBackground(background);
                    sunAble = false;
                    Drawable lockBack = getResources().getDrawable( R.drawable.roundcornerday );
                    sundayLock.setBackground(lockBack);
                    sundayLock.setText("✔");
                    sundayLock.setClickable(false);
                    sunLock = true;
                    sundayDish.setText("----------");
                    sundayPort.setText("----------");
                }else{
                    Drawable background = getResources().getDrawable( R.drawable.roundcornerday );
                    sundayBtn.setBackground(background);
                    sunAble = true;
                    Drawable lockBack = getResources().getDrawable( R.drawable.redborder );
                    sundayLock.setBackground(lockBack);
                    sundayLock.setText("✘");
                    sundayLock.setClickable(true);
                    sunLock = false;
                }

                break;

        }
    }

    public void setController(Controller cont){
        this.cont = cont;
    }


    private class LockButtonListener implements View.OnClickListener{
        private String day;

        public LockButtonListener(String day){
            this.day = day;
        }

        @Override
        public void onClick(View view) {
            lockDay(day);
        }
    }


    private class DayButtonListener implements View.OnClickListener{
        private String day;

        public DayButtonListener(String day){
            this.day = day;
        }
        @Override
        public void onClick(View view) {
            ableDay(day);
        }
    }

    private class SpinButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            if(monAble && !monLock){
                changeDayDish("monday");
            }

            if(tueAble && !tueLock){
                changeDayDish("tuesday");
            }

            if(wedAble && !wedLock){
                changeDayDish("wednesday");
            }

            if(thuAble && !thuLock){
                changeDayDish("thursday");
            }

            if(friAble && !friLock){
                changeDayDish("friday");
            }

            if(satAble && !satLock){
                changeDayDish("saturday");
            }

            if(sunAble && !sunLock){
                changeDayDish("sunday");
            }



        }
    }

}
