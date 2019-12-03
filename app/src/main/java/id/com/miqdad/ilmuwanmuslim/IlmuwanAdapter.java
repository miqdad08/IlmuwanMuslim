package id.com.miqdad.ilmuwanmuslim;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class IlmuwanAdapter extends RecyclerView.Adapter<IlmuwanAdapter.IlmuwanHolder> {

    private ArrayList<ModelIlmuwan> list;

    public IlmuwanAdapter(ArrayList<ModelIlmuwan> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public IlmuwanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new IlmuwanHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IlmuwanHolder ilmuwanHolder, int i) {
        ilmuwanHolder.bindView(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class IlmuwanHolder extends RecyclerView.ViewHolder {
        private TextView Judul;
        private CircleImageView ivLogo;
        private String idJudul;
        public IlmuwanHolder(@NonNull View itemView) {
            super(itemView);
            Judul = itemView.findViewById(R.id.textJudul);
            ivLogo = itemView.findViewById(R.id.ivLogo);
        }

        private void bindView(ModelIlmuwan data)  {
            ivLogo.setImageResource(data.getGambar());
            Judul.setText(data.getJudul());
            idJudul = data.getIdJudul();
            final String idIlmu = data.getIdJudul();


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(),DetailActivity.class)
                    .putExtra(DetailActivity.KEY_ILMU, idIlmu));
                }
            });

        }
    }
}

