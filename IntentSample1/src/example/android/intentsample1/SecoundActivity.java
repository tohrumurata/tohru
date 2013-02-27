package example.android.intentsample1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SecoundActivity extends Activity {

		@Override
		  public void onCreate(Bundle savedInstanceState){
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.secoundlayout);

		    Intent data=getIntent();
		    Bundle extras = data.getExtras();

		    //付加情報から選択された値を取得
		    //式１（条件式）？式２（真）：式３（偽）の形式！

		    String disp_pict=extras !=null ?extras.getString("SELECTED_PICT"):"";
		    ImageView image = (ImageView)findViewById(R.id.fruitimage);

		    if(disp_pict.equals("Apple")){
		    image.setImageResource(R.drawable.apple);
		    }
		    else if(disp_pict.equals("Banana")){
		    image.setImageResource(R.drawable.banana);
		    }
		    else if(disp_pict.equals("Grape")){
		    image.setImageResource(R.drawable.grape);
		    }

		    Button button = (Button)findViewById(R.id.backbutton);
		    button.setOnClickListener(new ButtonClickListener());

		 }

		 class ButtonClickListener implements OnClickListener{

		   public void onClick(View v) {
		   finish();
		   }
	}
	}
