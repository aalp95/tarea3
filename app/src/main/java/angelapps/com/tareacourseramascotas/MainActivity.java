package angelapps.com.tareacourseramascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();




    }

    public void inicializarAdaptador(){
        mascotaAdaptador adaptador = new mascotaAdaptador (mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<mascota>();

        mascotas.add(new mascota(R.drawable.gato1, "Michael", "5"));
        mascotas.add(new mascota(R.drawable.gato_2, "Luz", "6"));
        mascotas.add(new mascota(R.drawable.gato_3, "Mimi", "4"));
        mascotas.add(new mascota(R.drawable.gato_4, "Gray", "7"));
        mascotas.add(new mascota(R.drawable.gato5, "Nau", "5"));
        mascotas.add(new mascota(R.drawable.gato6, "Yen", "8"));
        mascotas.add(new mascota(R.drawable.gato7, "Sady", "7"));
        mascotas.add(new mascota(R.drawable.gato8, "Angie", "4"));


    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.mascotas, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Favs:
                startActivity(new Intent(getApplicationContext(),Favs.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
