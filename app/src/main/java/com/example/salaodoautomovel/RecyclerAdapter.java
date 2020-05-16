package com.example.salaodoautomovel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<Carro> carroList;

    public RecyclerAdapter(List<Carro> carroList) {
        this.carroList = carroList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
            holder.textFabricacaoValor.setText(this.carroList.get(position).getFabricacao());
            holder.textPotenciaValor.setText(this.carroList.get(position).getPotencia() + " cavalos");
            holder.imagem_background.setImageResource(this.carroList.get(position).getImagem());
            holder.textModelo.setText(this.carroList.get(position).getModelo());
    }

    @Override
    public int getItemCount() {
        return this.carroList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imagem_background;
        TextView textPotenciaValor;
        TextView textFabricacaoValor;
        TextView textModelo;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imagem_background = itemView.findViewById(R.id.image_background);
            this.textPotenciaValor = itemView.findViewById(R.id.textPotenciaValor);
            this.textFabricacaoValor = itemView.findViewById(R.id.textFabricacaoValor);
            this.textModelo = itemView.findViewById(R.id.textModelo);
        }
    }
}
