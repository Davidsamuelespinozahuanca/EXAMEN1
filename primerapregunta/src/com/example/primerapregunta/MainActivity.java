package com.example.primerapregunta;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public double V1, V2, V3;
	public EditText qV1, qV2, qV3;
	public TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qV1 = (EditText) findViewById(R.id.editText1);
        qV2 = (EditText) findViewById(R.id.editText2);
        qV3 = (EditText) findViewById(R.id.editText3);
        Resultado = (TextView) findViewById(R.id.textView2);
    }
    public void multiplicacion (View View){
    	V1 = Double.parseDouble(qV1.getText().toString());
    	V2 = Double.parseDouble(qV2.getText().toString());
    	V3 = Double.parseDouble(qV3.getText().toString());
    	Resultado.setText(Double.toString(V1*V2*V3));
    	
    	}
    public void cancelar(View View){
    	qV1.setText(" ");
		qV2.setText(" ");
		qV3.setText(" ");
		Resultado.setText(" ");
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
