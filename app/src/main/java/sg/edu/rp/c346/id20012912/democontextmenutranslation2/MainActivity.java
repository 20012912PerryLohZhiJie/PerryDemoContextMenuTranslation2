package sg.edu.rp.c346.id20012912.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView tvTranslatedText;
    String wordClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.English);
        registerForContextMenu(tvTranslatedText);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main2, menu);

        if (v == tvTranslatedText)
        {
            wordClicked = "hello";
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.English)
        {
            Toast.makeText(MainActivity.this, "English selected", Toast.LENGTH_LONG).show();
            if (wordClicked.equalsIgnoreCase("hello"))
            {
                tvTranslatedText.setText("Hello");
            }

            return true;

        }

        else if (item.getItemId() == R.id.Italian)
        {
            Toast.makeText(MainActivity.this, "Italian selected", Toast.LENGTH_LONG).show();

            if (wordClicked.equalsIgnoreCase("hello"))
            {
                tvTranslatedText.setText("Ciao");
            }
        }

        return super.onContextItemSelected(item);
    }

}