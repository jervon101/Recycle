package nyc.c4q.book;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jervon.arnoldd on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView author;
    private TextView publishingYear;

    public BookViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.book_title_textview);
        author = (TextView) itemView.findViewById(R.id.book_author_textview);
        publishingYear = (TextView) itemView.findViewById(R.id.book_year_textview);
    }



    public void onBind(Book book){
        title.setText("Title: " + book.getTitle());
        author.setText("Director: " + book.getAuthor());
        publishingYear.setText("Year: " + book.getPublishingYear());
    }
}
