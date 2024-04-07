package yana.geo.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter <NotesAdapter.NotesViewHolder>{


    private ArrayList<Notes>notes;

    public NotesAdapter(ArrayList<Notes> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notes_item, viewGroup, false);
       return  new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder notesViewHolder, int i) {

        Notes note = notes.get (i);
        notesViewHolder.textViewDayMeal.setText(note.getDayMeal());
        notesViewHolder.textViewDishTitle.setText(note.getDishTitle());
        notesViewHolder.textViewDayOfWeek.setText(note.getDayOfWeek());
        int colorId;
        int priority = note.getDishOrder();
        switch (priority){
            case 1:
                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_green_light);
                break;
            case 2:
                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_orange_light);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + priority);
        }
        notesViewHolder.textViewDayMeal.setBackgroundColor(colorId);


    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {

      private TextView textViewDayMeal;
      private TextView textViewDishTitle;
      private TextView textViewDayOfWeek;
      private TextView textViewDishOrder;

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDayMeal = itemView.findViewById(R.id.textViewDayMeal);
            textViewDishTitle = itemView.findViewById(R.id.textViewDishTitle);
            textViewDayOfWeek = itemView.findViewById(R.id.textViewDayOfWeek);

        }
    }
}
