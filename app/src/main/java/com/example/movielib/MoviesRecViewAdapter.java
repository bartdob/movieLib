package com.example.movielib;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecViewAdapter extends RecyclerView.Adapter<MoviesRecViewAdapter.ViewHolder> {
    private static final String TAG = "MoviesRecViewAdapter";

    private ArrayList<Movie> movies = new ArrayList<>();
    private Context context;

    public MoviesRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_movie_view, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.movieName.setText(movies.get(position).getName());
        holder.movieName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, movies.get(position).getName() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView movieImage;
        private TextView movieName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            movieImage = (ImageView) itemView.findViewById(R.id.movieImage);
            movieName = (TextView) itemView.findViewById(R.id.movieName);

        }
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }
}
