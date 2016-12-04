package angelapps.com.tareacourseramascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

import java.util.ArrayList;

/**
 * Created by angel on 25/11/2016.
 */

public class mascotaAdaptador extends RecyclerView.Adapter<mascotaAdaptador.mascotaViewHolder> {

    ArrayList<mascota> mascotas;
    Activity activity;
    int c =0;
    boolean alfa=false;

    public mascotaAdaptador(ArrayList<mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //inflar el layout y lo pasara al viewholder para que el obtenga los views
    @Override
    public mascotaAdaptador.mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new mascotaViewHolder(v);
    }


    //Asocia los elementos a cada view
    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaViewHolder, int position) {
        final mascota mascota = mascotas.get(position);
        mascotaViewHolder.foto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvCuenta.setText(mascota.getCant());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class mascotaViewHolder extends  RecyclerView.ViewHolder{

        private ImageView foto;
        private TextView tvNombre;
        private TextView tvCuenta;
        private ImageButton btnLike;
        private ImageView liked;


        public mascotaViewHolder(View itemView) {
            super(itemView);
            foto        = (ImageView)   itemView.findViewById(R.id.imgGato);
            tvNombre    = (TextView)    itemView.findViewById(R.id.tvNombre);
            tvCuenta    = (TextView)    itemView.findViewById(R.id.tvnum);
            btnLike     = (ImageButton) itemView.findViewById(R.id.btnLike);
            liked       = (ImageView)   itemView.findViewById(R.id.liked);
        }
    }

}


