package ubo.oussama.iotmatrixcontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button h,b,d,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=findViewById(R.id.buttonH);
        b=findViewById(R.id.buttonB);
        d=findViewById(R.id.buttonD);
        g=findViewById(R.id.buttonG);

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference MyRef=database.getReference("direction");
                DatabaseReference isChanged=database.getReference("isChanged");
                MyRef.setValue("h");
                isChanged.setValue(true);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference MyRef=database.getReference("direction");
                DatabaseReference isChanged=database.getReference("isChanged");
                isChanged.setValue(true);
                MyRef.setValue("b");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference MyRef=database.getReference("direction");
                MyRef.setValue("d");
                DatabaseReference isChanged=database.getReference("isChanged");
                isChanged.setValue(true);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference MyRef=database.getReference("direction");
                MyRef.setValue("g");
                DatabaseReference isChanged=database.getReference("isChanged");
                isChanged.setValue(true);
            }
        });


    }
}