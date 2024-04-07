package yana.geo.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private ArrayList<Notes>notes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recycleViewNotes);
        notes.add(new Notes("Lunch", "Chicken soup", "Saturday", 1));
        notes.add(new Notes("Lunch", "Pepper steak", "Saturday", 2));
        notes.add(new Notes("Dinner", "Tomato salad", "Saturday", 1));
        notes.add(new Notes("Dinner", "Pizza", "Saturday", 2));
        notes.add(new Notes("Lunch", "Vegetable soup", "Sunday", 1));
        notes.add(new Notes("Lunch", "Chicken and fish", "Sunday", 2));
        notes.add(new Notes("Dinner", "Caesar salad", "Sunday", 1));
        notes.add(new Notes("Dinner", "Spaghetti bolognese", "Sunday", 2));

        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);
    }
}