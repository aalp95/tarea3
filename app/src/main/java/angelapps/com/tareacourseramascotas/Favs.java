package angelapps.com.tareacourseramascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Favs extends AppCompatActivity {

    ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favs);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        listaMascotas = (RecyclerView) findViewById(R.id.rvFavoritos);

        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas2();
        inicializarAdaptador2();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void inicializarAdaptador2(){
        mascotaAdaptador adaptador = new mascotaAdaptador (mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas2(){
        mascotas = new ArrayList<mascota>();

        mascotas.add(new mascota(R.drawable.gato6, "Yen", "8"));
        mascotas.add(new mascota(R.drawable.gato_4, "Gray", "7"));
        mascotas.add(new mascota(R.drawable.gato1, "Michael", "5"));
        mascotas.add(new mascota(R.drawable.gato_2, "Luz", "6"));
        mascotas.add(new mascota(R.drawable.gato7, "Sady", "7"));



    }
}
