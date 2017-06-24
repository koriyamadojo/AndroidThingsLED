package takeda.thingssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView tvReslt;

    //画面作成
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton btnRed = (ToggleButton) findViewById(R.id.tbRed);
        btnRed.setOnCheckedChangeListener(
                new RedClickedChangeListener());





        ToggleButton btnBlue = (ToggleButton) findViewById(R.id.tbBlue);
        btnBlue.setOnCheckedChangeListener(new BlueClickedChangeListener());

        ToggleButton btnGreen = (ToggleButton) findViewById(R.id.tbGreen);
        btnGreen.setOnCheckedChangeListener(new GreenClickedChangeListener());

        ToggleButton btnWhite = (ToggleButton) findViewById(R.id.tbWhite);
        btnWhite.setOnCheckedChangeListener(new WhiteClickedChangeListener());

        tvReslt = (TextView)findViewById(R.id.tvResult);




    }

    //画面終了
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    class RedClickedChangeListener implements
            CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                //ON
                tvReslt.setText("RED LIGHT UP");
            }else{
                //OFF
                tvReslt.setText("RED LIGHT DOWN");
            }

        }
    }






    class BlueClickedChangeListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                //ON
                tvReslt.setText("Blue LIGHT UP");
            }else{
                //OFF
                tvReslt.setText("Blue LIGHT DOWN");
            }
        }
    }
    class GreenClickedChangeListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                //ON
                tvReslt.setText("Green LIGHT UP");
            }else{
                //OFF
                tvReslt.setText("Green LIGHT DOWN");
            }
        }
    }
    class WhiteClickedChangeListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                //ON
                tvReslt.setText("White LIGHT UP");
            }else{
                //OFF
                tvReslt.setText("White LIGHT DOWN");
            }
        }
    }

}
