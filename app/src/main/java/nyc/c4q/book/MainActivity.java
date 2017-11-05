package nyc.c4q.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recyclerview);


        List<Book> book = new ArrayList<>();
        book.add(new Book("The Great Gatsby","F. Scott Fitzgerald",2017));
        book.add(new Book("The Grapes of Wrath","John Steinbeck",2017));
        book.add(new Book("Nineteen Eighty-Four","George Orwell",2017));
        book.add(new Book("Ulysses","James Joyce",2017));
        book.add(new Book("Lolita","Vladimir Nabokov",2017));
        book.add(new Book("Catch-22","Joseph Heller",2017));
        book.add(new Book("The Catcher in the Rye"," J. D. Salinger",2017));
        book.add(new Book("Beloved","Toni Morrison",2017));
        book.add(new Book("The Sound and the Fury"," William Faulkner",2017));
        book.add(new Book("To Kill a Mockingbird","J. R. R. Tolkien",2017));
        book.add(new Book("One Hundred Years of Solitude","Gabriel García Márquez",2017));
        book.add(new Book("Brave New World","Aldous Huxley",2017));


      BookAdapter bookAdapter = new BookAdapter(book);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        bookRecyclerView.setAdapter(bookAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);





    }
}
